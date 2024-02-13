package me.dio.credit.application.system.dto

import me.dio.credit.application.system.entity.Credits
import me.dio.credit.application.system.entity.Customer
import java.math.BigDecimal
import java.time.LocalDate

data class CreditDto(
    val creditValue: BigDecimal,
    val dayFirstOfInstallments:LocalDate,
    val numberOfInstalmnts: Int,
    val customerId: Long
) {
    fun toEntity(): Credits = Credits(
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstOfInstallments,
        numberOfInstallments = this.numberOfInstalmnts,
        customer = Customer(id = this.customerId)
    )

}
