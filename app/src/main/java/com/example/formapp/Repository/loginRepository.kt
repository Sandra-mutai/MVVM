package com.example.registration.Repository

import com.example.first_app.API.ApiClient
import com.example.first_app.API.ApiInterface
import com.example.first_app.models.RegistrationRequest
import com.example.first_app.models.RegistrationResponse
import com.example.formapp.models.loginRequest


import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Response

class loginRepository {
    val retrofit = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun registerUser(registrationRequest: RegistrationRequest):
            Response<RegistrationResponse> =
        withContext(Dispatchers.IO) {
            var response = retrofit.registerStudent(registrationRequest)
            return@withContext response
        }



}