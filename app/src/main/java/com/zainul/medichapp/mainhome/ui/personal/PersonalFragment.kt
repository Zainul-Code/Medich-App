package com.zainul.medichapp.mainhome.ui.personal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.zainul.medichapp.R
import com.zainul.medichapp.databinding.FragmentPersonalBinding
import kotlinx.android.synthetic.main.fragment_personal.*

class PersonalFragment : Fragment() {


    private var _binding: FragmentPersonalBinding? = null
    lateinit var auth: FirebaseAuth

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPersonalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        auth = FirebaseAuth.getInstance()
        val user = auth.currentUser

        //kondisi user sedang login atau tidak
        if (user != null) {
            binding.edtName.setText(user.displayName)
            binding.edtEmail.text = user.email
        }

            logout.setOnClickListener {
                findNavController().navigate(R.id.action_logout_to_login)
            }
        }
    }
