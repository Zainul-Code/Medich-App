package com.zainul.medichapp.obat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zainul.medichapp.databinding.ActivityNextPaymentBinding
import kotlinx.android.synthetic.main.activity_next_payment.*

class NextPayment : AppCompatActivity() {

    private lateinit var binding: ActivityNextPaymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextPaymentBinding.inflate(layoutInflater)

        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        supportActionBar?.hide()

        btnlanjtpay.setOnClickListener {
            val intent = Intent(this, Txberhasil::class.java)
            startActivity(intent)
        }
    }
}