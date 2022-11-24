package com.zainul.medichapp.gelembung

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityLanjutBayarBinding
import kotlinx.android.synthetic.main.activity_lanjut_bayar.*

class LanjutBayar : AppCompatActivity() {
    private lateinit var binding: ActivityLanjutBayarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLanjutBayarBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        supportActionBar?.hide()

        kembali2.setOnClickListener {
            val intent = Intent(this, Checkout::class.java)
            startActivity(intent)

        }

        btnlanjutbayar.setOnClickListener {
            val intent = Intent(this, TxSucces::class.java)
            startActivity(intent)

        }
    }
}