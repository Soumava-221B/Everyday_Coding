# Write a Python program to sum three given integers. However, if two values are equal, the sum will be zero.

def sum_three(x, y, z):
    if x==y or y==z or x==z:
        sum = 0
    else:
        sum = x+y+z
    return sum
print("Sum of 2,1,2: ",sum_three(2,1,2))
print("Sum of 3,2,2: ",sum_three(3,2,2))
print("Sum of 1,2,3: ",sum_three(1,2,3))