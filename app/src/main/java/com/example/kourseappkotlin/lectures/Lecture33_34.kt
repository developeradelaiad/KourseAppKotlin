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

class Lecture33_34 : AppCompatActivity() {
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
        list.add(LecturePhotoData(R.drawable.lectures33_34page1))
        list.add(LecturePhotoData(R.drawable.lectures33_34page2))
        list.add(LecturePhotoData(R.drawable.lectures33_34page3))
        list.add(LecturePhotoData(R.drawable.lectures33_34page4))
        list.add(LecturePhotoData(R.drawable.lectures33_34page5))
        list.add(LecturePhotoData(R.drawable.lectures33_34page6))
        list.add(LecturePhotoData(R.drawable.lectures33_34page7))
        list.add(LecturePhotoData(R.drawable.lectures33_34page8))
        rec.adapter = Lecture2Adapter(this, list)
    }
}
