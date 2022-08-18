package SberUniver;
import java.util.Scanner;
public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        final int SMS_PER_METER = 100; // 1 ���� �������� 100 ��
        double weight, height_sms, height_m, bmi;

        Scanner input = new Scanner(System.in);

        // �������� ��� � �����������
        System.out.print("������� ��� � �����������: ");
        weight = input.nextDouble();

        // �������� ���� � ������
        System.out.print("������� ���� � ������: ");
        height_m = input.nextDouble();

        // �������� ���� � �����������
        System.out.print("������� ���� � �����������: ");
        height_sms = input.nextDouble();
        height_sms+=height_m*100;

        // ��������� BMI
        bmi = weight / (height_sms / SMS_PER_METER * height_sms / SMS_PER_METER);

        // ���������� � ���������������� BMI
        System.out.println("BMI ����� " + bmi);
        if (bmi < 18.5)
            System.out.println("������������� ���");
        else if (bmi < 25)
            System.out.println("�����");
        else if (bmi < 30)
            System.out.println("���������� ���");
        else
            System.out.println("��������");
    }
}