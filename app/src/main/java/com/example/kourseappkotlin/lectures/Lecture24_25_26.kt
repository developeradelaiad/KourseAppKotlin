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

class Lecture24_25_26 : AppCompatActivity() {
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

        list.add(LecturePhotoData(R.drawable.lectures24_25_26page1))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page2))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page3))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page4))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page5))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page6))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page7))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page8))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page9))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page10))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page11))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page12))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page13))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page14))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page15))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page16))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page17))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page18))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page19))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page20))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page21))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page22))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page23))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page24))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page25))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page26))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page27))
        list.add(LecturePhotoData(R.drawable.lectures24_25_26page28))

        rec.adapter = Lecture2Adapter(this, list)
    }
}
