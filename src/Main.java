//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Task 01");
            for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            }
        System.out.println("Task 02");
            for (int i = 10; i >= 1; i--) {
            System.out.println("i = " + i);
            }
        System.out.println("Task 03");
        for (int i = 0; i <= 17; i=i+2) {
            System.out.println("i = " + i);
        }
        System.out.println("Task 04");
        for (int i = 10; i >= -10; i--) {
            System.out.println("i = " + i);
        }
        System.out.println("Task 05");
        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println(i + " год является високосным ");
        }
        System.out.println("Task 06");
        for (int i = 7; i <= 98; i=i+7) {
            System.out.println("i = " + i);
        }
        System.out.println("Task 07");
        for (int i = 1; i <= 512; i=i*2) {
            System.out.println("i = " + i);
        }
        System.out.println("Task 08");
        int deposit=29000;
        int totalDeposit=0;
        for (int i = 1; i <= 12; i++) {
            totalDeposit = totalDeposit + deposit;
            System.out.println("Месяц "+i+" сумма накоплений равна "+totalDeposit+" рублей».");
        }
        System.out.println("Task 09");
        int deposit1=29000;
        int totalDeposit1=0;
        for (int i = 1; i <= 12; i++) {
            totalDeposit1 = totalDeposit1 + totalDeposit1/100;
            totalDeposit1 = totalDeposit1 + deposit1;
            System.out.println("Месяц "+i+" сумма накоплений равна "+totalDeposit1+" рублей».");
        }
        System.out.println("Task 10");
        for (int i = 1; i <= 10; i++) {
             System.out.println("2 * " + i + " = " + 2 * i);
        }

    }
}