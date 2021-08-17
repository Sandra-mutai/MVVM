package com.example.first_app.API



import com.example.first_app.models.RegistrationRequest
import com.example.first_app.models.RegistrationResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("/student/register")
    suspend fun registerStudent(@Body registrationRequest: RegistrationRequest):Response<RegistrationResponse>

    @POST("/students/login")
    fun loginStudent(@Body logInRequest:RegistrationRequest): Call<RegistrationResponse>

}
