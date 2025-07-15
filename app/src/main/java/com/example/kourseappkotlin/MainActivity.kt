package com.example.kourseappkotlin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.WindowManager.LayoutParams
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kourseappkotlin.adapter.RecyclerMain
import com.example.kourseappkotlin.data.DataMain
import com.example.kourseappkotlin.dialog.AlertDialog
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val text: TextView = findViewById(R.id.textView10)
        val dev: TextView = findViewById(R.id.devloper_txt)
        val dev1: TextView = findViewById(R.id.devloper_txt1)
        val list: RecyclerView = findViewById(R.id.LectureList)
        val array = ArrayList<DataMain>()

        array.add(DataMain(R.drawable.photo, R.string.lectures_photo))
        array.add(DataMain(R.drawable.icons_youtube, R.string.project_youtube))
        array.add(DataMain(R.drawable.icons_github, R.string.projects_github))

        list.adapter = RecyclerMain(this, array)

        text.setText(R.string.welcome_to_kourse_kotlinapp)
        dev.setText(R.string.kourse_from_maadCoding)
        dev1.setText(R.string.development_adelAiad)

        dev.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/MaadCoding")
                )
            )
        }
        dev1.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/adelaiad74")
                )
            )
        }
        val language = ArrayList<String>()
        language.add("Select Language")
        language.add("English")
        language.add("Arabic")
        language.add("French")

        val spinner: Spinner = findViewById(R.id.language_sp)
        val adapter = ArrayAdapter(this, R.layout.spinner_list_item, language)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>,
                view: View,
                position: Int,
                l: Long
            ) {
                when (position) {
                    0 -> {}
                    1 -> {
                        changeLanguage("en")
                        Toast.makeText(
                            this@MainActivity,
                            "${language[position]}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                    2 -> changeLanguage("ar")
                    3 -> changeLanguage("fr")
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        window.setFlags(LayoutParams.FLAG_SECURE, LayoutParams.FLAG_SECURE)
    }

    override fun onBackPressed() {
        val exit = AlertDialog()
        exit.isCancelable = false
        exit.show(supportFragmentManager, null)
    }

    private fun changeLanguage(code: String) {
        val myLocale = Locale(code)
        val res = resources
        val config = res.configuration
        config.locale = myLocale
        res.updateConfiguration(config, res.displayMetrics)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
