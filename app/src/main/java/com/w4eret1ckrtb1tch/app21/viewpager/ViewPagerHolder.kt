package com.w4eret1ckrtb1tch.app21.viewpager

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.w4eret1ckrtb1tch.app21.R

class ViewPagerHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val itemViewContainer =
        itemView.findViewById<ConstraintLayout>(R.id.item_view_container)
    private val textInfo = itemView.findViewById<TextView>(R.id.text_info)

    fun onBind(viewPageItem: ViewPageItem, position: Int) {
        itemViewContainer.setBackgroundColor(viewPageItem.colorBackground)
        val str = "${viewPageItem.textInfo} № страницы $position"
        textInfo.text = str
    }

}