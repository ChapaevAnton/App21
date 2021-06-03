package com.w4eret1ckrtb1tch.app21

import android.os.Bundle
import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar

class MainActivity_21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        //create ViewPager2
//        val viewPagerAdapter = ViewPagerAdapter() //создаем адаптер
//        val viewPager = findViewById<ViewPager2>(R.id.main_view_pager) //находим viewpager на макете
//        viewPager.apply { orientation = ViewPager2.ORIENTATION_VERTICAL } //вертикальное перелистование
//        viewPager.adapter = viewPagerAdapter //задаем viewpager раннее созданный адаптер
//
//        //создаем список элементов
//        val viewPagerList = mutableListOf<ViewPageItem>(
//            ViewPageItem("red", ContextCompat.getColor(this, R.color.red)),
//            ViewPageItem("blue", ContextCompat.getColor(this, R.color.blue)),
//            ViewPageItem("black", ContextCompat.getColor(this, R.color.black))
//        )
//
//        viewPagerAdapter.setItems(viewPagerList)
//
//        //эффект перелистывания
//        viewPager.setPageTransformer { pager, position ->
//            val pagerWidth = pager.width
//            pager.findViewById<TextView>(R.id.text_info).rotationX = position * (pagerWidth / 2)
//        }
//
//        //callback for viewpager
//        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
//            override fun onPageScrolled(
//                position: Int,
//                positionOffset: Float,
//                positionOffsetPixels: Int
//            ) {
//                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
//                //метод возвращает позицию и скролл
//            }
//
//            override fun onPageSelected(position: Int) {
//                super.onPageSelected(position)
//                //метод возвращает текущую страницу
//            }
//
//            override fun onPageScrollStateChanged(state: Int) {
//                super.onPageScrollStateChanged(state)
//                //методе можем проверять состояние ViewPager
//
//            }
//        })


//        //set style to button
//        val relativeContainer = findViewById<RelativeLayout>(R.id.relativeContainer)
//        val button = findViewById<Button>(R.id.button)
//        button.setOnClickListener {
//            val btn = Button(ContextThemeWrapper(this,R.style.RoundButton))
//            btn.apply { text="my button" }
//            relativeContainer.removeAllViews()
//            relativeContainer.addView(btn)
//        }
//
//        //selected dark mode
//        val buttonToggle = findViewById<ToggleButton>(R.id.buttonToggle)
//        buttonToggle.setOnCheckedChangeListener { _, isChecked ->
//            if (isChecked) AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
//            else
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
//        }
//
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
                                this@MainActivity_21,
                                menuItem.itemId.toString(),
                                Toast.LENGTH_LONG
                            ).show()
                            true
                        }
                        R.id.main_activity_top_bar_favorites -> {
                            Toast.makeText(
                                this@MainActivity_21,
                                menuItem.itemId.toString(),
                                Toast.LENGTH_LONG
                            ).show()
                            true
                        }
                        R.id.main_activity_top_bar_more -> {
                            Toast.makeText(
                                this@MainActivity_21,
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