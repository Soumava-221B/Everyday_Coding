# Write a Python program to get the volume of a sphere with radius six.
# Python: Volume of a Sphere
#
# A sphere is a three-dimensional solid with no face, no edge, no base and no vertex. It is a round body with all points on its surface equidistant from the center. The volume of a sphere is measured in cubic units.
#
# The volume of the sphere is : V = 4/3 × π × r3 = π × d3/6.

pi = 3.1415926535897931
r = int(input("Enter the radius: "))
V = 4/3 * pi * r**3
print("Volume of the sphere is: ", V)