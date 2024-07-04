import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Q1
        /*for(int i=1;i<=100;i++)
            if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");

            } else {
                System.out.println(i);
            }
        */


//Q2

        /*Scanner input = new Scanner(System.in);
        System.out.println("inter string to reverse:");
        String word =input.nextLine();
        String reversedString = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedString += word.charAt(i);
        }
        System.out.println("The reverse string : " + reversedString);*/


//Q3

       /* Scanner input=new Scanner(System.in);
        System.out.println("inter number for find the factorial value : ");
        int number =input.nextInt();
        long factorial=1;
        for (int i=1; i<=number;i++){
            factorial*=i;
        }
        System.out.println("factorial for number is : "+factorial);*/


//Q4

        /*Scanner input = new Scanner(System.in);
        System.out.println("inter two number1:");
        int num1=input.nextInt();
        System.out.println("inter two number2:");
        int num2=input.nextInt();
       int result=1;
       for(int i =0;i<num2;i++){
          result*=num1;

       }
        System.out.println(num1+" Raised to power"+num2+" ="+result);*/

//Q5
       /* Scanner input = new Scanner(System.in);
        int num=0;
        int odd_num=0;
        int even_num=0;
        int sum;
        int loop=0;
        System.out.println("Enter the sum of the numbers you want to print :");
        sum=input.nextInt();
       while (loop<=sum) {
           loop++;
           System.out.println("plese inter a number :");
           num = input.nextInt();
           if (num % 2 != 0) {
               odd_num++;
           } else if (num % 2 == 0) {
               even_num++;
           }
           if (loop == sum) {
               break;
           }
       }
       System.out.println("Odd num :" + odd_num + " Even num :" + even_num);*/


//Q6
       /* Scanner input = new Scanner(System.in);
        System.out.println("Please enter number greater than 1");
        int num=input.nextInt();
        boolean prime= true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");*/

//Q7

    /* for(int week=1;week<=4;week++){
         System.out.println("Week "+week);

     for (int day=1;day<=7;day++){
         System.out.println("  Day"+day);
     }
     }  */


//Q8
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word for check if the word is a palindrome or not. ");
        String word=input.nextLine();
        boolean isPalindrome = true;
        int length = word.length();

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!= word.charAt(length-1-i)){
                isPalindrome =false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println(" the word is a palindrome ");
        }else{
            System.out.println("the word is a not palindrome");
        }*/



    }
}
