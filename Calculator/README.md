# Explanation

## Main Class
The main class instroduces a menu where the user can choose any of the following operations that can be performed:
1. Sum of two numbers
2. Difference Between Two Numbers
3. Product of two numbers
4. Division of two Numbers (returns the quotient)
5. Fibonacci sequence (upto n terms)
6. Mode of an Array
7. Mean of an Array
The Scanner class from the java.util package is used to take the input for the choice of operations.

## User Input Class
This class contains two functions. One takes two numbers as the input and is used in arithmetic operations, while the other takes an array of 5 numbers from the user to find the mode or the mean of that array.
The Scanner class from the java.util package is used to take the inputs.

## Calculations class
This class contains functions relating to the different operations available in the main class.
1. sum(): Takes two numbers as the input by calling the input function in the UserInput class and returns the sum of those numbers
2. difference(): Takes two numbers as the input by calling the input function in the User Input class and returns the difference of those numbers
3. product(): Takes two numbers as the input by calling the input function in the User Input class and returns the product of those numbers.
4. difference(): Takes two numbers as the input by calling the input function in the User Input class and returns the quotient after dividing those numbers. Displays an error and asks user to re-enter the numbers if the divisor is zero.
5. fibonacci(): Uses the Scanner class from java.util package to take an integer value as input from the user that represents the number of values to be displayed.
6. modeArray(): Takes an array of 5 numbers as the input by calling the arrayInput function from the User Input class. By using nested for-loops it detects whether an integer appears in the array multiple times.
7. meanArray(): Takes an array of 5 numbers as the input by calling the arrayInput function from the User Input class. It adds each element in the array and divides it by the number of elements in the array(5) to display the mean (as a double).
