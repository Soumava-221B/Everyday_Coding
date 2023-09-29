'''
Write a program to find x to the power n (i.e., x^n). Take x and n from the user. You need to print the answer.
'''

from os import *
from sys import *
from collections import *
from math import *

#Your code goes here
n1, n2 = input().split()

n1 = int(n1)
n2 = int(n2)

ans = n1 ** n2
print(ans)