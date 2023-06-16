/*
Pushing and Popping 
Arrays can also function as a stack. The push and pop methods insert and remove variables from the end of an array.
For example, let's create an empty array and push a few variables.

var myStack = [];
myStack.push(1);
myStack.push(2);
myStack.push(3);
console.log(myStack);

Exercise
In this tutorial, you must manipulate the array called myArray and do the following:

1. Push the number 42 to the end of the array
2. Shift a variable from the beginning of the array
*/

var myArray = [true, "What is the meaning of life?"];
// TODO: write your code here:
myArray.push(42);
myArray.shift();
console.log(myArray[0]);
console.log(myArray[1]);