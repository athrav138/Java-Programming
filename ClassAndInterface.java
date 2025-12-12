import java.util.Scanner;

class Monkey
{
  void jump()
  {
    System.out.println("jumping");
  }

  void bite()
  {
    System.out.println("Biting");
  }

}

interface BaseAnimal
{
  void sleep();
  void eat();
}

class Human extends Monkey implements BaseAnimal
{

  
  public void sleep()
  {
    System.out.println("Sleeping");

  }
  public void eat()
  {
    System.out.println("Eating");
  }

  public void Walk()
  {
    System.out.println("Walking");
  }
}

public class ClassAndInterface
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    Human h1 = new Human();
    h1.bite();
    h1.eat();
    h1.jump();
    h1.sleep();
    h1.Walk();

  }
}