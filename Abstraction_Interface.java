import java.util.*;

interface Animal
{
  int eyes = 2; // by default static and final
  public void eat();
  public void sleeptime();
}

 class Dog implements Animal
{

  public void eat()
  {
    System.out.println("Dog is eating");
  }
  public void sleeptime()
  {
    System.out.println("Dog is sleeping fromj 8 hours");
  }
}

 class Cat implements Animal
{

  public void eat()
  {
    System.out.println("Cat is eating");
  }
  public void sleeptime()
  {
    System.out.println("Cat is sleeping fromj 12 hours");
  }
}

public class Abstraction_Interface
{
  public static void main(String[] args)
  {

    Scanner sc = new Scanner(System.in);

    Dog dog = new Dog();
    Cat cat = new Cat();

    dog.eat();
    dog.sleeptime();

  }
}