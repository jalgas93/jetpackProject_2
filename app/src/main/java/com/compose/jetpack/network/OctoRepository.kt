package com.compose.jetpack.network

import androidx.paging.PagingData
import com.compose.jetpack.model.Result
import kotlinx.coroutines.flow.Flow

interface OctoRepository {
    fun getA(sources:List<String>): Flow<PagingData<Result>>
}