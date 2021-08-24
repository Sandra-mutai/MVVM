package com.example.formapp.models

import com.google.gson.annotations.SerializedName

data class CourseRequest(
    @SerializedName("course_name")var CourseName:String,
    @SerializedName("course_description") var CourseDescription:String,
    var Instructor:String,
    @SerializedName("course_Code")var CourseCode:String
)
