package com.kcruz.cryptochallenge.domain

data class ExchangeOrderBook(
    val book: String,
    val minimumAmount: String,
    val maximumAmount: String,
    val minimumPrice: String,
    val maximumPrice: String,
    val minimumValue: String,
    val maximumValue: String
)