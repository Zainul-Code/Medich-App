package com.zainul.medichapp.mainhome.ui.home


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zainul.medichapp.databinding.FragmentHomeBinding
import com.zainul.medichapp.doktermenus.dokter
import com.zainul.medichapp.gelembung.CariFaskesehatan
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.gambar1.setOnClickListener {
            val intent = Intent(activity, dokter::class.java)
            startActivity(intent)
        }
        view.gambar2.setOnClickListener {
            val intent = Intent(activity, CariFaskesehatan::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }
}
