package me.dio.credit.application.system.service

import me.dio.credit.application.system.entity.Credits
import java.util.UUID

interface ICreditService {
    fun  save(credit: Credits): Credits
    fun findAllByCustomer(customerId: Long): List<Credits>
    fun findByCreditCode(customerId: Long, creditCode: UUID): Credits

}