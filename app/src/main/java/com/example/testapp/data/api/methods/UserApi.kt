package com.example.authenticationapp.data.api.methods


import com.example.testingapp.data.api.`ApiClient.kt`
import com.example.testingapp.data.api.request.LoginRequest
import com.example.testingapp.data.api.response.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {
    @POST("/login")
    suspend fun loginUser(@Body loginRequest: LoginRequest): Response<LoginResponse>

    companion object {
        fun getApi(): UserApi? {
            return `ApiClient.kt`.client?.create(UserApi::class.java)
        }
    }
}