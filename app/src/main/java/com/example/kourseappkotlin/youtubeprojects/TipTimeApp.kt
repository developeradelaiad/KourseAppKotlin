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

class TipTimeApp : AppCompatActivity() {
    private val videoIds = listOf(
        "JHKm5NAH1hs", "RQjDSeH1ep0",
        "Fmbp6nuHlVM", "Bu4j1FLkiAk",
        "juaJiJtxIc8", "s3yOzqn9-MY",
        "NqizGMwX98M", "trSa3IxzW9E",
        "kg5vciw6Ggw", "zBdiTugfdwU",
        "Se115VDpvtY", "BaES0h23p4M",
        "kp1NFQSn9cI", "yC-D-CqK610",
        "8vjBdwO5xmg", "-XllYtD6R5Y",
        "eCUHnIWAOy4", "zUQwsNmNSgY",
        "FtHXyMuKbKY", "etkC5xL1gWA",
        "o4Xr70qfDlc", "vIWyVsxUQWY",
        "OGj3LgVzEAk", "mk4jKBh5quQ"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tip_time_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_Tip).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@TipTimeApp)
        }

        recyclerView.adapter = RecyclerVideoView(this, lifecycle, videoIds)
    }
}