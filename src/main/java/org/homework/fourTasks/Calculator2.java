package org.homework.fourTasks;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

public class Calculator2 {
   static int  firstNumber;
   static int  secondNumber;
   static char operation;

  public int getFirstNumber(){
      String input = showInputDialog(null,
              "Please enter first number",
              "Calculator",
              QUESTION_MESSAGE
      );

      try{
          firstNumber = parseInt(input);
      }catch (Exception e){
          showMessageDialog(null,

                  "Try again, NumberFormatException - enter only numbers, symbols and letters are " +
                          "prohibited!",
                  "Error",
                  WARNING_MESSAGE
          );
          getFirstNumber();
      }
       return firstNumber;
   }

    public int getSecondNumber(){
        String input = showInputDialog(null,
                "Please enter second number",
                "Calculator",
                QUESTION_MESSAGE
        );

        try{
            secondNumber = parseInt(input);
            if(secondNumber==0){
                showMessageDialog(null,

                        "Try again, NullPointerException - enter only numbers, symbols and letters are " +
                                "prohibited!",
                        "Error",
                        WARNING_MESSAGE
                );

                getSecondNumber();
            }
        }catch (NumberFormatException e ){
            showMessageDialog(null,

                    "Try again, NumberFormatException - enter only numbers, symbols and letters are " +
                            "prohibited!",
                    "Error",
                    WARNING_MESSAGE
            );
            getSecondNumber();
        }
        return secondNumber;
    }

    public char getOperation(){



      return operation;
    }





    public static void main(String[] args) {

      Calculator2 calculator2 = new Calculator2();
      int res = calculator2.getFirstNumber();
      int res1 = calculator2.getSecondNumber();
     // System.out.println(res);


    }

}
