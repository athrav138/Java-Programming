class Employee:
  def __init__(self,role,dept,sal):
    self.role = role
    self.dept = dept
    self.salary = sal

  def showDetails(self):
    print("Department is: ",self.dept)
    print("ROle is: ",self.role)
    print("salary is: ",self.salary)

class Engineer(Employee):
  def __init__(self,name,age,role,dept,sal):
    super().__init__(role,dept,sal)
    self.name = name
    self.age = age
    
  def display(self):
    print("Employee information is:")
    print("Name is: ",self.name)
    print("Age is: ",self.age)
    super().showDetails()

e1 = Engineer("Atharv Milind Suryavnshi",17,"Engineer","Testing",1234354)
e1.display()