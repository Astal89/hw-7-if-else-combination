//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    System.out.println("Задача 1");
    int clientOS = 0;
    if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке.");
    } else if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке.");
    }

    System.out.println("Задача 2");
    clientOS = 1;
    int clientDeviceYear = 2015;
    if (clientOS == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
    } else if (clientOS == 0) {
        System.out.println("Установите версию приложения для iOS по ссылке.");
    } else if (clientOS == 1 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке.");
    } else if (clientOS == 1) {
        System.out.println("Установите версию приложения для Android по ссылке.");
    } else {
        System.out.println("Не удалось определить версию ОС.");
    }

    System.out.println("Задача 3");
    int year = 2100;
    if (year <= 1584) {
        System.out.println("Год не високосный.");
    } else if (year % 400 == 0) {
        System.out.println("Год високосный.");
    } else if (year % 100 == 0) {
        System.out.println("Год не високосный.");
    } else if (year % 4 == 0) {
        System.out.println("Год високосный.");
    } else {
        System.out.println("Год не високосный.");
    }

    System.out.println("Задача 4");
    int deliveryDistance = 95;
    if (deliveryDistance <= 20) {
        System.out.println("Потребуется дней: 1");
    } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
        System.out.println("Потребуется дней: 2");
    } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
        System.out.println("Потребуется дней: 3");
    } else {
        System.out.println("Доставка не выполняется.");
    }

    System.out.println("Задача 5");
    int monthNumber = 3;
    switch (monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println("Зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Осень");
            break;
        default:
            System.out.println("Месяц не определен.");
    }
}