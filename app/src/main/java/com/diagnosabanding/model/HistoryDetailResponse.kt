package com.diagnosabanding.model

data class HistoryDetailResponse (
    var status: Int? = null,
    var message: Boolean? = null,
    var data: List<HistoryDetailField>
)