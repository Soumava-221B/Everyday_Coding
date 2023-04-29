# Write a Python program to check whether a string is numberic.

str = 'a123'
#str = '123'
try: 
    i = float(str)
except(ValueError, TypeError):
    print("\nNot numeric")
print()