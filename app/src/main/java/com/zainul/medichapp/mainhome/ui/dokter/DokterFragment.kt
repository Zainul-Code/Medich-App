package com.zainul.medichapp.mainhome.ui.dokter

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.zainul.medichapp.databinding.FragmentDokterBinding
import com.zainul.medichapp.dokter.DetailDokter
import kotlinx.android.synthetic.main.fragment_dokter.view.*

class DokterFragment : Fragment() {

    private var _binding: FragmentDokterBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(DokterViewModel::class.java)

        _binding = FragmentDokterBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.dr3.setOnClickListener {
            val intent = Intent(activity, DetailDokter::class.java)
            startActivity(intent)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}