# Callbacks
Callbacks in JavaScript are functions that are passed as argurments to other functions. This is a very important feature of asynchronous programing, and it enables the function that receives the callback to call our code when it finishes a long task, while allowing us to continue the execution of the code.

For example:
```JavaScript
var callback = function() {
    console.log("Done!");
}

setTimeout(callback, 5000);
```

This code waits 5 seconds and prints out "Done!" when the 5 seconds are up. Note that this code will not work in the interpreter because it is not designed for handling callbacks.