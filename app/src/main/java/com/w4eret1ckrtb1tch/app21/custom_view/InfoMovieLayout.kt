package com.w4eret1ckrtb1tch.app21.custom_view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.core.content.ContextCompat
import com.w4eret1ckrtb1tch.app21.R

class InfoMovieLayout(context: Context, @Nullable attributeSet: AttributeSet) :
    RelativeLayout(context, attributeSet) {

    private val textTitle: TextView
    private val textDescription: TextView
    private val imageTitle: ImageView

    init {

        LayoutInflater.from(context).inflate(R.layout.info_movie_layout, this)
            .apply { setBackgroundColor(ContextCompat.getColor(context, R.color.red)) }
        textTitle = findViewById(R.id.text_title)
        textDescription = findViewById(R.id.text_description)
        imageTitle = findViewById(R.id.image_title)

    }


}