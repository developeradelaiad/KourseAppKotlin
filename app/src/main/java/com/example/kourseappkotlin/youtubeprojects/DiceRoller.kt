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


class DiceRoller : AppCompatActivity() {

    private val videoIds = listOf(
        "nMTIcSw9rto",
        "o2BJbu11P-M",
        "zuZz0nGJQlI",
        "eX0yqUoQH6A",
        "S01Ehf8jjBw",
        "Es1MdieqG6g"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dice_roller)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@DiceRoller)
        }

        recyclerView.adapter = RecyclerVideoView(this, lifecycle, videoIds)
    }
}

