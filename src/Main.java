public class Main {
    //Задание 1
    static int year = 0;
    static int yearphone = 0;
    static int OC = 0;
    static int distance = 0;
    static int count = 1;

    public static void yearscontrol() {
        if (year % 4 == 0 ) {
            if (year%100==0 & year%400!=0){
                System.out.println(year + " - Не вискосоный год");
            }
            if (year%400==0 & year%4==0) {
                System.out.println(year + " - Вискосоный год");
            }
            else {
                System.out.println(year + " - Вискосоный год");
            }
        } else {
            System.out.println(year + " - Не високосный год");
        }
    }

    public static void recomendedver() {
        if (OC == 0 & yearphone < year) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (OC == 0 & yearphone >= year) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        }
        if (OC == 1 & yearphone < year) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (OC == 1) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }
    }

    public static void cardday() {
        if (distance <= 20) {
            System.out.println("Потребуется дней для доставки " + count);
        } else {
            count += distance / 40;
            System.out.println("Потребуется дней для доставки " + count);
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        year = 1904;
        yearscontrol();
        //Задание 2
        System.out.println("Задание 2");
        year = 2015;
        yearphone = 2016;
        OC = 1;
        recomendedver();
        //Задание 3
        System.out.println("Задание 3");
        distance = 160;
        cardday();
    }
}
