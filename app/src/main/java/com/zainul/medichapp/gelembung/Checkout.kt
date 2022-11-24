package com.zainul.medichapp.gelembung

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityCheckoutBinding
import kotlinx.android.synthetic.main.activity_checkout.*

class Checkout : AppCompatActivity() {
        private lateinit var binding: ActivityCheckoutBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityCheckoutBinding.inflate(layoutInflater)

            //memanggil layout dengan menggunakan binding.root
            setContentView(binding.root)

            supportActionBar?.hide()

            kembali1.setOnClickListener {
                val intent = Intent(this, CariFaskesehatan::class.java)
                startActivity(intent)

            }
            butonbayar.setOnClickListener {
                val intent = Intent(this, LanjutBayar::class.java)
                startActivity(intent)

            }
        }
    }
