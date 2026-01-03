class add_complex:
  def __init__(self,real,img):
    self.real = real
    self.img  = img

  def display(self):
    print(f"The complex is: {self.real}i + {self.img}j")

  """def add(self,c2):
    new_real = self.real + c2.real
    new_img = self.img + c2.img
    return add_complex(new_real,new_img)"""
  
  def __add__(self,c2):
    new_real = self.real + c2.real
    new_img = self.img + c2.img
    return add_complex(new_real,new_img)

  def __sub__(self,c2):
    new_real = self.real - c2.real
    new_img = self.img - c2.img
    return add_complex(new_real,new_img)

c1 =  add_complex(2,4)
c2 =  add_complex(4,5)

#c3 = c1.add(c2)
c3 = c1 + c2
c4 = c2 - c1
c1.display()
c2.display()
c3.display()
c4.display()