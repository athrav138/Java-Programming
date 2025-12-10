import java.util.*;

abstract class Shape
{
  abstract void draw();
}

class Circle extends Shape
{
  public void draw()
  {
    System.out.println("Drawing Circle");
  }
}

class Triangle extends Shape
{
  public void draw()
  {
    System.out.println("Drawing Triangle");
  }
}

public class Abstraction
{
  public static void main(String[] args)
  {
    Scanner scanner = new Scanner(System.in);

    Triangle triangle = new Triangle();
    Circle circle = new Circle();
    triangle.draw();
    circle.draw();

    
  }
}