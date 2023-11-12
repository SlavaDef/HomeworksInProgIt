package org.homework.secondTasks;

  class FirstClass {

     public FirstClass(int number) {
         this.number = number;
     }

     private int number;

     public int getNumber() {
         return number;
     }

     public void setNumber(int number) {
         this.number = number;
     }

     public void method(SecondClass secondMetod) {

         this.number = secondMetod.getCumb();
     }
 }
    class SecondClass {

         public SecondClass(char cumb) {
             this.cumb = cumb;
         }

         private char cumb;

         public char getCumb() {
             return cumb;
         }

         public void setCumb(char cumb) {
             this.cumb = cumb;
         }

         public void method(FirstClass firstMethod) {
             this.cumb = (char) firstMethod.getNumber();

         }

     }


