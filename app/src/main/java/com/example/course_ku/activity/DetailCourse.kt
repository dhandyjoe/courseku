package com.example.course_ku.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.course_ku.R
import kotlinx.android.synthetic.main.activity_detail_course.*

class DetailCourse : AppCompatActivity() {

    private lateinit var btnDaftar: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_course)

        btnDaftar = findViewById(R.id.tv_nameCourse)

        image.setImageResource(getIntent().getStringExtra("COURSELOGO")!!.toInt())
        tv_nameCourse.text = getIntent().getStringExtra("COURSENAME")
        tv_namePengajar.text = getIntent().getStringExtra("COURSEPENGAJAR")
        tv_modul.text = getIntent().getStringExtra("COURSEMODUL")
        biaya.text = getIntent().getStringExtra("COURSEBIAYA")
        tv_jam.text = getIntent().getStringExtra("COURSEJAM")
        tv_deskripsi.text = getIntent().getStringExtra("COURSEDETAIL")

        val namaCourse = btnDaftar.text.toString()

        btn_daftar.setOnClickListener {
            Toast.makeText(this, "Kamu telah memilih kelas $namaCourse", Toast.LENGTH_SHORT).show()
        }

        iv_back.setOnClickListener {
            onBackPressed()
        }
    }
}

