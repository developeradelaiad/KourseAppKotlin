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

class EmergenceApp : AppCompatActivity() {
    private val videoIds = listOf(
        "6q65VtiL1Co", "XoTJGK6lNVc",
        "G1b_XU87B6o", "ww4SbJ0_iH8",
        "26USUqqpPxw", "96X7H_L0SL0",
        "8JvN1QANGSQ", "2YcT84N2cyk",
        "1HURovyBSUc", "3QuyUypcUyE",
        "qtAYJKaEg14", "E6XRmN1RuBs",
        "lSA7iOXo8jY", "y0zFXpxdP0M",
        "omu2Nlllotw", "lWQUeul2a_Y",
        "_ZAra5DM6YE", "joYmyYeUSHs",
        "rtq2IkuFpzA", "axofAuFyaXQ"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_emergence_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_Emer).apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@EmergenceApp)
        }

        recyclerView.adapter = RecyclerVideoView(this, lifecycle, videoIds)
        }
}