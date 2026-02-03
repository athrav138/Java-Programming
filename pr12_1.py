dict1 = {
        "A":"Atharv",
        "B":"Bharat",
        "C":"Cat",
        "D":"Dog"
        }

print(dict1)

print("Key 'A' value is: ",dict1["A"])
print("Key 'B' value is: ",dict1["B"])
print("Key 'C' value is: ",dict1["C"])
print("Key 'D' value is: ",dict1["D"])

dict1['A'] = "Aps"
print(dict1)

print(dict1.get('A'))
del dict1['A']
print(dict1)
dict1.clear()
print(dict1)
del dict1
 # print(dict1) # show an error due to dictionary is deleted
