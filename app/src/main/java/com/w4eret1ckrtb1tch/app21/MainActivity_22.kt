package com.w4eret1ckrtb1tch.app21

import android.animation.Animator
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity_22 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rocket_start)

        val rocket = findViewById<ImageView>(R.id.rocket)
        val startRocketButton = findViewById<Button>(R.id.start_rocket)

        val startRocketAnimation = AnimationUtils.loadAnimation(this, R.anim.animation_start_rocket)
        rocket.setOnClickListener {
            it.startAnimation(startRocketAnimation)
        }


        startRocketButton.setOnClickListener {

            //ObjectValue method
            ObjectAnimator.ofFloat(rocket, View.TRANSLATION_Y, 0f, -500f).apply {
                repeatMode = ObjectAnimator.REVERSE
                repeatCount = 1
                duration = 3000
                addListener(object : Animator.AnimatorListener {
                    override fun onAnimationStart(animation: Animator?) {}

                    override fun onAnimationEnd(animation: Animator?) {
                        Toast.makeText(
                            this@MainActivity_22,
                            "Удачна посадка",
                            Toast.LENGTH_SHORT
                        ).apply {
                            setGravity(Gravity.CENTER, 0, 0)
                            show()
                        }

                    }

                    override fun onAnimationCancel(animation: Animator?) {}

                    override fun onAnimationRepeat(animation: Animator?) {}

                })
                start()
            }


            //ValueAnimator method
//            val valueAnimator = ValueAnimator.ofFloat(0f, -500f)
//            valueAnimator.apply {
//                addUpdateListener { rocket.translationY = it.animatedValue as Float }
//                repeatMode = ValueAnimator.REVERSE
//                repeatCount = 1
//                duration = 3000
//                start()
//            }

        }

// TODO: 06.06.2021 22.2

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