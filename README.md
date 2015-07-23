# tester-caught-point-exceptions

Descrition
==========
This is tester throw expetions by this order:

- com.example 1 - main of callCaughtPoint
- com.example 2 - try of caughtPoint - call to caught point 2
- org.apache 3 - try of caughtPoint2 - create new object from inhertence class into com.example
- com.example 4 - try of AbsClass - execute  the second function for the object of InheritanceClass
- org.apache 5 - call to the boom function
- org.apache 6 **** - the boom - **** 
- org.apache 7 - get the exception and rethrow it
- com.example 8 catch of AbsClass - get the exception - and rethrow it
- org.apache 9 - catch of caughtPoint2 - get the exception - and rethrow it
- com.example 10 - catch of caughtPoint - the print stack of the exception

Usage
=====
Run it with Eclipse 
