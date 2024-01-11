package com.kotlin.playground.service

import com.kotlin.playground.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BankServiceTest{

    private val dataSource: BankDataSource = mockk()
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks` () {
        // given
        every { dataSource.retrieveBanks() } returns emptyList()

        // when
        val banks = bankService.getBanks()

        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }


    }
}