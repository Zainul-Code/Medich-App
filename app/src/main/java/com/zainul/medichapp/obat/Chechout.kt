package com.zainul.medichapp.obat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityChechoutBinding
import kotlinx.android.synthetic.main.activity_chechout.*

class Chechout : AppCompatActivity() {

    private lateinit var binding: ActivityChechoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChechoutBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        supportActionBar?.hide()

        kembali1.setOnClickListener {
            val intent = Intent(this, DetailObat::class.java)
            startActivity(intent)

        }
        butonbayar.setOnClickListener {
            val intent = Intent(this, NextPayment::class.java)
            startActivity(intent)

        }
    }
}