package com.gdrna.boulfaf

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import android.view.View
import android.webkit.*
import android.widget.ProgressBar
import com.gdrna.boulfaf.AP.DDG
import com.gdrna.boulfaf.AP.fkkke
import com.gdrna.boulfaf.AP.fiiia
import com.gdrna.boulfaf.AP.liiiak
import com.onesignal.OneSignal
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@SuppressLint("StaticFieldLeak")
lateinit var webarocha: WebView
var iti = Ititi()
var tet = TET()
var ddg = DDG()

class G9B3 : AppCompatActivity() {
    private val yqgwb = 100
    private var ibraj: ValueCallback<Array<Uri>>? = null
    var lasik: String? = null

    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.addFlags(1024)
        webarocha = findViewById(R.id.webarika)
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(par.POW(puhsha))
        iti.kraswq(this)
        iti.povesnik(this)
        val pixqw = getPreferences(Context.MODE_PRIVATE)
        lasik = pixqw.getString("kopav-15123", null)
        webarocha.webViewClient = object : WebViewClient() {
            override fun onPageStarted(yqy: WebView?, ooo: String?, laqs: Bitmap?) {
                super.onPageStarted(yqy, ooo, laqs)
                if (ooo?.contains(par.POW("Z2FwcHM9NDA0")) == true) kreqs(this@G9B3)
                prox.visibility = ProgressBar.INVISIBLE
            }

            override fun onPageFinished(iqu: WebView?, qyj: String?) {
                super.onPageFinished(iqu, qyj)
                pixqw.edit().putString("kopav-15123", qyj).apply()
            }
        }

        webarocha.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                oiqj: WebView?,
                rteuq: ValueCallback<Array<Uri>>?,
                gooa: FileChooserParams?
            ): Boolean {
                if (ibraj != null) {
                    ibraj!!.onReceiveValue(null)
                    ibraj = null
                }
                ibraj = rteuq
                try {
                    val corena = Intent(Intent.ACTION_GET_CONTENT)
                    corena.addCategory(Intent.CATEGORY_OPENABLE)
                    corena.type = "*/*"
                    startActivityForResult(
                        Intent.createChooser(corena, "Fiposa"),
                        yqgwb
                    )
                } catch (ert: ActivityNotFoundException) {
                    ibraj = null
                    return false
                }
                return true
            }
        }

        if (Lopenq() == 0) {
            GlobalScope.launch {
                ddg.getDDG()
                iti.JoqFA(fkkke!!, this@G9B3)
                if (lasik != null) {
                    runOnUiThread(Runnable {
                        sabchikWea(lasik.toString())
                    })
                } else {
                    Handler(Looper.getMainLooper()).postDelayed({
                        tet.tetoiajq(liiiak!!, fiiia!!, fbecha,this@G9B3)
                    }, 5000)
                }
            }
        } else {
            kreqs(this)
        }





    }
    override fun onActivityResult(yyyqa: Int, resiik: Int, adada: Intent?) {
        super.onActivityResult(yyyqa, resiik, adada)
        if (yyyqa == yqgwb) {
            if (ibraj == null) return
            ibraj!!.onReceiveValue(
                WebChromeClient.FileChooserParams.parseResult(
                    resiik,
                    adada
                )
            )
            ibraj = null
        }
    }


    override fun onBackPressed() {
        if (webarocha.isFocused && webarocha.canGoBack()) {
            webarocha.goBack()
        }
    }


    @SuppressLint("SetJavaScriptEnabled")
    fun sabchikWea(uiqk: String) {
        webarocha.visibility = View.VISIBLE
        webarocha.settings.apply {
            setAppCacheEnabled(true)
            allowFileAccessFromFileURLs = true
            saveFormData = true
            mixedContentMode = 0
            savePassword = true
            allowContentAccess = true
            setRenderPriority(WebSettings.RenderPriority.HIGH)
            setEnableSmoothTransition(true)
            loadsImagesAutomatically = true
            allowUniversalAccessFromFileURLs = true
            databaseEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true
            javaScriptCanOpenWindowsAutomatically = true
            domStorageEnabled = true
            allowFileAccess = true
            javaScriptEnabled = true
        }
        webarocha.loadUrl(uiqk)
    }


    fun Lopenq(): Int {
        val pika = Settings.Secure.getInt(
            this.contentResolver, Settings.Global.DEVELOPMENT_SETTINGS_ENABLED, 0
        )
        return pika
    }

    fun kreqs(jooc: Context) {
        val qjicjn = Intent(jooc, SiprkqSta::class.java)
        jooc.startActivity(qjicjn)
        finish()
    }


}