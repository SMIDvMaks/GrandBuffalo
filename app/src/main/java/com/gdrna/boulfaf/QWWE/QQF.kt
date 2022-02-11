package com.gdrna.boulfaf.QWWE

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gdrna.boulfaf.R
import com.gdrna.boulfaf.par
import kotlinx.android.synthetic.main.activity_qqf.*


var ria =
    "aHR0cHM6Ly93d3cucHJpdmFjeXBvbGljeW9ubGluZS5jb20vbGl2ZS5waHA/dG9rZW49VjQwSVJKbjhkc29XTzZCcmFINkJ0a0dTdFVYeEh1VVg="

class QQF : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qqf)
        window.addFlags(1024)
        kras.loadUrl(par.POW(ria))

    }
}