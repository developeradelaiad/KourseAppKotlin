package com.example.kourseappkotlin

import android.os.Bundle
import android.view.View
import android.view.WindowManager.LayoutParams
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.adapter.LectureNoteRecycler

@Suppress("DEPRECATION")
class Note : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_note)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val recy: RecyclerView = findViewById(R.id.listNotes)
        val data = arrayOf(
            "Lecture 2", "Lecture 3",
            "Lecture 4 ", "Lecture 5 ", "Lecture 6 ",
            "Lecture 7 ", "Lecture 8 ", "Lecture 9 ",
            "Lecture 10 ", "Lecture 11&12 ", "Lecture 13 ",
            "Lecture 14 ", "Lecture 15 ", "Lecture 16 ",
            "Lecture 17 ", "Lecture 18 ", "Lecture 19&20 ",
            "Lecture 21 ", "Lecture 22 ", "Lecture 23 ",
            "Lecture 24&25&26 ", "Lecture 27&28 ", "Lecture 29&30 ",
            "Lecture 31 ", "Lecture 32 ",
            "Lecture 33&34 ", "Lecture 35&36 ", "Lecture 37 ", "Lecture 38 ",
            "Lecture 39 ", "Lecture 40 ", "Lecture 41 "
        )
        recy.adapter = LectureNoteRecycler(this, data)


        window.setFlags(LayoutParams.FLAG_SECURE, LayoutParams.FLAG_SECURE)
        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }
    }
}