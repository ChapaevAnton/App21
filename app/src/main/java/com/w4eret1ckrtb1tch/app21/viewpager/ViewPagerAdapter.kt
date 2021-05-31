package com.w4eret1ckrtb1tch.app21.viewpager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.w4eret1ckrtb1tch.app21.R

class ViewPagerAdapter : RecyclerView.Adapter<ViewPagerHolder>() {

    private val viewPageItem = mutableListOf<ViewPageItem>()

    //создаем ViewPagerHolder и привязываем макет элемента
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        return ViewPagerHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
        )
    }

    //передаем данные из viewPageItem в layout item_view_pager
    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.onBind(viewPageItem[position],position)
    }

    //количество страниц-элементов
    override fun getItemCount(): Int {
        return viewPageItem.size
    }

    //добавление элементов во viewPageItem
    fun setItems(viewPageItemsList:List<ViewPageItem>){
        viewPageItem.clear()
        viewPageItem.addAll(viewPageItemsList)
    }

}