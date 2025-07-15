package com.example.kourseappkotlin.youtubeprojects

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.R
import com.example.kourseappkotlin.adapter.RecyclerVideoView

class NewsApp : AppCompatActivity() {  private val videoIds = listOf(
    "9WemiggEZBo", "W7y2-mFv9-Y",
    "aRUxWfzxNs0", "aJripPlxd4g",
    "a5ilE2wVl7w", "4K0QWH0Tezw",
    "uXDJhKNVaUU", "ci41FRXchn8",
    "jeSOSrgXw2s", "FfqX7F7uxZ8",
    "TO9Bm9JZC1Y", "AtkYueRhReY",
    "isp9TRt0JrA", "LP899-sming",
    "q5Qq-p1cgWc", "cqTJz2oh8fU",
    "Sp2qu7LN4SE", "WXjVR67uoQk",
    "iHzWywzJ6SY", "uDlMDmwNy3U"
)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_news_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_news).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@NewsApp)
        }

        recyclerView.adapter = RecyclerVideoView(this, lifecycle, videoIds)
    }
}