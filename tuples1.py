# Write a Python program that accepts a sequence of comma-separated from the user and genrates a list and tuple of those numbers.

nums = input("Input some comma separted numbers: ")
list1 = nums.split(",")
tuple = tuple(list1)
print("List: ", list1)
print("Tuple: ", tuple)