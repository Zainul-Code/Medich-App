package com.zainul.medichapp.gelembung

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityCariFaskesehatanBinding
import com.zainul.medichapp.mainhome.Home
import kotlinx.android.synthetic.main.activity_cari_faskesehatan.*

class CariFaskesehatan : AppCompatActivity() {

    private lateinit var binding: ActivityCariFaskesehatanBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCariFaskesehatanBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        supportActionBar?.hide()

        back.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
            rs1.setOnClickListener {
            val intent = Intent(this, AturJadwal::class.java)
            startActivity(intent)

        }
    }
}