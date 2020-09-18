package ex1;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) { //args homework
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        cycles();
        harmonic();
        rand();
        factorial();


    }

    static void cycles() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        sum = 0;
        int i = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i++;
        }
        System.out.println(sum);

        sum = 0;
        i = 0;

        do {
            sum = sum + array[i];
            i++;
        }
        while (i < array.length);
        System.out.println(sum);
    }

    static void harmonic() {
        for (int i = 1; i < 11; i++)
            System.out.println(1 + "/" + i);
    }

    static void rand() {
        Random random = new Random();
        int[] mas = new int[random.nextInt(1000) + 100];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(1000) + 100;
        }
        for (int i = 0; i < mas.length; i++)
            System.out.println(mas[i]);
    }

    static void factorial() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 1;
        for (int i = 2; i < n + 1; i++) {
            res *= i;
        }
        System.out.println(res);
    }
}
