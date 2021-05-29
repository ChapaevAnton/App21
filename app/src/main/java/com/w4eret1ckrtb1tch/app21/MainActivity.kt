package com.w4eret1ckrtb1tch.app21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //set style to button
        val relativeContainer = findViewById<RelativeLayout>(R.id.relativeContainer)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val btn = Button(ContextThemeWrapper(this,R.style.RoundButton))
            btn.apply { text="my button" }
            relativeContainer.removeAllViews()
            relativeContainer.addView(btn)
        }

        //selected dark mode
        val buttonToggle = findViewById<ToggleButton>(R.id.buttonToggle)
        buttonToggle.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            else
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }

        //Regular top app bar
        val topAppBar = findViewById<MaterialToolbar>(R.id.topAppBar)
        topAppBar.setOnClickListener {
            Toast.makeText(this, "Главной меню", Toast.LENGTH_LONG).show()
        }

        topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.main_activity_top_bar_favorites -> {
                    Toast.makeText(this, it.itemId.toString(), Toast.LENGTH_LONG).show()
                    true
                }

                R.id.main_activity_top_bar_search -> {
                    Toast.makeText(this, it.itemId.toString(), Toast.LENGTH_LONG).show()
                    true
                }

                R.id.main_activity_top_bar_more -> {
                    Toast.makeText(this, it.itemId.toString(), Toast.LENGTH_LONG).show()
                    true
                }
                else -> false
            }
        }


        //Contextual action bar
        val textView = findViewById<TextView>(R.id.main_activity_text_view)
        var actionMode: ActionMode? = null

        textView.setOnLongClickListener {

            if (actionMode != null) return@setOnLongClickListener false

            val callback = object : ActionMode.Callback {

                override fun onCreateActionMode(p0: ActionMode?, menu: Menu?): Boolean {
                    p0?.menuInflater?.inflate(R.menu.top_app_bar, menu)
                    p0?.title = getString(R.string.contextual_bar)
                    return true
                }

                override fun onPrepareActionMode(p0: ActionMode?, p1: Menu?): Boolean {
                    return false
                }

                override fun onActionItemClicked(p0: ActionMode?, menuItem: MenuItem?): Boolean {
                    return when (menuItem?.itemId) {

                        R.id.main_activity_top_bar_search -> {
                            Toast.makeText(
                                this@MainActivity,
                                menuItem.itemId.toString(),
                                Toast.LENGTH_LONG
                            ).show()
                            true
                        }
                        R.id.main_activity_top_bar_favorites -> {
                            Toast.makeText(
                                this@MainActivity,
                                menuItem.itemId.toString(),
                                Toast.LENGTH_LONG
                            ).show()
                            true
                        }
                        R.id.main_activity_top_bar_more -> {
                            Toast.makeText(
                                this@MainActivity,
                                menuItem.itemId.toString(),
                                Toast.LENGTH_LONG
                            ).show()
                            true
                        }
                        else -> false
                    }
                }

                override fun onDestroyActionMode(p0: ActionMode?) {
                    actionMode = null

                }

            }

            actionMode = startActionMode(callback)

            return@setOnLongClickListener true
        }

    }
}