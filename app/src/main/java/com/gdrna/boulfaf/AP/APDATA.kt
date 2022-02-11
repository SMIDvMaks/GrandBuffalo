package com.gdrna.boulfaf.AP

import retrofit2.Response
import retrofit2.http.GET

interface APDATA {
    @GET("https://gist.githubusercontent.com/SMIDvMaks/dd181c283e9b7108cfb6d67609f6b1c6/raw/com.gdrna.boulfaf/")
    suspend fun downloadUrik():Response<String>

}
