# Write a Pyhton progrma to sort three integers without using conditional statements and loops.

x = int(input("Inout first number: "))
y = int(input("Input second number: "))
z = int(input("Input third number: "))

a1 = min(x, y, z)
a3 = max(x, y, z)
a2 = (x+y+z)-a1-a3
print("numbers in sorted order: ",a1, a2, a3)