

package com.example.formapp.models

import com.google.gson.annotations.SerializedName

data class loginRequest(
    var massage:String,
    @SerializedName("access_token")
    var accessToken:String,
    @SerializedName("student_id")
    var student_id:String,
)