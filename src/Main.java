//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        //Задача 2
        int clientDeviceYear = 2015;
        clientOS = 0;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }
                break;
        }
        clientDeviceYear = 2015;
        clientOS = 1;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }
                break;
        }
        clientDeviceYear = 2002;
        clientOS = 0;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }
                break;
        }
        clientDeviceYear = 2002;
        clientOS = 1;
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке.");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке.");
                }
                break;
        }
        //Задача 3
        int year = 2012;
        if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if ((year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задача 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        }
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays + " день.");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = deliveryDays + 1;
            System.out.println("Потребуется дней: " + deliveryDays + " дня.");
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней: " + deliveryDays + " дня.");
        }
        deliveryDistance = 18;
        deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        }
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays + " день.");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = deliveryDays + 1;
            System.out.println("Потребуется дней: " + deliveryDays + " дня.");
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней: " + deliveryDays + " дня.");
        }
        deliveryDistance = 44;
        deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        }
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays + " день.");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = deliveryDays + 1;
            System.out.println("Потребуется дней: " + deliveryDays + " дня.");
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней: " + deliveryDays + " дня.");
        }
        deliveryDistance = 116;
        deliveryDays = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        }
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryDays + " день.");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = deliveryDays + 1;
            System.out.println("Потребуется дней: " + deliveryDays + " дня.");
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней: " + deliveryDays + " дня.");
        }
        //Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
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
        switch (monthNumber) {
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
        switch (monthNumber) {
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
        switch (monthNumber) {
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
        switch (monthNumber) {
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