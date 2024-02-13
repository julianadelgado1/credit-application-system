package me.dio.credit.application.system.service.impl

import me.dio.credit.application.system.entity.Credits
import me.dio.credit.application.system.repository.CreditRepository
import me.dio.credit.application.system.service.ICreditService
import org.springframework.stereotype.Service
import java.util.*

@Service
class CreditService(
    private val creditRepository: CreditRepository,
    private val customerService: CustomerService
): ICreditService {
    override fun save(credit: Credits): Credits {
        credit.apply { customer = customerService.findById(credit.customer?.id!!)
        }
        return  this. creditRepository.save(credit)
    }

    override fun findAllByCustomer(customerId: Long): List<Credits> = this.creditRepository.findAllByCustomerId(customerId)



    override fun findByCreditCode(customerId: Long, creditCode: UUID): Credits {
        val credit: Credits = (this.creditRepository.findByCreditCode(creditCode)
            ?: throw RuntimeException("CreditCode not found"))
        return if (credit.customer?.id == customerId) credit else throw RuntimeException("Contact adm")
    }
}