# Write a Python program to calculate sum of digits of a number.

num = int(input("Input a four digit numbers: "))
x = num // 1000
x1 = (num - x * 1000) // 100
x2 = (num - x * 1000 - x1 * 100) // 10
x3 = num - x * 1000 - x1 * 100 - x2 * 10
print("The sum of digits on the number is", x+x1+x2+x3)