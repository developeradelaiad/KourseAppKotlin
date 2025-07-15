package com.example.kourseappkotlin.lectures

import android.content.Intent
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

class Lecture5 : AppCompatActivity() {
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

        list.add(LecturePhotoData(R.drawable.training5_1))
        list.add(LecturePhotoData(R.drawable.soulation5_1))
        list.add(LecturePhotoData(R.drawable.training5_2))
        list.add(LecturePhotoData(R.drawable.dealing))
        list.add(LecturePhotoData(R.drawable.elvis))
        list.add(LecturePhotoData(R.drawable.veriavles_problem))
        list.add(LecturePhotoData(R.drawable.array))
        list.add(LecturePhotoData(R.drawable.printing_array))
        list.add(LecturePhotoData(R.drawable.exercise5_1))
        list.add(LecturePhotoData(R.drawable.soulation5_2))
        list.add(LecturePhotoData(R.drawable.mission5_1))
        list.add(LecturePhotoData(R.drawable.challange5_1))

        rec.adapter = Lecture2Adapter(this, list)
    }
}
