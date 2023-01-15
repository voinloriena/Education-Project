fun main() {
    val person1 = Client("Elvira", "Abzhanova", "87751151565", "google.com", 1, Bill(45000.00))
    val person2 = Client("Vacanda", "Black", "87323456", "com", 2, Bill(44000.00))
    val person3 = Client("Brad", "Jains", "87435678", "com", 5, Bill(140000.00))

    val clients = listOf(person1, person2, person3) //общий список клиентов (объектов класса client)

    val roomEleon1 = Room("Полу-люкс для 2-х человек", 2, 15000.00, false)
    val roomEleon2 = Room("Полу-люкс для 4-ч человек", 4, 20000.00, false)
    val roomEleon3 = Room("Полу-люкс для 6-х человек", 6, 35000.00, true)
    val eleonRooms = listOf(roomEleon1, roomEleon2, roomEleon3)
    val hotelEleon = Hotel("Eleon",eleonRooms)

    val roomForside1 = Room("Премиум для 2-x человек",2, 30000.00, true)
    val roomForside2 = Room("Люкс для 4-ч человек",4, 35000.00, true)
    val roomForside3 = Room("Эконом для 6-х человек", 6, 45000.00, false)
    val forsideRooms = listOf(roomForside1, roomForside2, roomForside3)
    val hotelForside = Hotel("Forside",forsideRooms)

    val hotels = listOf(hotelEleon, hotelForside) //общий список отелей (объектов класса hotel)
    val registration = Registration() //объект класса registration, который будет выполнять реализацию функции orderRoom для резерва номеров
    registration.orderRoom(hotels.random(), clients.random()) /*функция orderRoom выполняет резерва номеров для
    // конкретного клиента. Функция random выбирает случайный отель и случайного клиента для реализации*/

}
data class Hotel(val hotelName: String, val rooms: List<Room>)
data class Room(val name: String, val maxNumberOfPeople: Int, val price: Double, var isFree: Boolean)
data class Bill(var nextDouble: Double)
data class Client(val name: String, val surname: String, val phoneNumber: String, val email: String, var countPeople: Int, val bill: Bill)
class Registration { //класс содержит функцию для резерва номеров

    fun orderRoom(hotel: Hotel, client: Client) { //фун-я принимает в кач-ве арг-ов объекты класса hotel и client
        for (it in hotel.rooms) { //цикл проходит по списку номеров
            if (it.isFree) { // если номер свободен - выполняются следующие условия
                if (it.price <= client.bill.nextDouble && it.maxNumberOfPeople > client.countPeople) {  //кол-во людей в номере БОЛЬШЕ кол-ва клиентов + цена < денег у клиента
                    println("Номер: ${it.name} в отеле ${hotel.hotelName} стоимостью ${it.price} тенге может быть зарезервирован на сутки для ${client.countPeople} человек, " +
                            "на имя ${client.name}. Доступно: ${client.bill.nextDouble} тенге")
                    client.bill.nextDouble = client.bill.nextDouble - it.price //цена номера списывается со счета клиента
                    it.isFree = false //номер забронирован и становится занят
                    println("Номер забронирован для клиента: ${client.name} ${client.surname}, tel.: ${client.phoneNumber}, email: ${client.email}. Остаток на счету: ${client.bill.nextDouble} тенге")
                    break

                } else if (it.price <= client.bill.nextDouble && it.maxNumberOfPeople == client.countPeople) { //кол-во людей в номере РАВНО кол-ву клиентов + цена < денег у клиента
                    println("Номер: ${it.name} в отеле ${hotel.hotelName} стоимостью ${it.price} тенге может быть зарезервирован на сутки " +
                            "для ${client.countPeople} человек на имя ${client.name}. Доступно: ${client.bill.nextDouble} тенге")
                    client.bill.nextDouble = client.bill.nextDouble - it.price //цена номера списывается со счета клиента
                    it.isFree = false //номер забронирован и становится занят
                    println("Номер забронирован для клиента: ${client.name} ${client.surname}, tel.: ${client.phoneNumber}, email: ${client.email}. Остаток на счету: ${client.bill.nextDouble} тенге")
                    break

                }  else if (it.price <= client.bill.nextDouble && it.maxNumberOfPeople < client.countPeople) { //для заселения большого кол-ва людей отдельно + цена < денег у клиента
                    println("Номер: ${it.name} в отеле ${hotel.hotelName} стоимостью ${it.price} тенге может быть зарезервирован на сутки " +
                            "для ${it.maxNumberOfPeople} человек из ${client.countPeople}, на имя ${client.name}. Доступно: ${client.bill.nextDouble} тенге")
                    client.countPeople = client.countPeople - it.maxNumberOfPeople // новое кол-во людей
                    client.bill.nextDouble = client.bill.nextDouble - it.price //цена номера списывается со счета клиента
                    it.isFree = false //номер забронирован и становится занят
                    println("Номер забронирован для клиента: ${client.name} ${client.surname}, tel.: ${client.phoneNumber}, email: ${client.email}. Остаток на счету: ${client.bill.nextDouble} тенге")
                    continue

                } else if (it.price > client.bill.nextDouble) { //цена номера БОЛЬШЕ чем доступно на счету клиента
                    println("Номер: ${it.name} в отеле ${hotel.hotelName} стоимостью ${it.price} тенге не может быть " +
                            " зарезервирован для ${client.name}. Недостаточно средств. Доступно: ${client.bill.nextDouble} тенге ")
                    break

                } else {
                    println("Нет доступных свободных номеров для ${client.name}.")
                    break
                }
            }
        }
    }
}