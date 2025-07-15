package com.example.kourseappkotlin.adapter

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.R
import com.example.kourseappkotlin.youtubeprojects.DiceRoller
import com.example.kourseappkotlin.youtubeprojects.EmergenceApp
import com.example.kourseappkotlin.youtubeprojects.NewsApp
import com.example.kourseappkotlin.youtubeprojects.TipTimeApp

class YoutubeRecycler(private val a: Activity, private val list: Array<String>) :
    RecyclerView.Adapter<YoutubeRecycler.YoutubeVH>() {
    class YoutubeVH(v: View) : RecyclerView.ViewHolder(v) {
        val txt: TextView = v.findViewById(R.id.photo_tx)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YoutubeVH {
        val v = a.layoutInflater.inflate(R.layout.list_item_photos, parent, false)
        return YoutubeVH(v)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: YoutubeVH, position: Int) {
        holder.txt.text = list[position]
        holder.itemView.setOnClickListener {
            when (position) {
                0 -> a.startActivity(Intent(a, DiceRoller::class.java))
                1 -> a.startActivity(Intent(a, EmergenceApp::class.java))
                2 -> a.startActivity(Intent(a, TipTimeApp::class.java))
                3->a.startActivity(Intent(a,NewsApp::class.java))
            }
        }
    }
}