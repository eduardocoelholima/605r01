##Learning objectives:
- show the calculation of fibonnaci numbers,
  step by step 

In homework 1.2, one of the ways to solve
involves the use of recursion. So let's observe a
typical example of a recursive problem computation,
step by step.

Recursion Example: Fibonacci

A fibonacci of a positive number can be calculated
as the sum of the two previous fibonaccis, given that
fib( 0 ) = 0 and fib( 1 ) = 1.

Specially for debugging purposes, it might be helpful
to observe the order of method calls, e.g.: 

fib(2)
= fib(1) + fib(0) 
= ( 1 + fib(0) ) + fib(0)
= ( 1 + 0 ) + fib(0)
= ( 1 ) + ( 0 )
= 1

fib(3)
= fib(2) + fib(1)
= ( fib(1) + fib(0) ) + fib(1)
= ( 1 + fib(0) ) + fib(1)
= ( 1 + 0 ) + fib(1)
= ( 1 ) + fib(1)
= ( 1 ) + ( 1 )
= 2

fib(9)
= fib (8) + fib (7)
= ( fib (7) + fib (6) ) + fib (7)
= ( ( fib(6) + fib(5) ) + fib (6) ) + fib (7)
= ( ( ( fib(5) + fib(4) ) + fib(5) ) + fib (6) ) + fib (7)
= ( ( ( ( fib(4) + fib(3) )) + fib(4) ) + fib(5) ) + fib (6) ) + fib (7)
and so on ...
