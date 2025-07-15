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

class Lecture38 : AppCompatActivity() {
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
        list.add(LecturePhotoData(R.drawable.lecture38page1))
        list.add(LecturePhotoData(R.drawable.lecture38page2))
        list.add(LecturePhotoData(R.drawable.lecture38page3))
        list.add(LecturePhotoData(R.drawable.lecture38page4))
        list.add(LecturePhotoData(R.drawable.lecture38page5))
        list.add(LecturePhotoData(R.drawable.lecture38page6))
        list.add(LecturePhotoData(R.drawable.lecture38page7))
        list.add(LecturePhotoData(R.drawable.lecture38page8))
        list.add(LecturePhotoData(R.drawable.lecture38page9))
        list.add(LecturePhotoData(R.drawable.lecture38page10))
        list.add(LecturePhotoData(R.drawable.lecture38page11))
        list.add(LecturePhotoData(R.drawable.lecture38page12))
        list.add(LecturePhotoData(R.drawable.lecture38page13))
        list.add(LecturePhotoData(R.drawable.lecture38page14))
        list.add(LecturePhotoData(R.drawable.lecture38page15))
        list.add(LecturePhotoData(R.drawable.lecture38page16))
        list.add(LecturePhotoData(R.drawable.lecture38page17))
        list.add(LecturePhotoData(R.drawable.lecture38page18))
        rec.adapter = Lecture2Adapter(this, list)
    }
}
