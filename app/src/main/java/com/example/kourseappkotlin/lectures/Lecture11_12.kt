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

class Lecture11_12 : AppCompatActivity() {
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
list.add(LecturePhotoData(R.drawable.lecture11page1))
        list.add(LecturePhotoData(R.drawable.lecture11page2))
        list.add(LecturePhotoData(R.drawable.lecture11page3))
        list.add(LecturePhotoData(R.drawable.lecture11page4))
        list.add(LecturePhotoData(R.drawable.lecture11page5))
        list.add(LecturePhotoData(R.drawable.lecture11page6))
        list.add(LecturePhotoData(R.drawable.lecture11page7))
        list.add(LecturePhotoData(R.drawable.lecture11page8))
        list.add(LecturePhotoData(R.drawable.lecture11page9))
        list.add(LecturePhotoData(R.drawable.lecture11page10))
        list.add(LecturePhotoData(R.drawable.lecture11page11))
        list.add(LecturePhotoData(R.drawable.lecture11page12))
        list.add(LecturePhotoData(R.drawable.lecture11page13))
        list.add(LecturePhotoData(R.drawable.lecture11page14))
        list.add(LecturePhotoData(R.drawable.lecture11page15))
        list.add(LecturePhotoData(R.drawable.lecture11page16))
        list.add(LecturePhotoData(R.drawable.lecture11page17))
        list.add(LecturePhotoData(R.drawable.lecture11page18))
        list.add(LecturePhotoData(R.drawable.lecture11page19))
        list.add(LecturePhotoData(R.drawable.lecture11page20))
        list.add(LecturePhotoData(R.drawable.lecture11page21))
        list.add(LecturePhotoData(R.drawable.lecture11page22))
        list.add(LecturePhotoData(R.drawable.lecture11page23))
        list.add(LecturePhotoData(R.drawable.lecture11page24))
        list.add(LecturePhotoData(R.drawable.lecture12page1))
        list.add(LecturePhotoData(R.drawable.lecture12page2))
        list.add(LecturePhotoData(R.drawable.lecture12page3))
        list.add(LecturePhotoData(R.drawable.lecture12page4))
        list.add(LecturePhotoData(R.drawable.lecture12page5))
        list.add(LecturePhotoData(R.drawable.lecture12page6))
        list.add(LecturePhotoData(R.drawable.lecture12page7))
        list.add(LecturePhotoData(R.drawable.lecture12page8))
        list.add(LecturePhotoData(R.drawable.lecture12page9))

        rec.adapter = Lecture2Adapter(this, list)
    }
}
