class Order:
  def __init__(self,price,item):
    self.price = price
    self.item = item

  def __gt__(self,o2):
    return self.price>o2.price
  
  def display(self):
    print(f"The price of {self.item} is: {self.price} rs.")

o1 = Order(120,"Ball")
o1.display()

o2 = Order(300,"Bat")
o2.display()

print(o1<o2)