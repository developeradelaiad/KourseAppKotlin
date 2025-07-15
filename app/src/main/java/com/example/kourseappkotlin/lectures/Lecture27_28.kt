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

class Lecture27_28 : AppCompatActivity() {
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

        list.add(LecturePhotoData(R.drawable.lectures27_28page1))
        list.add(LecturePhotoData(R.drawable.lectures27_28page2))
        list.add(LecturePhotoData(R.drawable.lectures27_28page3))
        list.add(LecturePhotoData(R.drawable.lectures27_28page4))
        list.add(LecturePhotoData(R.drawable.lectures27_28page5))
        list.add(LecturePhotoData(R.drawable.lectures27_28page6))
        list.add(LecturePhotoData(R.drawable.lectures27_28page7))
        list.add(LecturePhotoData(R.drawable.lectures27_28page8))
        list.add(LecturePhotoData(R.drawable.lectures27_28page9))
        list.add(LecturePhotoData(R.drawable.lectures27_28page10))
        list.add(LecturePhotoData(R.drawable.lectures27_28page11))
        list.add(LecturePhotoData(R.drawable.lectures27_28page12))
        list.add(LecturePhotoData(R.drawable.lectures27_28page13))
        list.add(LecturePhotoData(R.drawable.lectures27_28page14))
        list.add(LecturePhotoData(R.drawable.lectures27_28page15))
        list.add(LecturePhotoData(R.drawable.lectures27_28page16))
        list.add(LecturePhotoData(R.drawable.lectures27_28page17))
        list.add(LecturePhotoData(R.drawable.lectures27_28page18))
        list.add(LecturePhotoData(R.drawable.lectures27_28page1))
        list.add(LecturePhotoData(R.drawable.lectures27_28page20))
        list.add(LecturePhotoData(R.drawable.lectures27_28page21))
        list.add(LecturePhotoData(R.drawable.lectures27_28page22))
        list.add(LecturePhotoData(R.drawable.lectures27_28page23))

        rec.adapter = Lecture2Adapter(this, list)
    }
}
