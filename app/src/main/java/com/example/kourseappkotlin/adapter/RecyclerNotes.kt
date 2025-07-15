package com.example.kourseappkotlin.adapter

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.R
import com.example.kourseappkotlin.ShowImages
import com.github.chrisbanes.photoview.PhotoView

class RecyclerNotes(private val a: Activity, private val data: Array<Int>) :
    RecyclerView.Adapter<RecyclerNotes.NoteViewHolder>() {

    class NoteViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        val img: PhotoView = v.findViewById(R.id.photo_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val v = a.layoutInflater.inflate(R.layout.photo_rec, parent, false)
        return NoteViewHolder(v)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.img.setImageResource(data[position])
        holder.img.setOnClickListener {
            val i = Intent(a, ShowImages::class.java)
            i.putExtra("image", data[position])
            a.startActivity(i)
        }
    }
}