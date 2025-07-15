package com.example.kourseappkotlin.adapter

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.LecturesNote
import com.example.kourseappkotlin.R

class LectureNoteRecycler(private val a: Activity, val list: Array<String>) :
    RecyclerView.Adapter<LectureNoteRecycler.NoteHV>() {

    class NoteHV(v: View) : RecyclerView.ViewHolder(v) {
        val txt: TextView = v.findViewById(R.id.photo_tx)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteHV {
        val v = a.layoutInflater.inflate(R.layout.list_item_photos, parent, false)
        return NoteHV(v)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: NoteHV, position: Int) {
        holder.txt.text = list[position]
        holder.itemView.setOnClickListener {
            val i = Intent(a,LecturesNote::class.java)
            i.putExtra("image_note", arrayOf(R.drawable.note,R.drawable.note3_1,
                R.drawable.note,R.drawable.note,R.drawable.note6_1)[position])
            a.startActivity(i)
        }
    }
}