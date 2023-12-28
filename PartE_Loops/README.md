# Loops
used to execute a particular part of the zprogram repeatedly if a given condition evaluates to be true.

# Types of Loops
While all three types’ basic functionality remains the same, there’s a vast difference in the syntax and how they operate.
1. while loop 
Syntax: while(condition){ //do something as long as condition is true}
* Print reverse of a number
while (num > 0) {
    int n1 = num % 10;
    System.out.print(n1);
    num /= 10;
    }

* Reversing a number
int reverse = 0;
while (m > 0) {
    int m1 = m % 10;
    reverse = (reverse * 10) + m1;
    m /= 10;
}

2. for loop
Syntax: for(initialisation; condtion; updation){ //do something as long as condition is true }

3. do while loop (/exit control loop) 
Unlike while loop and for loop, checks the condition at the end of loop body. The Java do-while loop is executed at least once because condition is checked after loop body.
Syntax: do { //loop body //updation } while (condition);

* Break Statement
terminates the loop immediately, and the control of the program moves to the next statement following the loop. It is almost always used with decision-making statements (Java if...else Statement).

* Continue Statement
used to end(skip) the current iteration in a for loop (or a while loop), and continues to the next iteration.