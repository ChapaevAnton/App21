package com.w4eret1ckrtb1tch.app21

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity_22 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rocket_start)

        val rocket = findViewById<ImageView>(R.id.rocket)
        val startRocket = AnimationUtils.loadAnimation(this, R.anim.animation_start_rocket)
        rocket.setOnClickListener {
            it.startAnimation(startRocket)
        }


//        val buttonRun = findViewById<Button>(R.id.button_run)
//        val buttonTranslate = findViewById<Button>(R.id.button_translate)
//        val buttonScale = findViewById<Button>(R.id.button_scale)
//        val buttonRotate = findViewById<Button>(R.id.button_rotate)
//        val animationTranslate = AnimationUtils.loadAnimation(this, R.anim.animation_translate)
//        val animationScale = AnimationUtils.loadAnimation(this, R.anim.animation_scale)
//        val animationRotate = AnimationUtils.loadAnimation(this, R.anim.animation_rotate)
//
//        buttonRun.setOnClickListener {
//            buttonTranslate.startAnimation(animationTranslate)
//            buttonScale.startAnimation(animationScale)
//            buttonRotate.startAnimation(animationRotate)
//        }

    }
}