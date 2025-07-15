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

class Lecture40 : AppCompatActivity() {
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
        list.add(LecturePhotoData(R.drawable.lecture40page1))
        list.add(LecturePhotoData(R.drawable.lecture40page1))
        list.add(LecturePhotoData(R.drawable.lecture40page2))
        list.add(LecturePhotoData(R.drawable.lecture40page3))
        list.add(LecturePhotoData(R.drawable.lecture40page4))
        list.add(LecturePhotoData(R.drawable.lecture40page5))
        list.add(LecturePhotoData(R.drawable.lecture40page6))
        list.add(LecturePhotoData(R.drawable.lecture40page7))
        list.add(LecturePhotoData(R.drawable.lecture40page8))
        list.add(LecturePhotoData(R.drawable.lecture40page9))
        list.add(LecturePhotoData(R.drawable.lecture40page10))
        list.add(LecturePhotoData(R.drawable.lecture40page11))
        list.add(LecturePhotoData(R.drawable.lecture40page12))
        list.add(LecturePhotoData(R.drawable.lecture40page13))
        list.add(LecturePhotoData(R.drawable.lecture40page14))
        list.add(LecturePhotoData(R.drawable.lecture40page15))




        rec.adapter = Lecture2Adapter(this, list)
    }
}
