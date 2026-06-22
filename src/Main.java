//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 0;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }else{
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        //Задача 2
        int clientDeviceYear = 2015;
        clientOS = 0;
        switch(clientOS){
            case 0:
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                }else{
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                }else{
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }
                break;
        }
        clientDeviceYear = 2015;
        clientOS = 1;
        switch(clientOS){
            case 0:
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                }else{
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                }else{
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }
                break;
        }
        clientDeviceYear = 2002;
        clientOS = 0;
        switch(clientOS){
            case 0:
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                }else{
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                }else{
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }
                break;
        }
        clientDeviceYear = 2002;
        clientOS = 1;
        switch(clientOS){
            case 0:
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                }else{
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015){
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                }else{
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }
                break;
        }
        //Задача 3
        int year = 1584;
        if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)){
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
        year = 2005;
        if ((year % 4 == 0) || (year % 400 == 0) && (year % 100 != 0)){
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
        //Задача 4
        //В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет доставлена его карта, нужно знать расстояние от офиса до адреса доставки.
        //
        //Правила доставки такие:
        //
        //Доставка в пределах 20 км занимает сутки.
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        //Свыше 100 км доставки нет.
        //То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
        //
        //Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.
        //
        //Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        } else {
            if (deliveryDistance < 20){
                System.out.println("Потребуется дней: " + day + " день.");
            }
            if (deliveryDistance >= 20 && deliveryDistance < 60){
                day = day + 1;
                System.out.println("Потребуется дней: " + day + " дня.");
            }
            if (deliveryDistance >= 60 && deliveryDistance < 100){
                day = day + 2;
                System.out.println("Потребуется дней: " + day + " дня.");
            }
        }
        deliveryDistance = 18;
        day = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        } else {
            if (deliveryDistance < 20){
                System.out.println("Потребуется дней: " + day + " день.");
            }
            if (deliveryDistance >= 20 && deliveryDistance < 60){
                day = day + 1;
                System.out.println("Потребуется дней: " + day + " дня.");
            }
            if (deliveryDistance >= 60 && deliveryDistance < 100){
                day = day + 2;
                System.out.println("Потребуется дней: " + day + " дня.");
            }
        }
        deliveryDistance = 44;
        day = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        } else {
            if (deliveryDistance < 20){
                System.out.println("Потребуется дней: " + day + " день.");
            }
            if (deliveryDistance >= 20 && deliveryDistance < 60){
                day = day + 1;
                System.out.println("Потребуется дней: " + day + " дня.");
            }
            if (deliveryDistance >= 60 && deliveryDistance < 100){
                day = day + 2;
                System.out.println("Потребуется дней: " + day + " дня.");
            }
        }
        deliveryDistance = 116;
        day = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        } else {
            if (deliveryDistance < 20){
                System.out.println("Потребуется дней: " + day + " день.");
            }
            if (deliveryDistance >= 20 && deliveryDistance < 60){
                day = day + 1;
                System.out.println("Потребуется дней: " + day + " дня.");
            }
            if (deliveryDistance >= 60 && deliveryDistance < 100){
                day = day + 2;
                System.out.println("Потребуется дней: " + day + " дня.");
            }
        }
        //Задача 5
        //Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1-й месяц (он же январь) принадлежит к сезону зима.
        //
        //Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
        //
        //Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).
        int monthNumber = 12;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
        monthNumber = 5;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
        monthNumber = 8;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
        monthNumber = 10;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
        monthNumber = 15;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
    }
}