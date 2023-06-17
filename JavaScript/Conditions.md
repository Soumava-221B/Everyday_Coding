# Conditions 

## The if statement

The if statement allows us to check if an expression is equal to true or false, and execute differnt code according to the result.

Two or more expressions can be evaluated together using logical operators to check if two expressions evaluate to true together, or at least one of them. To check if two expressions both evaluate to true, use the AND operator &&. To check if at least one of the expressions evaluate to true, use the OR operator ||.

``` JavaScript
var foo = 1;
var bar = 2;
var moo = 3;

if (foo < bar && moo > bar)
{
    console.log("foo is smaller than bar AND moo is larger than bar.");
}

if (foo < bar || moo > bar)
{
    console.log("foo is smaller than bar OR moo is larger than bar.");
}
```
#### The NOT operator ! can also be used likewise:
```JavaScript
var notTrue = false;
if (!notTrue)
{
    console.log("not not true is true!");
}
```
## The switch statement

The switch statement is similar to the switch statement from the C programming language, but also supports strings. The switch statement is used to select between more than two different options, and to run the same code for more than one option.

```JavaScript
var rank = "Commander";
switch(rank)
{
    case "Private":
    case "Sergeant":
        console.log("You are not authorized.");
        break;
    case "Commander":
        console.log("Hello commander! what can I do for you today?");
        break;
    case "Captain":
        console.log("Hello captain! I will do anything you wish.");
        break;
    default:
        console.log("I don't know what your rank is.");
        break;
}
```