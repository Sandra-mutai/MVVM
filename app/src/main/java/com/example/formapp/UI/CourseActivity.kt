package com.example.formapp.UI

import CourseAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.formapp.R
import com.example.formapp.course

class CourseActivity :AppCompatActivity() {
        lateinit var rvCourses: RecyclerView
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_courses)
            displayCourses()
        }
        fun displayCourses(){
            var coursesList= listOf(
                course("IOT","467665","IOT for 21st","Bare"),
                course("Python","467665","Python for 21st","Mwai"),
                course("Kotlin","467665","KOtlin for 21st","John"),
                course("UI/UX design","467665","UI/UX design for 21st","Eric"),
                course("JavaScript","467665","JavaScript for 21st","Purity"),
                course("UX research","467665","UX research for 21st","Joy"),
                course("PD","467665","PD for 21st","Awoko"),
                course("NYJ","467665","NYJ for 21st","Veronica"),

            )
            rvCourses=findViewById(R.id.rvCourses)
            var cousesAdapter= CourseAdapter(coursesList)
            rvCourses.layoutManager=LinearLayoutManager(baseContext)
            rvCourses.adapter=cousesAdapter

            rvCourses.apply {
                layoutManager=LinearLayoutManager(baseContext)
                adapter=cousesAdapter
            }

    }

}