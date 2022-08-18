package SberUniver;
import java.util.Scanner;
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        final int SMS_PER_METER = 100; // 1 метр содержит 100 см
        double weight, height_sms, height_m, bmi;

        Scanner input = new Scanner(System.in);

        // Получить вес в килограммах
        System.out.print("Введите вес в килограммах: ");
        weight = input.nextDouble();

        // Получить рост в метрах
        System.out.print("Введите рост в метрах: ");
        height_m = input.nextDouble();

        // Получить рост в сантиметрах
        System.out.print("Введите рост в сантиметрах: ");
        height_sms = input.nextDouble();
        height_sms+=height_m*100;

        // Вычислить BMI
        bmi = weight / (height_sms / SMS_PER_METER * height_sms / SMS_PER_METER);

        // Отобразить и интерпретировать BMI
        System.out.println("BMI равно " + bmi);
        if (bmi < 18.5)
            System.out.println("Недостаточный вес");
        else if (bmi < 25)
            System.out.println("Норма");
        else if (bmi < 30)
            System.out.println("Избыточный вес");
        else
            System.out.println("Ожирение");
    }
}