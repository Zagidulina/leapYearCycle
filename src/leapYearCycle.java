import java.util.Scanner;

public class leapYearCycle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.println("Введите год в формате: yyyy количество-дней");


            int year = scanner.nextInt();
            int days = scanner.nextInt();

            if (isLeapYear(year) == days) {
                System.out.println("Верно");
                count++;
            } else {

                System.out.println("Не верно - вы набрали " + count + " очков");

                break;
            }

        }


    }

    public static int isLeapYear(int year) {

        if ((year % 4 == 0) && year % 100 != 0) {

            return 366;
        } else {
            return 365;
        }
    }


}