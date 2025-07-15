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

class Lecture41 : AppCompatActivity() {
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
list.add(LecturePhotoData(R.drawable.lecture41page1))
        list.add(LecturePhotoData(R.drawable.lecture41page2))
        list.add(LecturePhotoData(R.drawable.lecture41page3))
        list.add(LecturePhotoData(R.drawable.lecture41page4))
        list.add(LecturePhotoData(R.drawable.lecture41page5))
        list.add(LecturePhotoData(R.drawable.lecture41page6))
        list.add(LecturePhotoData(R.drawable.lecture41page7))
        list.add(LecturePhotoData(R.drawable.lecture41page8))
        list.add(LecturePhotoData(R.drawable.lecture41page9))
        list.add(LecturePhotoData(R.drawable.lecture41page10))
        list.add(LecturePhotoData(R.drawable.lecture41page11))
        list.add(LecturePhotoData(R.drawable.lecture41page12))
        list.add(LecturePhotoData(R.drawable.lecture41page13))
        list.add(LecturePhotoData(R.drawable.lecture41page14))
        list.add(LecturePhotoData(R.drawable.lecture41page15))
        list.add(LecturePhotoData(R.drawable.lecture41page16))
        list.add(LecturePhotoData(R.drawable.lecture41page17))
        list.add(LecturePhotoData(R.drawable.lecture41page18))
        list.add(LecturePhotoData(R.drawable.lecture41page19))
        list.add(LecturePhotoData(R.drawable.lecture41page20))
        list.add(LecturePhotoData(R.drawable.lecture41page21))
        list.add(LecturePhotoData(R.drawable.lecture41page22))
        list.add(LecturePhotoData(R.drawable.lecture41page23))
        rec.adapter = Lecture2Adapter(this, list)
    }
}
