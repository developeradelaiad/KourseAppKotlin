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

class Lecture22 : AppCompatActivity() {
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

        list.add(LecturePhotoData(R.drawable.lecture22page1))
        list.add(LecturePhotoData(R.drawable.lecture22page2))
        list.add(LecturePhotoData(R.drawable.lecture22page3))
        list.add(LecturePhotoData(R.drawable.lecture22page4))
        list.add(LecturePhotoData(R.drawable.lecture22page5))
        list.add(LecturePhotoData(R.drawable.lecture22page6))
        list.add(LecturePhotoData(R.drawable.lecture22page7))
        list.add(LecturePhotoData(R.drawable.lecture22page8))
        list.add(LecturePhotoData(R.drawable.lecture22page9))
        list.add(LecturePhotoData(R.drawable.lecture22page10))
        list.add(LecturePhotoData(R.drawable.lecture22page11))
        list.add(LecturePhotoData(R.drawable.lecture22page12))
        list.add(LecturePhotoData(R.drawable.lecture22page13))
        list.add(LecturePhotoData(R.drawable.lecture22page14))
        list.add(LecturePhotoData(R.drawable.lecture22page15))
        list.add(LecturePhotoData(R.drawable.lecture22page16))
        list.add(LecturePhotoData(R.drawable.lecture22page17))
        list.add(LecturePhotoData(R.drawable.lecture22page18))
        list.add(LecturePhotoData(R.drawable.lecture22page19))
        list.add(LecturePhotoData(R.drawable.lecture22page20))
        list.add(LecturePhotoData(R.drawable.lecture22page21))
        list.add(LecturePhotoData(R.drawable.lecture22page22))
        list.add(LecturePhotoData(R.drawable.lecture22page23))
        list.add(LecturePhotoData(R.drawable.lecture22page24))
        list.add(LecturePhotoData(R.drawable.lecture22page25))
        list.add(LecturePhotoData(R.drawable.lecture22page26))


        rec.adapter = Lecture2Adapter(this, list)
    }
}
