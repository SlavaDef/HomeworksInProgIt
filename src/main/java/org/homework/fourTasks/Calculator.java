package org.homework.fourTasks;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

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
    private double firstNumber;
    private double secondNumber;
    private char operation;
    private double result;

    public double getFirstNumber() {
        String input = showInputDialog(null,
                "Please enter first number",
                "Calculator",
                QUESTION_MESSAGE);
        try {
           // firstNumber = parseInt(input);
            firstNumber = Double.parseDouble(input);
        } catch (Exception e) {
            showMessageDialog(null,

                    "Try again, NumberFormatException - enter only numbers, symbols and letters are " +
                            "prohibited!",
                    "Error",
                    WARNING_MESSAGE);
            getFirstNumber();
        }
        return firstNumber;
    }

    public double getSecondNumber() {
        String input = showInputDialog(null,
                "Please enter second number",
                "Calculator",
                QUESTION_MESSAGE);
        try {
            secondNumber = Double.parseDouble(input);
            if (secondNumber == 0) {
                showMessageDialog(null,
                        "Try again, NullPointerException - enter only numbers, symbols and letters are " +
                                "prohibited!",
                        "Error",
                        WARNING_MESSAGE);
                getSecondNumber();
            }
        } catch (NumberFormatException e) {
            showMessageDialog(null,
                    "Try again, NumberFormatException - enter only numbers, symbols and letters are " +
                            "prohibited!",
                    "Error",
                    WARNING_MESSAGE);
            getSecondNumber();
        }
        return secondNumber;
    }

    public char getOperation() {
        String input = showInputDialog(null,
                "Please enter operation",
                "Calculator",
                QUESTION_MESSAGE);
        if (input.length() > 1 | input.isEmpty()) {
            showMessageDialog(null,
                    "Try again, NumberFormatException - enter only '*' or '/' or '+' or '-' " +
                            "prohibited!",
                    "Error",
                    WARNING_MESSAGE);
            getOperation();
        }
        if ((input.equalsIgnoreCase("/")) | (input.equalsIgnoreCase("*")) |
                (input.equalsIgnoreCase("+")) | (input.equalsIgnoreCase("-"))) {

            operation = input.charAt(0);
        } else {
            showMessageDialog(null,

                    "Try again, NumberFormatException - enter only '*' or '/' or '+' or '-' " +
                            "prohibited!",
                    "Error",
                    WARNING_MESSAGE);
            getOperation();
        }
        return operation;
    }

    public void runCalculator(char operator, double first, double second) {
        switch (operator) {
            case ('/'):
                result = first / second;
                break;
            case ('*'):
                result = first * second;
                break;
            case ('+'):
                result = first + second;
                break;
            case ('-'):
                result = first - second;
                break;
        }
        showMessageDialog(null,
                result,
                "Your result is ",
                INFORMATION_MESSAGE);
    }

    public void ask() {
        int res;
        showMessageDialog(null, "Hello, this is a calculator, lets start!",
                "Calculator",
                INFORMATION_MESSAGE);
        do {
            char op = getOperation();
            double first = getFirstNumber();
            double second = getSecondNumber();
            runCalculator(op, first, second);
            // Відображення вікна та запам'ятовування
            //вибору користувача:
            res = showConfirmDialog(null,
                    // Текст у вікні:
                    "Закінчити обчислення?",
                    // Назва вікна:
                    "Calculator",
                    // Кнопки у вікні:
                    YES_NO_OPTION);
        } while (res == NO_OPTION);
        showMessageDialog(null, "Hope, see you next time!",
                "Calculator",
                INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new Calculator().ask();
    }
}


