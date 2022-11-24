package com.zainul.medichapp.gelembung

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityTxSuccesBinding
import com.zainul.medichapp.mainhome.Home
import kotlinx.android.synthetic.main.activity_tx_succes.*

class TxSucces : AppCompatActivity() {
    private lateinit var binding: ActivityTxSuccesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTxSuccesBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        supportActionBar?.hide()

        kembali3.setOnClickListener {
            val intent = Intent(this, CariFaskesehatan::class.java)
            startActivity(intent)

        }

        backberanda.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)

        }
    }
}