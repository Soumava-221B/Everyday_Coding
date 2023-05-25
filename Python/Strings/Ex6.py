# Write a Pyhton program to add 'ing' at the end of a given string (length should be at least 3). If the given string already end with 'ing' then add 'ly' insted. If the string length of the string is less than 3, leave it unchanged.

def add_string(str1):
    length = len(str1)

    if length > 2:
        if str1[-3:] == 'ing':
            str1 += 'ly'
        else:
            str1 += 'ing'

    return str1
print(add_string('ab'))
print(add_string('abc'))
print(add_string('string'))