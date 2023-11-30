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
    private int firstNumber;
    private int secondNumber;
    private char operation;
    private int result;

    public int getFirstNumber() {
        String input = showInputDialog(null,
                "Please enter first number",
                "Calculator",
                QUESTION_MESSAGE );
        try {
            firstNumber = parseInt(input);
        } catch (Exception e) {
            showMessageDialog(null,

                    "Try again, NumberFormatException - enter only numbers, symbols and letters are " +
                            "prohibited!",
                    "Error",
                    WARNING_MESSAGE );
            getFirstNumber();
        }
        return firstNumber;
    }

    public int getSecondNumber() {
        String input = showInputDialog(null,
                "Please enter second number",
                "Calculator",
                QUESTION_MESSAGE );
        try {
            secondNumber = parseInt(input);
            if (secondNumber == 0) {
                showMessageDialog(null,
                        "Try again, NullPointerException - enter only numbers, symbols and letters are " +
                                "prohibited!",
                        "Error",
                        WARNING_MESSAGE );
                getSecondNumber();
            }
        } catch (NumberFormatException e) {
            showMessageDialog(null,
                    "Try again, NumberFormatException - enter only numbers, symbols and letters are " +
                            "prohibited!",
                    "Error",
                    WARNING_MESSAGE );
            getSecondNumber();
        }
        return secondNumber;
    }

    public char getOperation() {
        String input = showInputDialog(null,
                "Please enter operation",
                "Calculator",
                QUESTION_MESSAGE );
        if (input.length() > 1 | input.isEmpty()) {
            showMessageDialog(null,
                    "Try again, NumberFormatException - enter only '*' or '/' or '+' or '-' " +
                            "prohibited!",
                    "Error",
                    WARNING_MESSAGE );
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
                    WARNING_MESSAGE );
            getOperation();
        }
        return operation;
    }

    public void runCalculator(char operator, int first, int second) {
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
                INFORMATION_MESSAGE );
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        showMessageDialog(null, "",
                "Hello, this is a calculator, lets start!",
                INFORMATION_MESSAGE );
        char op = calculator.getOperation();
        int first = calculator.getFirstNumber();
        int second = calculator.getSecondNumber();
        calculator.runCalculator(op, first, second);
    }
}


