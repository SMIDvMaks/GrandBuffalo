package com.gdrna.boulfaf

import android.app.Activity
import android.content.Context
import android.util.Base64
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*


var puhsha = "Yzk2OTkzYjYtYTVhMC00YzY2LWE4Y2MtMjQyMWJkOTNmNjc2"
var ap_id_fle = "RGdSZTNFQWp2V01iRVNHRHJ4NUdxNA=="
var adkaq: String? = null
var AQue: String? = null
var ssaq: String? = null
var paras: String? = null
var fbecha: String? = null
var par = PAR()


class Ititi : AppCompatActivity() {
    @OptIn(DelicateCoroutinesApi::class)
    fun kraswq(contika: Context) {
        GlobalScope.launch {
            val ytqs: AdvertisingIdClient.Info = AdvertisingIdClient.getAdvertisingIdInfo(contika)
            adkaq = ytqs.id
        }
    }

    fun povesnik(gloaq: Context) {
        val contyehD = object : AppsFlyerConversionListener {
            override fun onConversionDataSuccess(pepka: MutableMap<String, Any>?) {
                for (jqj in pepka!!.keys)
                    ssaq =
                        Objects.requireNonNull(pepka[POW("YWZfc3RhdHVz")]).toString()
                if (ssaq == POW("Tm9uLW9yZ2FuaWM=")) {
                    val kranh = Objects.requireNonNull(pepka[POW("Y2FtcGFpZ24=")]).toString()
                    paras = par.Parek(kranh)
                }
            }

            override fun onConversionDataFail(p0: String?) {}

            override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}

            override fun onAttributionFailure(p0: String?) {}

        }
        AQue = AppsFlyerLib.getInstance().getAppsFlyerUID(gloaq)
        AppsFlyerLib.getInstance().run {
            init(POW(ap_id_fle), contyehD, gloaq)
            start(gloaq)
        }

    }

    fun JoqFA(idepal: String, contikw: Context): String? {
        FacebookSdk.setApplicationId(idepal)
        FacebookSdk.sdkInitialize(contikw)
        FacebookSdk.setAutoInitEnabled(true)
        FacebookSdk.fullyInitialize()
        FacebookSdk.setAdvertiserIDCollectionEnabled(true)
        FacebookSdk.setAutoLogAppEventsEnabled(true)
        AppLinkData.fetchDeferredAppLinkData(contikw) { appLinkData ->
            var apicheq = appLinkData
            if (apicheq == null) {
                apicheq = AppLinkData.createFromActivity(contikw as Activity?)
            }
            if (apicheq != null) {
                val uejq = apicheq.targetUri
                val webaiq = uejq?.query
                fbecha = par.Parek(webaiq.toString())
            } else {
            }
        }
        return fbecha
    }

    fun POW(krye: String): String {
        val haqe = String(Base64.decode(krye, Base64.DEFAULT))
        return haqe
    }


}