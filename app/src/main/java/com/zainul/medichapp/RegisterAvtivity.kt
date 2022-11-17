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
import com.zainul.medichapp.databinding.ActivityRegisterAvtivityBinding
import kotlinx.android.synthetic.main.activity_register_avtivity.view.*

class RegisterAvtivity : Fragment(R.layout.activity_register_avtivity) {

    private var _binding: ActivityRegisterAvtivityBinding? = null
    private val binding get() = _binding!!
    lateinit var auth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = ActivityRegisterAvtivityBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


            auth = FirebaseAuth.getInstance()

        view.bawahMasuk.setOnClickListener {
            findNavController().navigate(R.id.action_masuk_to_loginactivity)
        }

        binding.btnRegis.setOnClickListener {
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
                binding.editEmail.error = "Email Tidak Valid"
                binding.editEmail.requestFocus()
                return@setOnClickListener
            }

            //Validasi password
            if (password.isEmpty()) {
                binding.editPasword.error = "Password Harus Diisi"
                binding.editPasword.requestFocus()
                return@setOnClickListener
            }

            //Validasi panjang password
            if (password.length < 6) {
                binding.editPasword.error = "Password Minimal 6 Karakter"
                binding.editPasword.requestFocus()
                return@setOnClickListener
            }

        RegisterFirebase(email, password)
    }
}

private fun RegisterFirebase(email: String, password: String) {
    auth.createUserWithEmailAndPassword(email, password)
        .addOnCompleteListener(requireActivity()) { task ->
        if (task.isSuccessful) {
            Toast.makeText(activity,"Register Berhasil" ,Toast.LENGTH_SHORT).show();
                findNavController().navigate(R.id.action_masuk_to_loginactivity)
            } else {
            Toast.makeText(activity, "${task.exception?.message}", Toast.LENGTH_SHORT).show()
            }
        }
}
}