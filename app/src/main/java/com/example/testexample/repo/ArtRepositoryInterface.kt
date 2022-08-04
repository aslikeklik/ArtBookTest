package com.example.testexample.repo

import androidx.lifecycle.LiveData
import com.example.testexample.model.ImageResponse
import com.example.testexample.roomdb.Art
import com.example.testexample.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>
}