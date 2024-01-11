package com.kotlin.playground.datasource.mock

import com.kotlin.playground.datasource.BankDataSource
import com.kotlin.playground.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {

    val banks = listOf(
        Bank("12345", 3.4, 17),
        Bank("12365", 3.4, 0),
        Bank("12346", 0.0, 17),
    )
    override fun retrieveBanks(): Collection<Bank> = banks
}