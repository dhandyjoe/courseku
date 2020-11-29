package com.example.course_ku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CardViewAdapter.OnCourseClickListener {

    private lateinit var courses: RecyclerView
    private var listCourse: ArrayList<Course> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        courses = findViewById(R.id.courses)
        courses.setHasFixedSize(true)

        listCourse.addAll(DataCourse.listCourse)
        showRecyclerCardView()

        about.setOnClickListener {
            val intent = Intent(this, AboutCourse::class.java)
            startActivity(intent)
        }
    }

    private fun showRecyclerCardView() {
        courses.layoutManager = LinearLayoutManager(this)
        courses.adapter = CardViewAdapter(listCourse, this)
    }

    override fun onItemClick(item: Course, position: Int) {
        val intent = Intent(this, DetailCourse::class.java)
        intent.putExtra("COURSELOGO", item.image.toString())
        intent.putExtra("COURSENAME", item.name)
        intent.putExtra("COURSEPENGAJAR", item.pengajar)
        intent.putExtra("COURSEMODUL", item.modul)
        intent.putExtra("COURSEBIAYA", item.biaya)
        intent.putExtra("COURSEJAM", item.jam)
        intent.putExtra("COURSEDETAIL", item.deskripsi)
        startActivity(intent)
    }

}