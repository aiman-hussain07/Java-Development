# Functions
A block of code that can perform a particular task (repeateadly if required). Reusable part of code.

# Syntax of Functions
returnType name(){
    //body
    return statement;
}

# Methods
The functions which are written inside a particular class, those functions are said to be the method of this class.

# Synatx with Parameters
returnType name (type param1, type param2){
    //body
    return statement;
} , 
Input values written in the definition of the function are called parameters/ formal parameters. Whereas values passed while calling a function are called arguments/ actual parameters

# What happens in Memory
Call Stack/ Stack Allocation in Java

# Call by Value
This concept states that in Java when any value is passed in a function, the original value of this variable isn't passed but a copy of this variable is formed and then passed to another function. All functions in java always work on call by value concept. 
The functions in which original value is only passed uses Call by Reference (found in C++).

# Methods
two types:
1. User defined
2. Inbuilt 

# Function Overloading
Multiple functions with same name with different parameters. Such functions will have either of the two differentiating factors:
1. types of paramters
2. no. of parameters
Note: Functional overloading doesn't depend on return time. Different return types with same function definition and input parameters will give error as Java treats them same.

# Convert from Binary to Decimal and Decimal to Binary
See code

# Scope
scope defines where a certain variable or method is accessible in a program.
1. Method Scope
any variable declared within a method, arguments included, is NOT accessible outside that method.
2. Block Scope
any variable declared within two curly braces/ block, arguments included, is NOT accessible outside that block.
3. Class Scope - access modifiers
