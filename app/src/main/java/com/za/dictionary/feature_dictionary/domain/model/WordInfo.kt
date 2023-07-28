package com.za.dictionary.feature_dictionary.domain.model

import com.za.dictionary.feature_dictionary.data.remote.dto.License
import com.za.dictionary.feature_dictionary.data.remote.dto.MeaningDto
import com.za.dictionary.feature_dictionary.data.remote.dto.PhoneticDto

data class WordInfo (
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String
        )