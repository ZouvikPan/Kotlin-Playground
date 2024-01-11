package com.kotlin.playground.datasource

import com.kotlin.playground.model.Bank

interface BankDataSource {
    fun getBanks(): Collection<Bank>
}