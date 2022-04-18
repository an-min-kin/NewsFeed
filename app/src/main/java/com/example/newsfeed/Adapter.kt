package com.example.newsfeed

import android.content.Context
import android.content.Intent
import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter(listArray:ArrayList<ListItem>, context: Context): RecyclerView.Adapter<Adapter.ViewHolder>(),
    ListAdapter {
    var listArrayR = listArray
    var contextR = context

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvTitle = view.findViewById<TextView>(R.id.tvTitle)
        val tvContent = view.findViewById<TextView>(R.id.tvContent)
        val im = view.findViewById<ImageView>(R.id.im)

        fun bind(listItem: ListItem, context: Context) {
            tvTitle.text = listItem.titleText
            if (listItem.contentText.length >= 50) {
            val shortContent: String = listItem.contentText.substring(0,50) + "..."
            tvContent.text = shortContent}
            else tvContent.text = listItem.contentText
           im.setImageResource(listItem.image_id)
            itemView.setOnClickListener(){
                val i = Intent(context,ContentActivity::class.java).apply{
                    putExtra("title",tvTitle.text.toString())
                    putExtra("content",listItem.contentText)
                    putExtra("image",listItem.image_id)
                }
                context.startActivity(i)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(contextR)
        /* класс, который будет рисовать */
        /* далее берем элементы из которых будет строить страницу */
        return ViewHolder(inflater.inflate(R.layout.item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var listItem = listArrayR.get(position)
        /* берем отдельный элемент из массива по индексу */
        holder.bind(listItem,contextR)
    }

    override fun getItemCount(): Int {
        return listArrayR.size
    }

    override fun registerDataSetObserver(p0: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun unregisterDataSetObserver(p0: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun getViewTypeCount(): Int {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun areAllItemsEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEnabled(p0: Int): Boolean {
        TODO("Not yet implemented")
    }
}