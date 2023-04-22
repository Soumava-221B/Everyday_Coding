# Write a Python program to list all files in a directory.

from os import listdir
from os.path import isfile, join
files_list = [f for f in listdir('/home') if isfile(join('/home/students', f))]
print(files_list);