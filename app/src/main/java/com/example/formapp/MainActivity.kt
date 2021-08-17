package com.example.first_app.UI


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.activity.viewModels
import com.example.first_app.models.RegistrationRequest
import com.example.formapp.R
import com.example.formapp.databinding.ActivityMainBinding
import com.example.registration.ViewModel.UserViewModel
import com.example.registration.ViewModel.loginViewModel


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val userViewModel: UserViewModel by viewModels()
    val loginViewModel: loginViewModel by viewModels()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)


        fun setupSpinner() {
            var nationalities = arrayOf("Kenya", "Uganda", "Rwanda", "SouthSudan")
            var nationalitiesAdapter =
                ArrayAdapter(baseContext, android.R.layout.simple_spinner_item, nationalities)
            nationalitiesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            binding.spnnationality.adapter = nationalitiesAdapter

            binding.button.setOnClickListener {
                if (binding.etname.text.toString().isEmpty() || binding.etdob.text.toString()
                        .isEmpty() || binding.etnumber.text.toString().isEmpty()
                ) {
                    binding.etnem.setError("Please input name")
                    binding.etdb.setError("Please input Date of Birth")
                    binding.etemaill.setError("Please input email")
                    binding.etnumber.setError("Please input phone")
                    binding.etno.setError("Please input phone")
                    binding.spnnationality.setError("Please input phone")


                }
                var name = binding.etnem.text.toString()
                var date_of_birth = binding.etdb.text.toString()
                var email = binding.etemaill.text.toString()
                var phone_number = binding.etnumber.text.toString()
                var id_number = binding.etno.text.toString()
//                var nationality = binding.spnnationality.selectItem.toString


                var registrationRequest = RegistrationRequest(
                    name = name,
                    phoneNumber = phone_number,
                    email = email,
//                  nationality = nationality,
                    dateOfBirth = date_of_birth,
                )
                userViewModel.registerStudent(registrationRequest)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        userViewModel.registrationResponseLiveData.observe(this, { regResponse ->
            if (!regResponse.studentId.isNullOrEmpty()) {
                Toast.makeText(baseContext, "Registration success", Toast.LENGTH_LONG).show()
            }
        })
        userViewModel.registrationErrorLiveData.observe(this, { error ->
            Toast.makeText(baseContext, error, Toast.LENGTH_LONG).show()

        })

    }

    fun inResume() {
//        super.inRume()
        loginViewModel.registrationResponseLiveData.observe(this, { regResponse ->
            if (!regResponse.studentId.isNullOrEmpty()) {
                Toast.makeText(baseContext, "login success", Toast.LENGTH_LONG).show()
            }
        })
        loginViewModel.registrationErrorLiveData.observe(this, { error ->
            Toast.makeText(baseContext, error, Toast.LENGTH_LONG).show()

        })


    }
}



