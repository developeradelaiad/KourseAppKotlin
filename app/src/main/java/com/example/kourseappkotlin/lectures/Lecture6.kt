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

class Lecture6 : AppCompatActivity() {
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


        list.add(LecturePhotoData(R.drawable.soulation6_1))
        list.add(LecturePhotoData(R.drawable.whay_function))
        list.add(LecturePhotoData(R.drawable.function_benefits))
        list.add(LecturePhotoData(R.drawable.function_syntax))
        list.add(LecturePhotoData(R.drawable.training6_1))
        list.add(LecturePhotoData(R.drawable.training6_2))
        list.add(LecturePhotoData(R.drawable.training6_3))
        list.add(LecturePhotoData(R.drawable.defult_values))
        list.add(LecturePhotoData(R.drawable.name_argu))
        list.add(LecturePhotoData(R.drawable.named_argu1))
        list.add(LecturePhotoData(R.drawable.exercise6_1))
        list.add(LecturePhotoData(R.drawable.soulation6_2))
        list.add(LecturePhotoData(R.drawable.local_function))
        list.add(LecturePhotoData(R.drawable.mission6_1))
        list.add(LecturePhotoData(R.drawable.extra_mission6_1))

        rec.adapter = Lecture2Adapter(this, list)
    }
}
