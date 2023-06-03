# Write a Pyhton program that accepts an integer and determines whether it is greater than 4^4 and which is 4 mod 34.

def test(n):
    return n % 34 == 4 and n > 4 ** 4

n = int(input("Enter a number: "))
print("Original Integer: ")
print(n)
print("Check whether the said integer greater than 4^4 and which is 7 mod 134: ")
print(test(n))