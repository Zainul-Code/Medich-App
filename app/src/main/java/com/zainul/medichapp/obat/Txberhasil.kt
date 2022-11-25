package com.zainul.medichapp.obat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityTxberhasilBinding
import com.zainul.medichapp.mainhome.Home
import kotlinx.android.synthetic.main.activity_txberhasil.*

class Txberhasil : AppCompatActivity() {

    private lateinit var binding: ActivityTxberhasilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTxberhasilBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        supportActionBar?.hide()

        kembali3.setOnClickListener {
            val intent = Intent(this, JenisObat::class.java)
            startActivity(intent)

        }
        backberanda.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}