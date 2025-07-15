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

class Lecture32 : AppCompatActivity() {
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
        list.add(LecturePhotoData(R.drawable.lecture32page1))
        list.add(LecturePhotoData(R.drawable.lecture32page2))
        list.add(LecturePhotoData(R.drawable.lecture32page3))
        list.add(LecturePhotoData(R.drawable.lecture32page4))
        list.add(LecturePhotoData(R.drawable.lecture32page5))
        list.add(LecturePhotoData(R.drawable.lecture32page6))
        list.add(LecturePhotoData(R.drawable.lecture32page7))
        list.add(LecturePhotoData(R.drawable.lecture32page8))
        list.add(LecturePhotoData(R.drawable.lecture32page9))
        list.add(LecturePhotoData(R.drawable.lecture32page10))
        list.add(LecturePhotoData(R.drawable.lecture32page11))
        list.add(LecturePhotoData(R.drawable.lecture32page12))
        list.add(LecturePhotoData(R.drawable.lecture32page13))
        list.add(LecturePhotoData(R.drawable.lecture32page14))
        list.add(LecturePhotoData(R.drawable.lecture32page15))
        list.add(LecturePhotoData(R.drawable.lecture32page16))
        list.add(LecturePhotoData(R.drawable.lecture32page17))
        list.add(LecturePhotoData(R.drawable.lecture32page18))
        list.add(LecturePhotoData(R.drawable.lecture32page19))
        list.add(LecturePhotoData(R.drawable.lecture32page20))
        list.add(LecturePhotoData(R.drawable.lecture32page21))
        list.add(LecturePhotoData(R.drawable.lecture32page22))
        list.add(LecturePhotoData(R.drawable.lecture32page23))
        list.add(LecturePhotoData(R.drawable.lecture32page24))
        list.add(LecturePhotoData(R.drawable.lecture32page25))
        list.add(LecturePhotoData(R.drawable.lecture32page26))
        list.add(LecturePhotoData(R.drawable.lecture32page27))
        list.add(LecturePhotoData(R.drawable.lecture32page28))
        list.add(LecturePhotoData(R.drawable.lecture32page29))
        rec.adapter = Lecture2Adapter(this, list)
    }
}
