package Assignment;

import java.util.Scanner;




public class Assesment {
  
Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
         
      int num = 0;
      
        int digit;
        int rev=0;
        do
        {
          System.out.println("Enter the number: \n");
          num = sc.nextInt();
          if(num<=0)
          {
            System.out.println("Please enter a valid number");
          }


        }while(num<=0);
        
        int n = num;
        while(n>0)
        {
          digit = n%10;
          rev = rev*10+ digit;
          n=n/10;
          
        }
        System.out.println(rev);
        if(rev==num)
          System.out.println("It is a Palindrome");
        else
          System.out.println("It is not a Palindrome");
      }

 

            //function to printPattern

       public void printPattern() {

      int num = 0;
        do
        {
          System.out.println("Enter the number: \n");
          num = sc.nextInt();
          if(num<=0)
          {
            System.out.println("Please enter a valid number");
          }


        }while(num<=0);
        
        for(int i=0;i<num;++i)
        {
          for(int j=num-i;j>0;--j)
          {
            System.out.print("*");
          }
          System.out.println("");
        }


      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {

      int num;
      int flag = 0;
      do
        {
          System.out.println("Enter the number: \n");
          num = sc.nextInt();
          if(num<=1)
          {
            System.out.println("Please enter a valid number");
            System.out.println("\n");
          }
          
          if(num==1)
          {
            System.out.println("Please enter a valid number greater than 1.[1 is neither prime nor composite]\n");
          }


        }while(num<=1);
        
        for(int i=2;i<=num/2;++i)
        {
          if(num%i==0)
          {
            flag=1;
            break;
          }
        }

        if(flag==0)
          System.out.println("It is a Prime Number\n");
        else
          System.out.println("It is not a Prime Number\n");


        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int num,first = 0, second = 1;

           do
          {
          System.out.println("Enter the number: \n");
          num = sc.nextInt();
          if(num<=0)
          {
            System.out.println("Please enter a valid number");
          }


          }while(num<=0);

          int f = first;
          int s = second;
          int temp = 0,i=1;

          if(num==1)
          {
            System.out.println(f);
            
          }
          else
          {
            System.out.print(f);
            System.out.print(" ");
            
          for(i=2;i<=num;++i)
            {
              System.out.print(s);
              System.out.print(" ");
              temp = s;
              s = s+f;
              f=temp;
            }
          System.out.println("\n");
          }
          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Assesment obj = new Assesment();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}
