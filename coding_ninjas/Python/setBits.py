# Write a program to count the number of 1's in the binary representation of an integer.

from os import *
from sys import *
from collections import *
from math import *




#Write your countBits function here.

def countBits(n):
    bitcount = 0
    while n:
        bitcount += n & 1
        n >>= 1
    return bitcount

     
n = int(input())
print(countBits(n))