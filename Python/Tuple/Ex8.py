# Write a Python program to create the clone of a tuple.

from copy import deepcopy

tuplex = ("HELLO", 5, [], True)
print(tuplex)
tuplex_clone = deepcopy(tuplex)
tuplex_clone[2].append(50)
print(tuplex_clone)
print(tuplex)