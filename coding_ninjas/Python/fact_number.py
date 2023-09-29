'''
Write a program to find the factorial of a number.
Factorial of n is:
n! = n * (n-1) * (n-2) * (n-3)....* 1
Output the factorial of 'n'. If it does not exist, output 'Error'.
'''

n = int(input())

if n < 0:
    print("Error")

elif n == 0:
    print(1)

else:
    def fact(n):
        if n == 1:
            return 1
        else:
            return n * fact(n-1)

    ans = fact(n)
    print(ans)