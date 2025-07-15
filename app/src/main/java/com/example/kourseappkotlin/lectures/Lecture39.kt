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

class Lecture39 : AppCompatActivity() {
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
        list.add(LecturePhotoData(R.drawable.lecture39page1))
        list.add(LecturePhotoData(R.drawable.lecture39page2))
        list.add(LecturePhotoData(R.drawable.lecture39page3))
        list.add(LecturePhotoData(R.drawable.lecture39page4))
        list.add(LecturePhotoData(R.drawable.lecture39page5))
        list.add(LecturePhotoData(R.drawable.lecture39page6))
        list.add(LecturePhotoData(R.drawable.lecture39page7))
        list.add(LecturePhotoData(R.drawable.lecture39page8))
        list.add(LecturePhotoData(R.drawable.lecture39page9))
        list.add(LecturePhotoData(R.drawable.lecture39page10))
        list.add(LecturePhotoData(R.drawable.lecture39page11))
        list.add(LecturePhotoData(R.drawable.lecture39page12))
        list.add(LecturePhotoData(R.drawable.lecture39page13))
        list.add(LecturePhotoData(R.drawable.lecture39page14))
        list.add(LecturePhotoData(R.drawable.lecture39page15))
        list.add(LecturePhotoData(R.drawable.lecture39page16))
        list.add(LecturePhotoData(R.drawable.lecture39page17))
        list.add(LecturePhotoData(R.drawable.lecture39page18))
        list.add(LecturePhotoData(R.drawable.lecture39page19))
        list.add(LecturePhotoData(R.drawable.lecture39page20))
        list.add(LecturePhotoData(R.drawable.lecture39page21))
        list.add(LecturePhotoData(R.drawable.lecture39page22))
        list.add(LecturePhotoData(R.drawable.lecture39page23))
        list.add(LecturePhotoData(R.drawable.lecture39page24))
        list.add(LecturePhotoData(R.drawable.lecture39page25))
        list.add(LecturePhotoData(R.drawable.lecture39page26))
        list.add(LecturePhotoData(R.drawable.lecture39page27))
        list.add(LecturePhotoData(R.drawable.lecture39page28))


        rec.adapter = Lecture2Adapter(this, list)
    }
}
