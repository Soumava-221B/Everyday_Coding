/*
JavaScript can hold an array of variables in an Array object. In JavaScript, an array also functions as a list, a stack or a queue.

To define an array, either use the bracket notation or the Array object notation:

var myArray = [1, 2, 3];
var theSameArray = new Array(1, 2, 3);

Array Elements
Because JavaScript Arrays are just special kinds of objects, you can have elements of different types stored together in the same array. The example below is an array with a string, a number, and an empty object.

var myArray = ["string", 10, {}]

Exercise
You must define an array with the following three variables:

A string which has the value of "What is the meaning of life?"
A number which has a value of 42
A boolean which has a value of true
*/

var myArray = ["What is the meaning of life?", 42, true];
console.log(myArray[0]);
console.log(myArray[1]);
console.log(myArray[2]);