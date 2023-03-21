# Write a Python program to calculate the difference between a given number and 17. If the number is greater than 17, return twice the absolute differnce.

def differnce(n):
    if n <= 17:
        return 17 - n
    else:
        return (abs(17 - n)) * 2

print(differnce(22))
print(differnce(15))