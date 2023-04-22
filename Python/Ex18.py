# Write a Python program to calculate the sum of three given numbers. If the values are equal, return three times their sum.

def sum_thrice(n, m, o):
    if n == m == o:
        return (n + m + o) * 3
    else:
        return n + m + o

print(sum_thrice(1, 2, 3))
print(sum_thrice(3, 3, 3))