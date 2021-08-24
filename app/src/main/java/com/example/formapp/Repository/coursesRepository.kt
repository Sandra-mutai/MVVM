package com.example.formapp.Repository

import com.example.first_app.API.ApiClient
import com.example.first_app.API.ApiInterface
import com.example.formapp.models.CourseRespond
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class coursesRepository {
    var  apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)

}
suspend fun courses(accessToken:String): Response<List<CourseRespond>> = withContext(Dispatchers.IO){
    var response = ApiInterface.getCourses(accessToken)
    return@withContext response
}
