package com.example.kourseappkotlin.adapter

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.R
import com.example.kourseappkotlin.ShowImages
import com.example.kourseappkotlin.data.LecturePhotoData
import com.github.chrisbanes.photoview.PhotoView

class Lecture2Adapter(private val acti: Activity, private val list: List<LecturePhotoData>) :
    RecyclerView.Adapter<Lecture2Adapter.LuctViewHolder>() {

    class LuctViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val img: PhotoView = v.findViewById(R.id.photo_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LuctViewHolder {
        val v = acti.layoutInflater.inflate(R.layout.photo_rec, parent, false)
        return LuctViewHolder(v)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: LuctViewHolder, position: Int) {
        holder.img.setImageResource(list[position].image)
        holder.img.setOnClickListener {
            val i = Intent(acti, ShowImages::class.java)
            i.putExtra("image", list[position].image)
            acti.startActivity(i)
        }
    }
}