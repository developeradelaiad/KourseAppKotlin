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

class Lecture9 : AppCompatActivity() {
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


        list.add(LecturePhotoData(R.drawable.lecture9page1))
        list.add(LecturePhotoData(R.drawable.lecture9page2))
        list.add(LecturePhotoData(R.drawable.lecture9page3))
        list.add(LecturePhotoData(R.drawable.lecture9page4))
        list.add(LecturePhotoData(R.drawable.lecture9page5))
        list.add(LecturePhotoData(R.drawable.lecture9page6))
        list.add(LecturePhotoData(R.drawable.lecture9page7))
        list.add(LecturePhotoData(R.drawable.lecture9page8))
        list.add(LecturePhotoData(R.drawable.lecture9page9))
        list.add(LecturePhotoData(R.drawable.lecture9page10))
        list.add(LecturePhotoData(R.drawable.lecture9page11))
        list.add(LecturePhotoData(R.drawable.lecture9page12))
        list.add(LecturePhotoData(R.drawable.lecture9page13))
        list.add(LecturePhotoData(R.drawable.lecture9page14))
        list.add(LecturePhotoData(R.drawable.lecture9page15))
        list.add(LecturePhotoData(R.drawable.lecture9page16))
        list.add(LecturePhotoData(R.drawable.lecture9page17))
        list.add(LecturePhotoData(R.drawable.lecture9page18))
        list.add(LecturePhotoData(R.drawable.lecture9page19))
        list.add(LecturePhotoData(R.drawable.lecture9page20))
        rec.adapter = Lecture2Adapter(this, list)
    }
}
