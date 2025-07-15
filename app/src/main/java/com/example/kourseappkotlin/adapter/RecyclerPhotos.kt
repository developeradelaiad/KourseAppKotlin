package com.example.kourseappkotlin.adapter

import android.app.Activity
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.Lectures2
import com.example.kourseappkotlin.R
import com.example.kourseappkotlin.lectures.Lecture10
import com.example.kourseappkotlin.lectures.Lecture11_12
import com.example.kourseappkotlin.lectures.Lecture13
import com.example.kourseappkotlin.lectures.Lecture14
import com.example.kourseappkotlin.lectures.Lecture15
import com.example.kourseappkotlin.lectures.Lecture16
import com.example.kourseappkotlin.lectures.Lecture17
import com.example.kourseappkotlin.lectures.Lecture18
import com.example.kourseappkotlin.lectures.Lecture19_20
import com.example.kourseappkotlin.lectures.Lecture21
import com.example.kourseappkotlin.lectures.Lecture22
import com.example.kourseappkotlin.lectures.Lecture23
import com.example.kourseappkotlin.lectures.Lecture24_25_26
import com.example.kourseappkotlin.lectures.Lecture27_28
import com.example.kourseappkotlin.lectures.Lecture29_30
import com.example.kourseappkotlin.lectures.Lecture3
import com.example.kourseappkotlin.lectures.Lecture31
import com.example.kourseappkotlin.lectures.Lecture32
import com.example.kourseappkotlin.lectures.Lecture33_34
import com.example.kourseappkotlin.lectures.Lecture35_36
import com.example.kourseappkotlin.lectures.Lecture37
import com.example.kourseappkotlin.lectures.Lecture38
import com.example.kourseappkotlin.lectures.Lecture39
import com.example.kourseappkotlin.lectures.Lecture4
import com.example.kourseappkotlin.lectures.Lecture40
import com.example.kourseappkotlin.lectures.Lecture41
import com.example.kourseappkotlin.lectures.Lecture5
import com.example.kourseappkotlin.lectures.Lecture6
import com.example.kourseappkotlin.lectures.Lecture7
import com.example.kourseappkotlin.lectures.Lecture8
import com.example.kourseappkotlin.lectures.Lecture9

class RecyclerPhotos(private val con: Activity, private val list: Array<String>) :
    RecyclerView.Adapter<RecyclerPhotos.PhotoVH>() {

    class PhotoVH(v: View) : RecyclerView.ViewHolder(v) {
        val txt: TextView = v.findViewById(R.id.photo_tx)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoVH {
        val v = con.layoutInflater.inflate(R.layout.list_item_photos, parent, false)
        return PhotoVH(v)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: PhotoVH, position: Int) {
        holder.txt.text = list[position]
        holder.itemView.setOnClickListener {

            when (position) {
                0 -> con.startActivity(Intent(con, Lectures2::class.java))
                1 -> con.startActivity(Intent(con, Lecture3::class.java))
                2 -> con.startActivity(Intent(con, Lecture4::class.java))
                3 -> con.startActivity(Intent(con, Lecture5::class.java))
                4 -> con.startActivity(Intent(con, Lecture6::class.java))
                5 -> con.startActivity(Intent(con, Lecture7::class.java))
                6 -> con.startActivity(Intent(con, Lecture8::class.java))
                7 -> con.startActivity(Intent(con, Lecture9::class.java))
                8 -> con.startActivity(Intent(con, Lecture10::class.java))
                9 -> con.startActivity(Intent(con, Lecture11_12::class.java))
                10 -> con.startActivity(Intent(con, Lecture13::class.java))
                11 -> con.startActivity(Intent(con, Lecture14::class.java))
                12 -> con.startActivity(Intent(con, Lecture15::class.java))
                13 -> con.startActivity(Intent(con, Lecture16::class.java))
                14 -> con.startActivity(Intent(con, Lecture17::class.java))
                15 -> con.startActivity(Intent(con, Lecture18::class.java))
                16 -> con.startActivity(Intent(con, Lecture19_20::class.java))
                17 -> con.startActivity(Intent(con, Lecture21::class.java))
                18 -> con.startActivity(Intent(con, Lecture22::class.java))
                19 -> con.startActivity(Intent(con, Lecture23::class.java))
                20 -> con.startActivity(Intent(con, Lecture24_25_26::class.java))
                21 -> con.startActivity(Intent(con, Lecture27_28::class.java))
                22 -> con.startActivity(Intent(con, Lecture29_30::class.java))
                23 -> con.startActivity(Intent(con, Lecture31::class.java))
                24 -> con.startActivity(Intent(con, Lecture32::class.java))
                25 -> con.startActivity(Intent(con, Lecture33_34::class.java))
                26 -> con.startActivity(Intent(con, Lecture35_36::class.java))
                27 -> con.startActivity(Intent(con, Lecture37::class.java))
                28 -> con.startActivity(Intent(con, Lecture38::class.java))
                29 -> con.startActivity(Intent(con, Lecture39::class.java))
                30 -> con.startActivity(Intent(con, Lecture40::class.java))
                31 -> con.startActivity(Intent(con, Lecture41::class.java))
            }
        }
    }
}