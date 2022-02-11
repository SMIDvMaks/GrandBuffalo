package com.gdrna.boulfaf

import android.util.Base64
import com.onesignal.OneSignal
import java.lang.NullPointerException

class PAR {

    var kir: String? = null
    var laq: String? = null
    var ytr: String? = null
    var leu: String? = null
    var nte: String? = null
    var ljen: String? = null
    var uiq: String? = null

    lateinit var pacyt: Array<String>
    fun Parek(luek: String): String {
        pacyt = luek.split("::").toTypedArray()
        try {
            kir = pacyt[0]
        }catch (e: NullPointerException){
          kir = ""
        }
        try {
            laq = pacyt[1]
        } catch (e: NullPointerException) {
            laq = ""
        }
        try {
            ytr = pacyt[2]
        } catch (e: NullPointerException) {
            ytr = ""
        }
        try {
            leu = pacyt[3]
        }catch (e: NullPointerException){
            leu = ""
        }
        try {
            nte = pacyt[4]
        }catch (e: NullPointerException){
            nte = ""
        }
        try {
            ljen = pacyt[5]
        }catch (e: NullPointerException){
            ljen = ""
        }
        try {
            uiq = pacyt[6]
        }catch (e: NullPointerException){
            uiq = ""
        }

        OneSignal.sendTag(POW("c3ViX2FwcA=="), laq)
        val AppsParametrcheking =
            (kir + POW("P2J1bmRsZT0=") + POW(pacedgeName)
                    + POW("JmFkX2lkPQ==") + adkaq + POW("JmFwcHNfaWQ9")
                    + AQue +
                    POW("JmRldl9rZXk9") + POW(ap_id_fle) +
                    POW("JnN1YjY9") + laq +
                    POW("JnN1Yjc9") + ytr +
                    POW("JnN1YjI9") + leu +
                    POW("JnN1YjM9") + nte +
                    POW("JnN1YjQ9") + ljen +
                    POW("JnN1YjU9") + uiq)

        return AppsParametrcheking
    }


    fun POW(krye: String): String {
        val haqe = String(Base64.decode(krye, Base64.DEFAULT))
        return haqe
    }
}