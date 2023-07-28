package com.za.dictionary.feature_dictionary.domain.repository

import com.za.dictionary.core.util.Resource
import com.za.dictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}