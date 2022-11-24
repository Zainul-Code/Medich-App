package com.zainul.medichapp.doktermenus

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityDokterBinding
import com.zainul.medichapp.mainhome.Home
import kotlinx.android.synthetic.main.activity_dokter.*

class dokter : AppCompatActivity() {

    private lateinit var binding: ActivityDokterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDokterBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        supportActionBar?.hide()

        backabu.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)

        }
    }
}