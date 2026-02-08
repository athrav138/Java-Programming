interface i1{
  void display();
}

class A implements i1{
  public void display(){
System.out.println("Class A implementation");
  }
}

public class Main2{
  public static void main(String args[]){
    A obj = new A();
    obj.display();
  }
}