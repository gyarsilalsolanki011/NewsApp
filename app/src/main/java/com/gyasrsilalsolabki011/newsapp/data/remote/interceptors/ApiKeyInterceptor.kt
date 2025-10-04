package com.gyasrsilalsolabki011.newsapp.data.remote.interceptors

import com.gyasrsilalsolabki011.newsapp.utils.Constants.API_KEY
import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val url = request.url

        val authUrl = url.newBuilder().addQueryParameter("apiKey", API_KEY).build()
        val authRequest = request.newBuilder().url(authUrl).build()

        return chain.proceed(authRequest)
    }
}