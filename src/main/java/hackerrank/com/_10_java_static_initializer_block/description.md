# Java Static Initializer Block

Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it [here](https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html).

You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth _B_ and height _H_. You should read the variables from the standard input.

If _B ≤ 0_ or _H ≤ 0_, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

## Input Format

There are two lines of input. The first line contains _B_: the breadth of the parallelogram. The next line contains _H_: the height of the parallelogram.

## Constraints

- _-100 ≤ B ≤ 100_
- _-100 ≤ H ≤ 100_

## Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

## Sample Input 1

```
1
3
```

## Sample Output 1

```
3
```

## Sample Input 2

```
-1
2
```

## Sample Output 2

```
java.lang.Exception: Breadth and height must be positive
```
