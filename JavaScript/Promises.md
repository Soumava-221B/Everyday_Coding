# Promises
The Promise object represents the eventual completion (or failure) of an asynchronous operation and its resulting value.

## What is Asynchronous Programing?

Asynchronous programming, or in short, async programming, is a method of programming which enables different parts of code to run at changing times, instead of immediately.

This is mostly required when we want to fetch information from some remote server, and write code which does something with what the server returned:

```JavaScript
function getServerStatus() {
    const result = fetch("/server/status");

    console.log("The status from the server is: ", result.ok);
}
```

In JavaScript, most APIs which require waiting for a function to do something, are asynchronous by default which means that this code will not do what we think it will do, since the fetch function is asynchronous, and therefore will return something which is not exactly the result, but will eventually be the result. This "thing" which is returned from the fetch function is called a Promise in JavaScript.

To make the code work, we will need to write the function in the following manner:

```JavaScript
function getServerStatus() {
    const result = fetch("/server/status");

    result.then(function(status) {
        console.log("The status from the server is: ", status.ok);
    });
}
```

#### Notice that we used the then function here, which is one of the methods of a Promise.

## The Promise Object
A Promise is a native JavaScript object which has two traits: 1. It receives a single argument which is a function. This function needs to have two arguments, a resolve function and a reject function. The code written inside the promise needs to use one of these two functions. 2. It can be waited on using the then method (and other similar methods), or the await statement.

## Rejecting Promises
In a synchronous flow, if we want to tell the user that something went wrong so he can catch an exception, we throw an exception using the throw argument. When using promises, we need to trigger the reject function insted.

Let's say we want to write the same function, but with a rejection if a value is negative: 

```JavaScript
function sumAsync(x, y) {
    return new Promise((resolve, reject) => {
        // run this in 500ms from now
        setTimeout(() => {
            if (x < 0 || y < 0) {
                reject("Negative values received");
            } else {
                resolve(x + y);
            }
        }, 500);

        // we don't need to return anything
    });
}

sumAsync(-5, 7).then((result) => {
    console.log("The result of the addition is:", result);
}).catch((error) => {
    console.log("Error received:", error);
});
```