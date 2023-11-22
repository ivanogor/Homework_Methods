public class Main {
    public static void main(String[] args) {
        checkTheLeapYear(2020);
        checkUserDevice(1, 2025);
        System.out.println(countDeliveryDays(100));
    }

    public static void checkTheLeapYear(int year){
        boolean isLeap = year > 1584 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));

        if (isLeap) {
            System.out.println(year + " год — високосный год");
        }
        else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkUserDevice(int clientOS, int clientDeviceYear){
        String versionOfApp = clientDeviceYear >= 2015 ? "Установите версию приложения" : "Установите облегченную версию приложения";
        String userSystem = clientOS == 0 ? " для Android по ссылке" : " для iOS по ссылке";
        System.out.println(versionOfApp + userSystem);
    }

    public static int countDeliveryDays(int deliveryDistance){
        if (deliveryDistance <= 20){
            return 1;
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60){
            return 2;
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100){
            return  3;
        }
        else {
            throw new RuntimeException("Доставки нет, слишком большая дистанция.");
        }
    }
}