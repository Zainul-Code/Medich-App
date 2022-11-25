package com.zainul.medichapp.mainhome.ui.donasi

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.zainul.medichapp.databinding.FragmentDonasiBinding
import com.zainul.medichapp.donasi.PayDonasi
import com.zainul.medichapp.mainhome.ui.notifications.DonasiViewModel
import kotlinx.android.synthetic.main.fragment_donasi.view.*

class DonasiFragment : Fragment() {

    private var _binding: FragmentDonasiBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this)[DonasiViewModel::class.java]

        _binding = FragmentDonasiBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.btndonasiskrng.setOnClickListener {
            val intent = Intent(activity, PayDonasi::class.java)
            startActivity(intent)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}