# Java If-Else [_Easy_]

In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

![img.png](img.png)

Source: [Wikipedia](https://en.wikipedia.org/wiki/Conditional_%28computer_programming%29)

## Task

Given an integer, _**η**_, perform the following conditional actions:

- If _**η**_ is odd, print `Weird`
- If _**η**_ is even and in the inclusive range of  to , print `Not Weird`
- If _**η**_ is even and in the inclusive range of  to , print `Weird`
- If _**η**_ is even and greater than , print `Not Weird`

Complete the stub code provided in your editor to print whether or not _**η**_ is weird.

## Input Format

A single line containing a positive integer, _**η**_.

## Constraints

- 1 <= _**η**_ <= 100

## Output Format

Print `Weird` if the number is weird; otherwise, print `Not Weird`.

## Sample Input 0

```
3
```

## Sample Output 0

```
Weird
```

## Sample Input 1

```
24
```

## Sample Output 1

```
Not Weird
```

## Explanation

Sample Case 0: _**η**_ = 3

_**η**_ is odd and odd numbers are weird, so we print `Weird`.

Sample Case 1: _**η**_ = 24

_**η**_ > 20 and _**η**_ is even, so it isn't weird. Thus, we print `Not Weird`.