> Resources used to put this together
- The CS 180 slides (Dunsmore - Purdue cs professor)
- CS 180 past exams
- Geeks for Geeks (my goat)
- W3Schools
- Oracle

Some CS180 advice from our favorite CS org Purdue USB 
https://purdueusb.com/freshmanyear,/cs180/2022/04/16/CS180.html

additionally there are a few practice exams i have put together with all the questions i struggled with on past exams -- if you would like them, message me!



---
### Intro to CS and Programming
###### ==Algorithm== - a series of instructions for a computer to execute to solve a problem 
unambiguous | correct  | complete | must terminate

###### Von Neuman Architecture
- Input/Output Devices (I/O)
- Memory (massive amounts of 0s and 1s)
- Central Processing Unit (CPU)
MEMORY <-> CPU <-> Memory

###### Binary Numbers (base 2)
- Divide by 2 and string together from bottom 42 = 101010

| Number |     |     |     | Result |     | Remainder |
| ------ | --- | --- | --- | ------ | --- | --------- |
| 42     | /   | 2   | =   | 21     | +   | 0         |
| 21     | /   | 2   | =   | 10     | +   | 1         |
| 10     | /   | 2   | =   | 5      | +   | 0         |
| 5      | /   | 2   | =   | 2      | +   | 1         |
| 2      | /   | 2   | =   | 1      | +   | 0         |
| 1      | /   | 2   | =   | 0      | +   | 1         |
Write digits from bottom up! (101010)

- 1's complement - flip all digits (bits), add a bit to the front for a +/- sign 
	- A 1 in front means the number is negative
	- -42 = 1010101
- 2's complement - add 1 to 2's complement
https://planetcalc.com/747/

###### How software is written
- Programming language
	- High | assembly | low
- Compilers and interpreters
- Integrated Development Environments (IDEs)

###### Software Development Lifecycle
1. Understand the problem 
2. Design a solution 
3. Implement the solution 
4. Test the solution 
5. Maintenance
##
---
### Java Basics
#### Principles of OOP
##### ==ABSTRACTION==
Removing details to keep simpler remaining information - there are levels to abstraction
| classes | Objects | methods | variables | constants |

##### ==ENCAPSULATION==
Data hiding + controlled access of a class from code outside of the class

why? - hiding implementation from other programmers to prevent the modification of certain fields and allow the modification of a class without affecting other programmers

how? access modifiers + getter/setter methods


###### Java access modifiers

| access modifer            | what does it mean                                                              | applicable to                                   |
| ------------------------- | ------------------------------------------------------------------------------ | ----------------------------------------------- |
| public                    | accessible from anywhere within the program                                    | classes, instance variables, methods            |
| private                   | accessible only within the class its in                                        | ==nested classes==, instance variables, methods |
| protected                 | can be accessed within the same package or by subclasses in different packages | classes, instance variables, methods            |
| package-private (default) | can be accessed anywhere within its own package                                | classes, instance variables, methods            |

###### Java non-access modifiers

| non-access modifer | what does it mean                                                                                                                 | applicable to                                   |
| ------------------ | --------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------- |
| static             | the variable, method, or class is tied to the top class                                                                           | ==nested classes==, instance variables, methods |
| abstract           | a class with this modifier cannot be instantiated<br>a method with tis modifier does not contain a implementation                 | classes, methods                                |
| final              | a class with this modifier cannot be extended<br>a method with this modifier cannot be overridden in a child class<br>e.g. String | classes, instance variables, methods            |

###### Java arithmetic Operations
- ==TODO==
- http://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
##
---
### Java classes
**JAVA CLASSES ARE NOT PROGRAMS!!!!! Only components of one**

==Top level Class== - same name as the file

*must have*
- name  - Capitalized!
- access modifier
- constructor

*can have* 
- non-access modifiers
- instance variables
- static variables
- methods
- static methods
- inheritance
	- extends
	- implements

example
``public class Dog extends Animal {
	``private static int totalDogCount = 0; // static instance var
	``private String breed; // private instance var
	``
	``public Dog(String breed) {
		``this.breed = breed;
		``totalDogCount++;
	``}
	
	``// methods go here
``} 
##
---
### Components of a Java Method
*must have*
- name (+ parameters = ==method signature==)
- access modifier
- return type

*can have*
- non-access modifiers
- parameters
	- ==varargs== - variable-length arguments
		- specified by ...
		- e.g. func(int ... a) --> a is implicitly declared as an Array of type int[ ]
- annotations (@Override, etc.)

common methods -- getter methods, setter methods

example
``public String greeting(String name) {
	``return "Hello " + name;
``}
the method signature of this method is ``greeting(String name)

##
---
### Java types + basic data structures

###### Java primitive types

| type    | wrapper counterpart | stores                                          | example               | Notes                                                                |
| ------- | ------------------- | ----------------------------------------------- | --------------------- | -------------------------------------------------------------------- |
| byte    | Byte                | whole numbers from \[-2^7, 2^7)                 | byte x = 3;           |                                                                      |
| short   | Short               | whole numbers from<br>\[-2^15, 2^15)            | short x = 3;          |                                                                      |
| int     | Integer             | whole numbers from \[-2^31, 2^31)               | int x = 3;            |                                                                      |
| long    | Long                | whole numbers from \[-2^63, 2^63)               | long x = 3;           |                                                                      |
| float   | Float               | stores fractional numbers--6-7 decimal digits   | float f = 13.3;       |                                                                      |
| double  | Double              | stores fractional numbers--15-16 decimal digits | double d = 12.233;    |                                                                      |
| char    | Character           | character                                       | char character = 'e'; | There are different Unicode versions<br>ASCII is a subset of Unicode |
| boolean | Boolean             | true or false                                   | boolean boo = true;   | Operators<br>==<br>!=<br><<br>><br><=<br>>=<br>^                     |

###### Casting
Converting a value of one type to another
- Upcasting - casting from a type that can store less data one that can store more data (no precision lost)
	- int --> double
- Downcasting - casting from a type that can store more data to one that can store less data (precision lost)
	- double --> int


###### A few Java classes

| class  | description                           | modifiers | Inheritance                                     | common methods                                                                                                                                                                                      |
| ------ | ------------------------------------- | --------- | ----------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Object | root of the class hierarchy           | public    | N/A                                             | - equals(Object o)<br>- clone()<br>- toString()<br>- getClass()<br>- hashCode()                                                                                                                     |
| String |                                       | final     | Serializable, CharSequence, Comparable\<String> | - equals(String s)<br>- substring()<br>- length()<br><br>static methods<br>- format(String s, Object... args)<br><br>https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#method.summary |
| Random | used to generate random values        |           | Serializable                                    | - nextDouble - returns a value in the rane \[0.0-1.0]<br>- nextInt(int n) - returns a value in the range \[0-n]<br>- nextInt - returns any possible integer +/-                                     |
| Math   | used to perform arithmetic operations | ==TODO==  |                                                 |                                                                                                                                                                                                     |

##
---
### Java data structures (basics)

characteristics
- Contents - homogeneous/heterogeneous
- Size - static/dynamic
- Element access - sequential/random

Common data structures

##### Array
homogeneous | static | random access | reference types
>an Object that can store multiple Objects of a fixed size

syntax -- intialization
``*type/Object*[] = new *type/Object*[*size*];
or
``*type/Object*[] = {item, item, item};
or
``*type/Object*[] = new *type/Object*[]{item, item, item}

properties
- index - starts at 0 ends at length - 1
- length

some silly facts
==a 2D Array can be "ragged right" -- each Array in the 2D Array does not have to be of equal length!==



an extra helper class
###### Arrays
package - java.util

>a class containing useful methods for manipulating an Array
- asList()
- sort()
- copyOf(original Array, int newLength)
- copyOfRange(array, int from, int to)
- equals(array1, array2)
- fill()
- toString()

##### ArrayList
homogeneous | dynamic | random access | generic
package - java.util

>a dynamic version of an Array

syntax -- initialization
``ArrayList\<Object> list = new ArrayList\<Object>();
ArrayLists cannot store data as primitive types --> use wrapper classes

methods
- add(item) - adds item to the end of the list
- add(i, item) - adds item to the end of the list
- contains(item) - returns true if item is in the list
- get(i) - returns the value at index i - can throw IndexOutOfBoundsExecption
- remove(item) - removes item from the list (only the first is deleted if there are multiple)
- set(i, item) - sets item at i to item
- size() - returns the current size of the list
- istEmpty() - returns true if the ArrayList is empty, and false otherwise

how does an ArrayList work? - fixed size array underneath - doubles in size every time space runs out

##### LinkedLists
homogenous | dynamic | sequential access | generic
package java.util

>an ordered sequence of "nodes" -- a node being an object containing a value with a link to the next node
- much faster resize compared to ArrayList

syntax -- initialization
``LinkedList\<Object> list = new LinkedList\<Object>;

methods
- addFirst(item) - adds item to the head of the list
- add(item) / addLast(item) - adds item to the end of the list
- size()
- remove(item) - removes the first occurrence of item from the list
- get(i) - gets the item at the index i of the list
- set(i, item) - sets the data at the index i of the list to be item
- peek() - retrieves the head of the list without removing it
- push(item) - inserts the item at the head of the stack list (pushes onto the stack represented by this list)
- pop() - removes and returns the first element from the list (pops an element from the stack represented by this list)
- toArray()

##
---
### Common Java Packages
###### java.lang
###### java.util
###### java.io
##
---
### FINAL TIPS AND TRICKS

- For homework and projects
	- Review Coding standards (should be posted on your Brightspace)
	- Work together with friends!
	- Go to office hours if you have no other choice left (works sometimes, not really)
- FOR WRITTEN CODE EXAMS
	- SEMICOLON!!!
	- watch out for capitalization
		- CLASS NAMES ARE ALWAYS CAPITALIZED (especially Object!!!)
		- Camel case for variables and method signatures, all caps for final variables