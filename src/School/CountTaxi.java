package School;
/* Программа вычисляет стоимость проезда в такси в зависимости от расстояния
 из расчета 8 руб. 50 коп. за километр.
 Ваша программа должна взаимодействовать с пользователем следующим образом:
        СЧЕТЧИК СТОИМОСТИ ПРОЕЗДА:
         Введите начальные показания одометра: 13505
         Введите конечные показания одометра: 13810
         Вы проехали 305 км. Из расчета 8 руб. 50 коп. за км,
         стоимость проезда равна 2592 руб. 50 коп.
 **/

import java.util.Scanner;

public class CountTaxi {
        public static void main(String[] args) {
        final double PRICE_KOPEEK = 850;
    int start, finish, totalWay;
    double totalPay;
    Scanner input = new Scanner(System.in);
    System.out.println("СЧЕТЧИК СТОИМОСТИ ПРОЕЗДА");
    // Получить начальное показания одометра:
    System.out.print("Введите начальные показания одометра (целое число): ");
    start = input.nextInt();

    // Получить финальные показания одометра:
    System.out.print("Введите конечные показания одометра (целое число): ");
    finish = input.nextInt();

    // Вычисляем длину пройденного маршрута
        totalWay = finish - start;

    // Вычисляем итоговую стоимость за маршрут
        totalPay =  PRICE_KOPEEK * totalWay;
    // Отображаем итоги расчётов

    System.out.println("Вы проехали " + totalWay + " км. Из расчета 8 руб. 50 коп. за км,\n" +
                                "         стоимость проезда равна " + (int) totalPay/100 + " руб. " + (int) totalPay%100 + "коп.");

        }
    }

