'''
Given three values - Start Farenheit Value (S), End Farenheit value (E), and Step Size (W), you need to convert all Fahrenheit values from Start to End to the gap of W into their corresposnding Celsius values and print the table. 

Note:
Print the floor of the Celsius values if they are non-negative else print its ceil value.
'''

from os import *
from sys import *
from collections import *
from math import *

#Your code goes here

s = int(input())
e = int(input())
w = int(input())

for i in range(s,e,w):
    c = (i-32)*(5/9)
    if c > 0:
        print(i," ",floor(c))
    else:
        print(i," ",ceil(c))