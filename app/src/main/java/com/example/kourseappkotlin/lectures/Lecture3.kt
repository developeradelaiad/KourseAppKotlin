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

class Lecture3 : AppCompatActivity() {
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


        list.add(LecturePhotoData(R.drawable.nulll))
        list.add(LecturePhotoData(R.drawable.nullabilty))
        list.add(LecturePhotoData(R.drawable.npe))
        list.add(LecturePhotoData(R.drawable.assignmentoperator))
        list.add(LecturePhotoData(R.drawable.unary))
        list.add(LecturePhotoData(R.drawable.unary1))
        list.add(LecturePhotoData(R.drawable.unary2))
        list.add(LecturePhotoData(R.drawable.equalityandinequalityoperators))
        list.add(LecturePhotoData(R.drawable.comparison))
        list.add(LecturePhotoData(R.drawable.logical))
        list.add(LecturePhotoData(R.drawable.training3_1))
        list.add(LecturePhotoData(R.drawable.soulation3_1))
        list.add(LecturePhotoData(R.drawable.training3_2))
        list.add(LecturePhotoData(R.drawable.soulation3_2))
        list.add(LecturePhotoData(R.drawable.benefits))
        list.add(LecturePhotoData(R.drawable.arithmetic))
        list.add(LecturePhotoData(R.drawable.arithmetic0))
        list.add(LecturePhotoData(R.drawable.training3_3))
        list.add(LecturePhotoData(R.drawable.mission3))
        rec.adapter = Lecture2Adapter(this, list)
    }
}
