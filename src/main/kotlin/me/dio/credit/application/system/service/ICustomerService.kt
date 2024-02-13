package me.dio.credit.application.system.service

import me.dio.credit.application.system.entity.Customer

interface ICustomerService {
    fun save(customer: Customer): Customer
    fun findById(id: Long): Customer
    fun delete(id: Long)

    // se for mais complexa a regra de negocio criar Update
}