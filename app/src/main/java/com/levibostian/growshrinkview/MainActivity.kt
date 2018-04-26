package com.levibostian.growshrinkview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        grow_button.setOnClickListener {
            bottom_container.animate()
                    .setInterpolator(AccelerateDecelerateInterpolator())
                    .translationY(grow_shrink_view.height.toFloat())
                    .setDuration(600)
                    .start()
        }
        shrink_button.setOnClickListener {
            bottom_container.animate()
                    .setInterpolator(AccelerateDecelerateInterpolator())
                    .translationY(0f)
                    .setDuration(600)
                    .start()
        }
    }

}
