package com.zainul.medichapp.dokter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityDetailDokterBinding
import kotlinx.android.synthetic.main.activity_detail_dokter.*

class DetailDokter : AppCompatActivity() {
    private lateinit var binding: ActivityDetailDokterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailDokterBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        supportActionBar?.hide()

    }
}