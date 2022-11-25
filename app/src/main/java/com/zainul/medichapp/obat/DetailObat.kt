package com.zainul.medichapp.obat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityDetailObatBinding
import kotlinx.android.synthetic.main.activity_detail_obat.*

class DetailObat : AppCompatActivity() {

    private lateinit var binding: ActivityDetailObatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailObatBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        supportActionBar?.hide()

        back.setOnClickListener {
            val intent = Intent(this, JenisObat::class.java)
            startActivity(intent)

        }
        butonbayar.setOnClickListener {
            val intent = Intent(this, Chechout::class.java)
            startActivity(intent)

        }
    }
}