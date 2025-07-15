package com.example.kourseappkotlin

import android.os.Bundle
import android.view.WindowManager.LayoutParams
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.adapter.Lecture2Adapter
import com.example.kourseappkotlin.adapter.RecyclerNotes
import com.example.kourseappkotlin.data.LecturePhotoData

class LecturesNote : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lectures_note)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        window.setFlags(LayoutParams.FLAG_SECURE, LayoutParams.FLAG_SECURE)
        val rec: RecyclerView = findViewById(R.id.noteRecycler)
        val intent = intent.getIntExtra("image_note",-1)
        rec.adapter = RecyclerNotes(this, arrayOf(intent))


    }
}