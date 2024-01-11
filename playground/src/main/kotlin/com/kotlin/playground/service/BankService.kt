package com.kotlin.playground.service

import com.kotlin.playground.datasource.BankDataSource
import com.kotlin.playground.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank>{
        return dataSource.retrieveBanks()
    }

}