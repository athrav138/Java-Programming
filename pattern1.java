import java.util.*;

public class pattern1
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
int num;
/*
    System.out.print("Enter the number:");
     num = sc.nextInt();

    for(int i = 0;i < num;i++)
    {
      for(int j = 0;j < num;j++)
      {
        System.out.print(" "+i);
      }
      System.out.println("");
    }
    
    System.out.println();
    
    System.out.print("Enter the number:");
     num = sc.nextInt();

    for(int i = 0;i < num;i++)
    {
      for(int j = 0;j < num;j++)
      {
        System.out.print(" *");
      }
      System.out.println("");
    }
    
    System.out.println();
    
    System.out.print("Enter the number:");
     num = sc.nextInt();

    for(int i = 1;i <= num;i++)
    {
      for(int j = 1;j <= i;j++)
      {
        System.out.print(" "+i);
      }
      System.out.println("");
    }
    
    System.out.println();
    
     System.out.print("Enter the number:");
     num = sc.nextInt();

    for(int i = 1;i <= num;i++)
    {
      for(int j = 1;j <= i;j++)
      {
        System.out.print(" "+j);
      }
      System.out.println("");
    }
    
    System.out.println();
    
     System.out.print("Enter the number:");
     num = sc.nextInt();

    for(int i = 1;i <= num;i++)
    {
      for(int j = 1;j <= num;j++)
      {
          if(i==1 || i==num || j==1 || j==num )
        System.out.print(" *");
        else
        System.out.print("  ");
        
      }
      System.out.println("");
    }
    
    
    System.out.println();
    System.out.print("Enter the number:");
     num = sc.nextInt();
    for(int i = num;i >=1;i--)
    {
      for(int j = i;j >=1;j--)
      {
          
        System.out.print(" *");
        
      }
      System.out.println("");
    }
    
    
    
    System.out.println();
    System.out.print("Enter the number:");
     num = sc.nextInt();
    for(int i = num;i >=1;i--)
    {
      for(int j = 1;j <=i;j++)
      
      {
          
        System.out.print(" "+j);
        
      }
      System.out.println("");
    }
    
    System.out.print("Enter the number:");
         num = sc.nextInt();
        int  n=1;
     for(int i = 1;i <= num;i++)
    {
      for(int j = 1;j <= i;j++)
      {
        System.out.print(" "+n++);
      }
      System.out.println("");
    }
    
    */
    System.out.print("Enter the number:");
    num = sc.nextInt();
    
     for(int i = 1;i <= num;i++)
    {
      for(int j = 1;j <= i;j++)
      {
        int sum=i+j;
          if(sum%2==0){
        System.out.print(" 1");
      }
      else{
      System.out.print(" 0");
      }
      
    }
    System.out.println("");
    }
    
    
    

  }
}
