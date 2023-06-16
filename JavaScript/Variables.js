/*
1. JavaScript is a "ducked-typed" language, and therefore every variable is defined using the "var" keyword and can contain all types of variables. 

In JS, the number type can be both a floating point number and an integer.
Boolean values can only be equal to either true or false.

There are two more advanced types in JavaScript. An array, and an object. We will get to them in more advanced tutorials.

const myArray = [];                    // an array
const myObject = {};                  // an object


When a varible is used without first defining a value for it, it is equal to undefined. For example:
const newVariable;
console.log(newVariable); //prints undefined
*/

const myNumber = 4;
const myString = "Variables are great.";
const myBoolean = false;
console.log("myNumber is equal to " + myNumber);
console.log("myString is equal to " + myString);
console.log("myBoolean is equal to " + myBoolean);