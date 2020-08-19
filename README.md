

Recursion Example: Fibonacci

fib(3)
= fib(2) + fib(1)
= ( fib(1) + fib(0) ) + fib(1)
= ( 1 + fib(0) ) + fib(1)
= ( 1 + 0 ) + fib(1)
= ( 1 ) + fib(1)
= ( 1 ) + ( 1 )
= ( 2 )

fib(9)
= fib (8) + fib (7)
= ( fib (7) + fib (6) ) + fib (7)
= ( ( fib(6) + fib(5) ) + fib (6) ) + fib (7)
= ( ( ( fib(5) + fib(4) ) + fib(5) ) + fib (6) ) + fib (7)
= ( ( ( ( fib(4) + fib(3) )) + fib(4) ) + fib(5) ) + fib (6) ) + fib (7)
....
