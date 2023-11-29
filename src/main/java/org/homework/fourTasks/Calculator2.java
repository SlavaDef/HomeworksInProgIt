package org.homework.fourTasks;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Calculator2 {
   static int  firstNumber;
    public static void main(String[] args) {

      String input1 = showInputDialog(null,
                "Please enter first number",
                "Calculator",
                QUESTION_MESSAGE
        );

      try {
          firstNumber = parseInt(input1);
      }catch (Exception e){
          showMessageDialog(null,

                  "Try again, NumberFormatException - enter only numbers, symbols and letters are " +
                          "prohibited!",
                  "Error",
                  WARNING_MESSAGE
          );

      }

        showInputDialog(null,
                firstNumber,
                "You number is",
                QUESTION_MESSAGE
        );


    }

}
