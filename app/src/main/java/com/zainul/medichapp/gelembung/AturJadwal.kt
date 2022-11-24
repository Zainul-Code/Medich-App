package com.zainul.medichapp.gelembung

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityAturJadwalBinding
import kotlinx.android.synthetic.main.activity_atur_jadwal.*

class AturJadwal : AppCompatActivity() {

        private lateinit var binding: ActivityAturJadwalBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityAturJadwalBinding.inflate(layoutInflater)

            //memanggil layout dengan menggunakan binding.root
            setContentView(binding.root)

            supportActionBar?.hide()

            backabuabu.setOnClickListener {
                val intent = Intent(this, CariFaskesehatan::class.java)
                startActivity(intent)

            }
            btn_pesan.setOnClickListener {
                val intent = Intent(this, Checkout::class.java)
                startActivity(intent)

            }
        }
    }
