package School;
/* ��������� ��������� ��������� ������� � ����� � ����������� �� ����������
 �� ������� 8 ���. 50 ���. �� ��������.
 ���� ��������� ������ ����������������� � ������������� ��������� �������:
        ������� ��������� �������:
         ������� ��������� ��������� ��������: 13505
         ������� �������� ��������� ��������: 13810
         �� �������� 305 ��. �� ������� 8 ���. 50 ���. �� ��,
         ��������� ������� ����� 2592 ���. 50 ���.
 **/

import java.util.Scanner;

public class CountTaxi {
        public static void main(String[] args) {
        final double PRICE_KOPEEK = 850;
    int start, finish, totalWay;
    double totalPay;
    Scanner input = new Scanner(System.in);
    System.out.println("������� ��������� �������");
    // �������� ��������� ��������� ��������:
    System.out.print("������� ��������� ��������� �������� (����� �����): ");
    start = input.nextInt();

    // �������� ��������� ��������� ��������:
    System.out.print("������� �������� ��������� �������� (����� �����): ");
    finish = input.nextInt();

    // ��������� ����� ����������� ��������
        totalWay = finish - start;

    // ��������� �������� ��������� �� �������
        totalPay =  PRICE_KOPEEK * totalWay;
    // ���������� ����� ��������

    System.out.println("�� �������� " + totalWay + " ��. �� ������� 8 ���. 50 ���. �� ��,\n" +
                                "         ��������� ������� ����� " + (int) totalPay/100 + " ���. " + (int) totalPay%100 + "���.");

        }
    }

