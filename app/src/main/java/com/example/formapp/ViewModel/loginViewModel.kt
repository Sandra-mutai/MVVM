package com.example.registration.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.first_app.models.RegistrationRequest
import com.example.first_app.models.RegistrationResponse
import com.example.registration.Repository.UserRepository
import kotlinx.coroutines.launch

class loginViewModel:ViewModel() {
    var loginRepository=UserRepository()
    var registrationResponseLiveData=MutableLiveData<RegistrationResponse>()
    var registrationErrorLiveData=MutableLiveData<String>()


    fun registerStudent(registrationRequest: RegistrationRequest){
        viewModelScope.launch {
            var response=loginRepository.registerUser(registrationRequest)
            if (response.isSuccessful){
                registrationResponseLiveData.postValue(response.body())
            }
            else{
                registrationErrorLiveData.postValue(response.errorBody()?.string())
            }
        }
    }

}