package com.example.first_app.API



import com.example.first_app.models.RegistrationRequest
import com.example.first_app.models.RegistrationResponse
import com.example.formapp.models.CourseRequest
import com.example.formapp.models.CourseRespond
import com.example.formapp.models.loginRequest
import com.example.formapp.models.loginResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {
    @POST("/student/register")
    suspend fun registerStudent(@Body registrationRequest: RegistrationRequest):Response<RegistrationResponse>

    @POST("/students/login")
    fun loginStudent(@Body logInRequest:RegistrationRequest): Call<RegistrationResponse>

    @POST("/students/login")
    suspend fun loginStudent(@Body logInRequest: loginRequest): Response<loginResponse>
    @GET("/courses")
    suspend fun getCourses(@Header("Authorization") token:String, coursesRequest:CourseRequest):Response<CourseRespond>

}
