/*
This is the practice of all java programs.
*/

import java.util.Scanner;

public class Practice
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner (System.in);
     int a,b;
System.out.print("Enter a and b: ");
     a = sc.nextInt();
     b = sc.nextInt();

/*    -------------Even and Oddd--------------
     if(a%2==0)
     {
      System.out.println("Even");
     }
     else
     {
      System.out.println("Odd");
     }

     ------------------------------------*/

     /*  ----------------------------------
     a and b comparision using the if else if 

     if(a>b)
     {
      System.out.println("a is greater than b");
     }
     else if(a<b)
     {
      System.out.println("a is Smaller than b");
     }
     else
     {
      System.out.println("Equal");
     }
------------------------------------------------*/

/*   Switch case 
-----------------------------------------
switch(a)
{
  case 1 : System.out.println("hello");
  break;

  case 2 :  System.out.println("gello");
  break;

  default :
     System.out.println("invalid");
}
---------------------------------------------------*/

/*------Prime or not ------------------------------------------
for(int i=2;i<b/2;i++)
{
  if(b%i==0)
  {
    System.out.println("Not prime");
    b=0;
    break;
  }
  
  
}

if(b!=0)
{
  System.out.println("prime");
}
-------------------------------------------------------------
*/

/* --------------------------------
       the sum of n natural numbers using the while loops--------------------------------
int i=1;
int sum = 0;
while(i<=a)
{
  sum += i;
  i++;
}

System.out.println(sum);

-------------------------------------------------------*/


/*-------------------------------------------- 
    using do while loop the table of given number
int i = 1;

do
{

  System.out.print(" "+(i*a));
  i++;
}while(i<=10);

----------------------------------------------*/


















  }
}