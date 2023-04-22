# Write a Python program that displays your name, age, and address on three differnet lines.

def personal_details():
    name, age = "Simon", 19
    address = "Banglore, Karnataka, India"
    print("Name: {}\nAge: {}\nAddress: {}".format(name, age, address))

personal_details()