package com.example.kourseappkotlin.languagemodel

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.kourseappkotlin.R
import org.intellij.lang.annotations.Language

class LanguageAdapter(var context: Context, private var languageList: ArrayList<LanguageMOD>) : BaseAdapter() {
    override fun getCount(): Int {
        return languageList.size

    }

    override fun getItem(p0: Int): Any {
        return languageList[p0]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }
    @SuppressLint("ViewHolder")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val language = languageList.get(p0)
        val row = (context as Activity).layoutInflater.inflate(R.layout.language_list_item, p2, false)
        val tvName :TextView= row.findViewById(R.id.tvName)
        tvName.text = language.name
        return row    }
}