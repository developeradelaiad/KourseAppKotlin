package com.example.kourseappkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.adapter.YoutubeRecycler

class YoutubeVideo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_youtube_video)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val youtubeRecy: RecyclerView = findViewById(R.id.youtube_recy)
        val list = arrayOf(
            "Dice Roller",
            "Emergency App",
            "Tip Time App",
            "News App"
        )
        youtubeRecy.layoutManager = LinearLayoutManager(this)
        youtubeRecy.adapter = YoutubeRecycler(this, list)
    }
}