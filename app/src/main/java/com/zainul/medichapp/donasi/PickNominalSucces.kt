package com.zainul.medichapp.donasi

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityPickNominalSuccesBinding
import kotlinx.android.synthetic.main.activity_pick_nominal_succes.*
class PickNominalSucces : AppCompatActivity() {
    private lateinit var binding: ActivityPickNominalSuccesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPickNominalSuccesBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        supportActionBar?.hide()

        btndonasi.setOnClickListener {
            val intent = Intent(this, DonasiSucces::class.java)
            startActivity(intent)

        }
    }
}
