package com.example.formapp

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.formapp.databinding.ActivityCourseBinding.inflate
import com.example.formapp.databinding.ActivityCoursesBinding.inflate
import com.example.formapp.databinding.ActivityLogin2Binding.inflate
import com.example.registration.ViewModel.loginViewModel

class login_Activity : AppCompatActivity() {
    lateinit var binding :login_ActivityBinding
    val loginViewModel:loginViewModel by viewModels()
    lateinit var sharedPrefs:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding=login_Activity.inflate(layoutInflater)
//        setContentView(binding.Root)
    }
}

class login_ActivityBinding {


}
