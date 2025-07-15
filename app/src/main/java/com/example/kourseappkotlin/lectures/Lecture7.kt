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

class Lecture7 : AppCompatActivity() {
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

        list.add(LecturePhotoData(R.drawable.lecture7page1))
        list.add(LecturePhotoData(R.drawable.lecture7page2))
        list.add(LecturePhotoData(R.drawable.lecture7page3))
        list.add(LecturePhotoData(R.drawable.lecture7page4))
        list.add(LecturePhotoData(R.drawable.lecture7page5))
        list.add(LecturePhotoData(R.drawable.lecture7page6))
        list.add(LecturePhotoData(R.drawable.lecture7page7))
        list.add(LecturePhotoData(R.drawable.lecture7page8))
        list.add(LecturePhotoData(R.drawable.lecture7page9))
        list.add(LecturePhotoData(R.drawable.lecture7page10))
        list.add(LecturePhotoData(R.drawable.lecture7page11))
        list.add(LecturePhotoData(R.drawable.lecture7page12))
        list.add(LecturePhotoData(R.drawable.lecture7page13))
        list.add(LecturePhotoData(R.drawable.lecture7page14))
        list.add(LecturePhotoData(R.drawable.lecture7page15))
        list.add(LecturePhotoData(R.drawable.lecture7page16))
        list.add(LecturePhotoData(R.drawable.lecture7page17))
        list.add(LecturePhotoData(R.drawable.lecture7page18))
        list.add(LecturePhotoData(R.drawable.lecture7page19))
        list.add(LecturePhotoData(R.drawable.lecture7page20))
        list.add(LecturePhotoData(R.drawable.lecture7page21))
        list.add(LecturePhotoData(R.drawable.lecture7page22))
        list.add(LecturePhotoData(R.drawable.lecture7page23))

        rec.adapter = Lecture2Adapter(this, list)
    }
}
