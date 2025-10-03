package com.gyasrsilalsolabki011.newsapp.data.interceptors

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val url = request.url

        val authUrl = url.newBuilder().addQueryParameter("apiKey", "11684d78e9814d248cc93148f607c991").build()
        val authRequest = request.newBuilder().url(authUrl).build()

        return chain.proceed(authRequest)
    }
}