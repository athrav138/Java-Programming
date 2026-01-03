import math

class Circle:
  def __init__(self,r):
    self.radius = r
  
  def Area(self):
    print("The area is: ",math.pi *self.radius*self.radius," sq. units")

  def Perimeter(self):
    print("The perimeter is: ",(2*math.pi*self.radius)," units")
  
c1 = Circle(5)
c1.Area()
c1.Perimeter()