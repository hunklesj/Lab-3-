import java.util.Scanner;
class Main {
 public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int number;
   System.out.println("Enter a Number to count up or down from."); 
   number = s.nextInt();
   if(number > 1)
       do  {
          number--;
          System.out.println(number);
       }  while (number > 0);
    else
       do  {
          number++;
          System.out.println(number);
       }  while (number < 0);
  System.out.println("Blast off!");
  }
}