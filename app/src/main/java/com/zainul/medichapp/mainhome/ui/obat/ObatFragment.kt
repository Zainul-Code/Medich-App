package com.zainul.medichapp.mainhome.ui.obat

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zainul.medichapp.databinding.FragmentObatBinding
import com.zainul.medichapp.obat.JenisObat
import kotlinx.android.synthetic.main.fragment_obat.view.*


class ObatFragment : Fragment() {

    private var _binding: FragmentObatBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentObatBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

         view.apotik2.setOnClickListener {
            val intent = Intent(activity, JenisObat::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}
