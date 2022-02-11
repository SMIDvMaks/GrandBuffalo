package com.gdrna.boulfaf


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gdrna.boulfaf.QWWE.QQA
import com.gdrna.boulfaf.QWWE.QQF
import kotlinx.android.synthetic.main.activity_siprkq_sta.*

class SiprkqSta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_siprkq_sta)
        window.addFlags(1024)

        Startttt.setOnClickListener { staqqq() }
        privaqee.setOnClickListener { wwwwr() }
        vixod.setOnClickListener { uru() }



    }


    fun staqqq() {
        val cherik = Intent(this, QQA::class.java)
        startActivity(cherik)
    }

    fun wwwwr() {
        val cherik = Intent(this, QQF::class.java)
        startActivity(cherik)
    }

    fun uru() {
        finishAffinity()
    }
}