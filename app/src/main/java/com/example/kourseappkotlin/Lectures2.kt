package com.example.kourseappkotlin

import android.os.Bundle
import android.view.WindowManager.LayoutParams
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.adapter.Lecture2Adapter
import com.example.kourseappkotlin.data.LecturePhotoData

class Lectures2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lectures_photo)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        window.setFlags(LayoutParams.FLAG_SECURE, LayoutParams.FLAG_SECURE)

        val rec: RecyclerView = findViewById(R.id.photoRecycler)
        val list = ArrayList<LecturePhotoData>()
        list.add(LecturePhotoData(R.drawable.symbols))
        list.add(LecturePhotoData(R.drawable.what_is))
        list.add(LecturePhotoData(R.drawable.example1))
        list.add(LecturePhotoData(R.drawable.example2))
        list.add(LecturePhotoData(R.drawable.example3))
        list.add(LecturePhotoData(R.drawable.packageeee))
        list.add(LecturePhotoData(R.drawable.hello))
        list.add(LecturePhotoData(R.drawable.training0))
        list.add(LecturePhotoData(R.drawable.coments))
        list.add(LecturePhotoData(R.drawable.training1))
        list.add(LecturePhotoData(R.drawable.temporary))
        list.add(LecturePhotoData(R.drawable.vriabless))
        list.add(LecturePhotoData(R.drawable.vriables))
        list.add(LecturePhotoData(R.drawable.training2))
        list.add(LecturePhotoData(R.drawable.var_val))
        list.add(LecturePhotoData(R.drawable.infereance))
        list.add(LecturePhotoData(R.drawable.mission))
        rec.adapter = Lecture2Adapter(this, list)
    }
}