package com.zainul.medichapp.obat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityJenisObatBinding
import com.zainul.medichapp.mainhome.Home
import kotlinx.android.synthetic.main.activity_jenis_obat.*

class JenisObat : AppCompatActivity() {

    private lateinit var binding: ActivityJenisObatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityJenisObatBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        supportActionBar?.hide()

        back.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)

        }
        amoxilin.setOnClickListener {
            val intent = Intent(this, DetailObat::class.java)
            startActivity(intent)

        }
    }
}