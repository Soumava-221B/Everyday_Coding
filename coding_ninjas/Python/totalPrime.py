'''
Write a program to find the total number of a primes number in a given interval. Given two integers S and E, count all primes between S and E.
'''

from os import *
from sys import *
from collections import *
from math import *




#Write your totalPrime function here.
def totalPrime(S, E):
    count = 0;
    for n in range(S, E+1):
        if n > 1:
            for i in range(2, n):
                if(n % i) == 0:
                    break
            else:
                    count += 1
    return count



#Taking S and E space seperated input.
S,E = map(int,input().split(' '))
print(totalPrime(S,E))