import java.util.Scanner;

public class array{

  public static void main(String[] args){
  
    Scanner sc = new Scanner(System.in);

    int arr[ ]={1,2,3,4,5,6,7,8,5,4};

    for(int i=0;i<10;i++){
      System.out.print("Enter number arr["+i+"] : ");
      arr[i]=sc.nextInt();
    }

    for(int i=0;i<10;i++){
      System.out.print(" "+arr[i]);
    }
  }
}