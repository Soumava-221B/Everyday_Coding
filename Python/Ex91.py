# Write a Python program to swap two variables.

x = int(input("Enter the first number: "))
y = int(input("Enter the second number: "))
print("\nBefore swaping a = %d and b = %d"%(x, y))
x, y = y, x
print("\nAfter swaping a = %d and b = %d"%(x, y))