import java.math.BigDecimal //импортировано для использования BigDecimal для денежных средств

fun main() {
    val account1 = Account( //создан пользователь 1
        bill = Bill(BigDecimal.valueOf(2000.00)), //объект класса Bill
        person = Person(  //объект класса Person
            firstName = "Alex",
            lastName = "Braun",
            phoneNumber = "8 (700) 300-2010"
        )
    )

    val account2 = Account( //создан пользователь 2
        bill = Bill(BigDecimal.valueOf(2000.00)), //объект класса Bill
        person = Person( //объект класса Person
            firstName = "Anna",
            lastName = "Dark",
            phoneNumber = "8 (707) 309-2243"
        )
    )

    val paymentService = PaymentService() // создан сервис для оплаты покупок, объект класса PaymentService
    paymentService.makePayment(account1, Payment(Bill(BigDecimal.valueOf(200.00)))) // реализация функций класса для совершения покупки

    val depositService = DepositService() // создан сервис для пополнения счета, объект класса DepositService
    depositService.depositMoney(account2, Adjustment(Bill(BigDecimal.valueOf(30.00)))) // реализация функций класса для пополнения счета

    val transferService = TransferService() // создан сервис для переводов между двумя счетами, объект класса TransferService
    transferService.transfer(account2, account1, Payment(Bill(BigDecimal.valueOf(70.00)))) // реализация функций класса для перевода между двумя счетами

//все операции совершенные со счетами пользователей влияют на текущий остаток на счету
}
data class Person(
    val firstName: String,
    val lastName: String,
    val phoneNumber: String
) //Класс Person содержит инфу о пользователе

data class Bill(var amount: BigDecimal)  //Класс Bill содержит поле с числовым значением внутри

data class Account(var bill: Bill, val person: Person) //Класс Account имеет поля: Bill и Person

data class Adjustment(val adjustmentBill: Bill) //Класс Adjustment содержит поле Bill

data class Payment(var billPayment: Bill)  //Класс Payment будет содержать поле Bill

class PaymentService { //покупка
    fun makePayment(acc: Account, payment: Payment) { //фун-я отвечает за совершение покупок
        println("Запрос от пользователя ${acc.person.firstName} на совершение покупки на сумму ${payment.billPayment.amount} тенге...") //инфа для польз-ля
        if(acc.bill.amount - payment.billPayment.amount >= BigDecimal.valueOf(0.00)) { //проверка критических условий
            println("Покупка совершена. Доступно: ${acc.bill.amount - payment.billPayment.amount} тенге") //выполнение условий
            acc.bill.amount = acc.bill.amount - payment.billPayment.amount //выполнение условий
        }
        else println("На Вашем счету недостаточно средств для покупки. Ваша покупка была отменена") //сообщение - если недостаточно средств
    }
}

class DepositService { //пополнение счета
    fun depositMoney(acc: Account, adjustment: Adjustment) { //фун-я выполняет пополнение счета
        if (adjustment.adjustmentBill.amount < BigDecimal.valueOf(0.00)) { // проверка критических знач-й
            println("Ошибка! Недопустимое значение.")
        } else {
            acc.bill.amount = acc.bill.amount + adjustment.adjustmentBill.amount //выполнение условий
            return println("Счет пользователя ${acc.person.firstName} пополнен на ${adjustment.adjustmentBill.amount} тенге. Доступно: ${acc.bill.amount} тенге")
        }
    }
}

class TransferService { //перевод
    fun transfer(acc1: Account, acc2: Account, payment: Payment) { //фун-я выполняет перевод денег от acc 2 к acc1
        println("Перевод денежных средств пользователю ${acc1.person.firstName} от пользователя ${acc2.person.firstName}...")//инфа для польз-ля
        if (acc2.bill.amount - payment.billPayment.amount> BigDecimal.valueOf(0.00)) { //проверка критических знач-й
            acc2.bill.amount = acc2.bill.amount - payment.billPayment.amount //выполнение условий
            println("Счет пользователя ${acc1.person.firstName} пополнен на ${payment.billPayment.amount} тенге. " +
                    "Доступно: ${acc1.bill.amount + payment.billPayment.amount} тенге")
            println("Для пользователя ${acc2.person.firstName} доступно ${acc2.bill.amount} тенге") //выполнение условий

        } else println("Недостаточно средств на счету ${acc2.person.firstName}. Операция отменена")
        //выполняется при несоответствии условий
    }
}
