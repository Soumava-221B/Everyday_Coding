# Write a Python program that checks whether a specified value is contained within a group of values.
#
# Test Data:
# 3 -> [1, 5, 8, 3] : True
# -1 -> [1, 5, 8, 3] : False

def is_group_member(group_data, n):
    for value in group_data:
        if n == value:
            return True
    return False
print(is_group_member([1, 5, 8, 3], 3))
print(is_group_member([5, 8, 3], -1))