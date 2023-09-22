'''
Given a number N, print sum of all even numbers from 1 to N.

Sample Input 1 :
 6

Sample Output 1 :
 12

Explanation Of Sample Input 1:
The even numbers from 1 to 6 are: 2, 4, 6, So adding these 3 numbers give a sum of 12.
'''

n = int(input("Enter the number to find the sum of even n numbers: "))
sum = 0
for i in range(1, n+1):
    if i%2 == 0:
        sum += i

print(sum)