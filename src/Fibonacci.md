
In homework 1.2, one of the ways to solve
involves the use of recursion. So lets observe a typical
example of recursive computation.

Recursion Example: Fibonacci

For debugging purposes, it might be helpful to observe
the order of method calls, e.g.: 

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
