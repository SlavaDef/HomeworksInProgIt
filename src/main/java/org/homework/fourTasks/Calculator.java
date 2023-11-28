package org.homework.fourTasks;


import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

// Напишіть програму-калькулятор, яка дозволяє користувачу вводити
//математичні операції (додавання, віднімання, множення, ділення) та виконувати
//їх. Програма повинна також вміти обробляти помилки, такі як ділення на нуль або
//неправильний формат введених даних.
//Умови задачі:
//Програма повинна запитувати користувача ввести математичну операцію та два
//числа, над якими вона буде виконуватися.
//Після виконання операції, програма повинна виводити результат на екран.
//Якщо користувач вводить некоректну математичну операцію або неправильний
//формат чисел, програма повинна виводити відповідне повідомлення про помилку
//і продовжувати роботу.
//Якщо користувач вводить ділення на нуль, програма також повинна обробляти цю
//помилку та виводити відповідне повідомлення.
//Використайте конструкцію try-catch для обробки помилок у програмі.
public class Calculator {

    private Integer firstNumber;
    private Integer secondNumber;

    private String operation;

    private String input;
    private String input2;

    private String input1;


    public int calculating(String operation, int firs, int second) {
        int result = 0;

        if (second == 0) {
            throw new ArithmeticException("You can not work with zero");

        }
        switch (operation) {
            case ("/"):
                result = firs / second;
                break;
            case ("*"):
                result = firs * second;
                break;
            case ("+"):
                result = firs + second;
                break;
            case ("-"):
                result = firs - second;
                break;
        }
        return result;
    }

    void run() {


        try {
            input = showInputDialog(null,
                    "Please enter / or * or - or +",
                    "Calculator",
                    QUESTION_MESSAGE
            );


            input1 = showInputDialog(null,
                    "Please enter first number",
                    "Calculator",
                    QUESTION_MESSAGE
            );

            input2 = showInputDialog(null,
                    "Please enter second number",
                    "Calculator",
                    QUESTION_MESSAGE
            );


        } catch (NumberFormatException e) {
            showMessageDialog(null,

                    "Try again, NumberFormatException - enter only numbers, symbols and letters are " +
                            "prohibited!",
                    "Error",
                    WARNING_MESSAGE
            );

        }

        operation = String.valueOf(input);
        firstNumber = parseInt(input1);
        secondNumber = parseInt(input2);


        int res = calculating(operation, firstNumber, secondNumber);

        showMessageDialog(null,
                res,
                "Result",
                INFORMATION_MESSAGE
        );

    }

    public static void main(String[] args) {
        new Calculator().run();
    }

}
