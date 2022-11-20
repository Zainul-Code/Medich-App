package com.zainul.medichapp

import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.zainul.medichapp.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.view.*

class LoginActivity : Fragment(R.layout.activity_login) {
    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!
    lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = ActivityLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        auth = FirebaseAuth.getInstance()

        view.bawahDaftar.setOnClickListener {
            findNavController().navigate(R.id.action_Daftar_to_Daftaractivity)
        }

        binding.btnLogin.setOnClickListener {
            val email = binding.editEmail.text.toString()
            val password = binding.editPasword.text.toString()

            //Validasi email
            if (email.isEmpty()) {
                binding.editEmail.error = "Email Harus Diisi"
                binding.editEmail.requestFocus()
                return@setOnClickListener
            }

            //Validasi email tidak sesuai
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.editPasword.error = "Email Tidak Valid"
                binding.editPasword.requestFocus()
                return@setOnClickListener
            }

            //Validasi password
            if (password.isEmpty()) {
                binding.editPasword.error = "Password Harus Diisi"
                binding.editPasword.requestFocus()
                return@setOnClickListener
            }
            LoginFirebase(email,password)
        }
    }

    private fun LoginFirebase(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(requireActivity()) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(activity, "Selamat datang $email", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(R.id.action_login_to_location)
                } else {
                    Toast.makeText(activity, "${task.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}