package com.w4eret1ckrtb1tch.app21

import android.animation.*
import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.view.animation.*
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.size
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator

class MainActivity_22 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_transition)

        // TODO: 13.06.2021 22.7. LayoutTransition
        val add = findViewById<Button>(R.id.add)
        val delete = findViewById<Button>(R.id.delete)
        val container = findViewById<LinearLayout>(R.id.linear_container).apply {


// TODO: 13.06.2021 Как задать разные анимации на добавление и удаление??? Задание 22.7.1

           layoutTransition.enableTransitionType(LayoutTransition.DISAPPEARING)
//            layoutTransition.setAnimator(
//                LayoutTransition.APPEARING, AnimatorInflater.loadAnimator(
//                    this@MainActivity_22,
//                    R.animator.animator_botton_add_popit
//                )
//            )
            layoutTransition.setAnimator(
                LayoutTransition.DISAPPEARING,
                AnimatorInflater.loadAnimator(
                    this@MainActivity_22,
                    R.animator.animator_botton_delete_visibility
                )
            )


        }


        add.setOnClickListener {
            val button = Button(this)
            button.apply {
                text = container.childCount.toString()
//                alpha = 1f
//                scaleX = 0f
//                scaleY = 0f
            }.setOnClickListener { button.text = "12345678900987654321" }

            container.addView(button)
        }

        delete.setOnClickListener {
            if (container.childCount != 0) {
                container.removeViewAt(container.childCount - 1)
            }
        }


        // TODO: 12.06.2021 22.5 Vector animation
//        val frameVectorAnimation = findViewById<Button>(R.id.frame_vector_animation)
//        //frameVectorAnimation.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.avd_anim))
//        val animatorVector = frameVectorAnimation.background as AnimatedVectorDrawable
//
//        frameVectorAnimation.setOnClickListener { animatorVector.start() }

        // TODO: 07.06.2021 22.4 AnimatorSet
//        val sun = findViewById<FrameLayout>(R.id.yellow_san)
//        val cloud1 = findViewById<FrameLayout>(R.id.cloud_1)
//        val cloud2 = findViewById<FrameLayout>(R.id.cloud_2)
//        val dark = findViewById<FrameLayout>(R.id.dark)
//
//        val sunAnimation = ValueAnimator.ofFloat(0f, -1200f).apply {
//            addUpdateListener { sun.translationY = it.animatedValue as Float }
//            interpolator = OvershootInterpolator()
//            duration = 2000
//        }
//        val cloud1Animation = ValueAnimator.ofFloat(0f, 500f).apply {
//            addUpdateListener { cloud1.translationX = it.animatedValue as Float }
//            interpolator = FastOutSlowInInterpolator()
//            duration = 1000
//        }
//
//        val cloud2Animation = ValueAnimator.ofFloat(0f, -500f).apply {
//            addUpdateListener { cloud2.translationX = it.animatedValue as Float }
//            interpolator = BounceInterpolator()
//            duration = 1000
//        }
//
//        val darkAnimation = ValueAnimator.ofFloat(1f, 0f).apply {
//            addUpdateListener {
//                dark.alpha = it.animatedValue as Float
//            }
//            interpolator = OvershootInterpolator()
//            duration = 3000
//        }
//        val dawnAnimatorSet = AnimatorSet()
//        dawnAnimatorSet.run {
//            startDelay = 2000
//            playTogether(sunAnimation, darkAnimation)
//            playSequentially(cloud1Animation, cloud2Animation)
//            start()
//        }


//        val rocket = findViewById<ImageView>(R.id.rocket)
//        val startRocketButton = findViewById<Button>(R.id.start_rocket)


        // TODO: 07.06.2021 22.1-22.2
//        val startRocketAnimation =
//            AnimationUtils.loadAnimation(this, R.anim.animation_start_rocket_translate)
//        rocket.setOnClickListener {
//            it.startAnimation(startRocketAnimation)
//        }

        // TODO: 12.06.2021 22.6 ViewPropertyAnimation
//        rocket.setOnClickListener {
//            it
//                .animate()
//                .setDuration(2000)
//                .translationY(-1200f)
//                .rotation(360f)
//                .x(100f)
//                .setInterpolator(OvershootInterpolator())
//                .withStartAction { Toast.makeText(this, "START", Toast.LENGTH_SHORT).show() }
//                .withEndAction { Toast.makeText(this, "END", Toast.LENGTH_SHORT).show() }
//                .start()
//        }


//     var frameAnimator: AnimationDrawable? = null

//        startRocketButton.setOnClickListener {

        // TODO: 12.06.2021 22.22.5. Interpolator

//            val valueAnimatorInterpolator = ValueAnimator.ofFloat(0f, -1200f)
//            valueAnimatorInterpolator.apply {
//                duration = 1500
//                repeatCount = 0
//                interpolator = AccelerateDecelerateInterpolator() //разгон и торможение
//                interpolator = AccelerateInterpolator() // разгон
//                interpolator = OvershootInterpolator() //перелет
//                interpolator = AnticipateInterpolator() //замах
//                interpolator = AnticipateOvershootInterpolator() //замах с перелетом
//                interpolator = BounceInterpolator() //отскок
//                interpolator = FastOutSlowInInterpolator() //резко в конце
//                interpolator = LinearOutSlowInInterpolator() //резко в начале
//                addUpdateListener {
//                    rocket.translationY = it.animatedValue as Float
//                }
//                addListener(object : Animator.AnimatorListener {
//                    override fun onAnimationStart(animation: Animator?) {
//                        Toast.makeText(this@MainActivity_22, "START", Toast.LENGTH_SHORT).show()
//
//                    }
//
//                    override fun onAnimationCancel(animation: Animator?) {}
//
//                    override fun onAnimationRepeat(animation: Animator?) {}
//
//                    override fun onAnimationEnd(animation: Animator?) {
//                        Toast.makeText(this@MainActivity_22, "STOP", Toast.LENGTH_SHORT).apply {
//                            setGravity(Gravity.CENTER, 0, 0)
//                            show()
//                        }
//                    }
//
//                })
//                start()
//            }


        // TODO: 07.06.2021 22.4 FrameAnimator, AnimatorSet
//            if (frameAnimator == null) {
//                frameAnimator = ContextCompat.getDrawable(
//                    this,
//                    R.drawable.animation_list_rocket
//                ) as AnimationDrawable
//                rocket.apply {
//                    setImageResource(android.R.color.transparent)
//                    background = frameAnimator
//                }
//            }
//
//            frameAnimator?.let {
//                if (!it.isRunning) it.start() else it.stop()
//            }


        //TODO 22.3
        //ObjectValue method
//            ObjectAnimator.ofFloat(rocket, View.TRANSLATION_Y, 0f, -500f).apply {
//                repeatMode = ObjectAnimator.REVERSE
//                repeatCount = 1
//                duration = 3000
//                addListener(object : Animator.AnimatorListener {
//                    override fun onAnimationStart(animation: Animator?) {}
//
//                    override fun onAnimationEnd(animation: Animator?) {
//                        Toast.makeText(
//                            this@MainActivity_22,
//                            "Удачна посадка",
//                            Toast.LENGTH_SHORT
//                        ).apply {
//                            setGravity(Gravity.CENTER, 0, 0)
//                            show()
//                        }
//
//                    }
//
//                    override fun onAnimationCancel(animation: Animator?) {}
//
//                    override fun onAnimationRepeat(animation: Animator?) {}
//
//                })
//                start()
//            }


        //ValueAnimator method
//            val valueAnimator = ValueAnimator.ofFloat(0f, -500f)
//            valueAnimator.apply {
//                addUpdateListener { rocket.translationY = it.animatedValue as Float }
//                repeatMode = ValueAnimator.REVERSE
//                repeatCount = 1
//                duration = 3000
//                start()
//            }

        //       }

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