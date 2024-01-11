package com.kotlin.playground.datasource

import com.kotlin.playground.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}