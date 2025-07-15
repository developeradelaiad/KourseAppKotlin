package com.example.kourseappkotlin.adapter

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.Photos
import com.example.kourseappkotlin.R
import com.example.kourseappkotlin.YoutubeVideo
import com.example.kourseappkotlin.data.DataMain

class RecyclerMain(private val con: Activity, private val list: List<DataMain>) :
    RecyclerView.Adapter<RecyclerMain.MainVH>() {


    class MainVH(v: View) : RecyclerView.ViewHolder(v) {
        val img: ImageView = v.findViewById(R.id.lecture_img)
        val txt: TextView = v.findViewById(R.id.lecture_tx)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainVH {
        val v = con.layoutInflater.inflate(R.layout.list_item, parent, false)
        return MainVH(v)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: MainVH, position: Int) {
        holder.txt.setText(list[position].txt)
        holder.img.setImageResource(list[position].img)
        holder.itemView.setOnClickListener {
            when (position) {
                0 -> con.startActivity(Intent(con, Photos::class.java))
                1 -> con.startActivity(Intent(con, YoutubeVideo::class.java))
                2 -> con.startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/developeradelaiad?tab=repositories")
                    )
                )
            }
        }
    }
}