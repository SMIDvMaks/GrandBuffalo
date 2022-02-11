package com.gdrna.boulfaf.AP

import com.gdrna.boulfaf.par
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory

const val urik = "aHR0cHM6Ly9naXN0LmdpdGh1YnVzZXJjb250ZW50LmNvbS9TTUlEdk1ha3MvZGQxODFjMjgzZTliNzEwOGNmYjZkNjc2MDlmNmIxYzYvcmF3L2NvbS5nZHJuYS5ib3VsZmFmLw=="
var liiiak:String? = null
var fiiia:String? = null
var fkkke:String? = null
class DDG {
    suspend fun getDDG(){
        val retik = Retrofit.Builder()
            .baseUrl(par.POW(urik))
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val ApS:APDATA = retik.create(APDATA::class.java)
        val bod = ApS.downloadUrik().body()
        val Arik = bod!!.split("|").toTypedArray()
        liiiak = Arik[0]
        fiiia = Arik[1]
        fkkke = Arik[2]

    }
}