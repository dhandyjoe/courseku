package com.example.course_ku.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.course_ku.model.Course
import com.example.course_ku.R
import java.util.ArrayList

class CardViewAdapter(private val listCourse: ArrayList<Course>, val clickListener: OnCourseClickListener): RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_recycle_view, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val course: Course = listCourse[position]
        Glide.with(holder.itemView.context)
            .load(course.image)
            .apply(RequestOptions().override(100, 120))
            .into(holder.imagePhoto)
        holder.initialize(listCourse.get(position), clickListener)
    }

    override fun getItemCount(): Int {
        return listCourse.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagePhoto: ImageView = itemView.findViewById(R.id.iv_main)
        var nameCourse: TextView = itemView.findViewById(R.id.tv_nameHero)
        var rating: TextView = itemView.findViewById(R.id.tv_rating)
        var pengajar: TextView = itemView.findViewById(R.id.tv_pengajar)

        fun initialize(item: Course, action: OnCourseClickListener){
            nameCourse.text = item.name
            rating.text = item.rating
            pengajar.text = item.pengajar

            itemView.setOnClickListener {
                action.onItemClick(item, adapterPosition)
            }
        }
    }

    interface OnCourseClickListener {
        fun onItemClick(item: Course, position: Int)
    }

}