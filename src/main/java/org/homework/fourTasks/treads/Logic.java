package org.homework.fourTasks.treads;

import java.util.InputMismatchException;
import java.util.Scanner;

import static javax.swing.JOptionPane.*;

//  Напишіть програму для розв’язання рівняння виду 𝐴𝑥 = 𝐵. Параметри 𝐴 та 𝐵
//вводить користувач. Врахувати, що можливі три сценарії:
//1) 𝐴 ≠ 0 - рівняння має єдиний розв’язок 𝑥 = 𝐵/𝐴.
//2) 𝐴 = 0 та 𝐵 = 0 - рівняння має безліч розв’язків (розв’язком є будь-яке число).
//3) 𝐴 = 0 але 𝐵 ≠ 0 - рівняння не має розв’язків.
//Використати оброблення помилок
public class Logic {

    public static void main(String[] args) {

        showMessageDialog(null, "",
                "Hello, put two numbers, please to solve the type expression Ax = B",
                INFORMATION_MESSAGE);

        double resalt = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            double b = scanner.nextDouble();
            double a = scanner.nextDouble();

            if (a != 0) {
                resalt = b / a;
            }
            if (a == 0) {
                showMessageDialog(null,

                        "Сannot be divided by zero",
                        "Error",
                        WARNING_MESSAGE);
            }
            if (a == 0 & b == 0) {
                resalt = 0;
            }
            System.out.println("Your resalt is " + resalt);
        } catch (InputMismatchException e) {
            showMessageDialog(null,

                    "Enter only numbers!",
                    "Error",
                    WARNING_MESSAGE);
        }

    }
}
