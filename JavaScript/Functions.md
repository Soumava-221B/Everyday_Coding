# Functions

Functions are code blocks that can have arguments, and function have their own scope. In JavaScript, functions are a very important feature of the program, and especially the fact that they can access local variables of a parent function (this is called a closure).

There are two ways to define functions in JavaScript - named functions and anonymous functions.

To define a named function, we use the function statement as follows:

```JavaScript
function greet(name)
{
    return "Hello " + name + "!";
}

console.log(greet("Eric"));      // prints out Hello Eric!
```