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

class Lecture4 : AppCompatActivity() {
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


        list.add(LecturePhotoData(R.drawable.string_templates))
        list.add(LecturePhotoData(R.drawable.concatenation))
        list.add(LecturePhotoData(R.drawable.if_expression))
        list.add(LecturePhotoData(R.drawable.trining4_0))
        list.add(LecturePhotoData(R.drawable.when_expression))
        list.add(LecturePhotoData(R.drawable.when_expression1))
        list.add(LecturePhotoData(R.drawable.training4_1))
        list.add(LecturePhotoData(R.drawable.soulation4_0))
        list.add(LecturePhotoData(R.drawable.training4_2))
        list.add(LecturePhotoData(R.drawable.training4_3))
        list.add(LecturePhotoData(R.drawable.training4_4))
        list.add(LecturePhotoData(R.drawable.while_loop))
        list.add(LecturePhotoData(R.drawable.do_while))
        list.add(LecturePhotoData(R.drawable.exercise4_0))
        list.add(LecturePhotoData(R.drawable.soulation4_1))
        list.add(LecturePhotoData(R.drawable.exercise4_1))
        list.add(LecturePhotoData(R.drawable.soulation4_2))
        list.add(LecturePhotoData(R.drawable.mission4_0))
        list.add(LecturePhotoData(R.drawable.extra_mission4_0))

        rec.adapter = Lecture2Adapter(this, list)
    }
}
