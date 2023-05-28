# Write a Pyhton program to change a given string to a newly string  where the first and last chars have been exchanged.

def change_string(str1):
    return str1[-1] + str1[1:-1] + str1[:1]

print(change_string('abcd'))
print(change_string('12345'))