package com.example.kourseappkotlin.lectures

import android.os.Bundle
import android.view.WindowManager.LayoutParams
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.R
import com.example.kourseappkotlin.adapter.Lecture2Adapter
import com.example.kourseappkotlin.data.LecturePhotoData

class Lecture37 : AppCompatActivity() {
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
        list.add(LecturePhotoData(R.drawable.lecture37page1))
        list.add(LecturePhotoData(R.drawable.lecture37page2))
        list.add(LecturePhotoData(R.drawable.lecture37page3))
        list.add(LecturePhotoData(R.drawable.lecture37page4))
        list.add(LecturePhotoData(R.drawable.lecture37page5))
        list.add(LecturePhotoData(R.drawable.lecture37page6))
        list.add(LecturePhotoData(R.drawable.lecture37page7))
        list.add(LecturePhotoData(R.drawable.lecture37page8))
        list.add(LecturePhotoData(R.drawable.lecture37page9))
        list.add(LecturePhotoData(R.drawable.lecture37page10))
        list.add(LecturePhotoData(R.drawable.lecture37page11))
        list.add(LecturePhotoData(R.drawable.lecture37page12))
        list.add(LecturePhotoData(R.drawable.lecture37page13))
        list.add(LecturePhotoData(R.drawable.lecture37page14))
        list.add(LecturePhotoData(R.drawable.lecture37page15))
        list.add(LecturePhotoData(R.drawable.lecture37page16))
        rec.adapter = Lecture2Adapter(this, list)
    }
}
