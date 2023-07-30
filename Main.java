import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Введите число а ");
        int a = scaner.nextInt();
        System.out.println("Введите число b ");
        int b = scaner.nextInt();

        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + " b = " + b);


        //Задание номер 2

        WorldState worldState = new WorldState();
        worldState.isWorldNegativelyGood();
    }


}