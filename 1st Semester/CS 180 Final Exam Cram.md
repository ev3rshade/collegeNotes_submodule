Which of the following statement(s) is/are incorrect? 
I. PrintWriter will always overwrite the contents of the file. 
II. BufferedReader can be used to write across a network stream 
III. BufferedWriter can only be used with files.

In Java an abstract class cannot extend another class
T/F

What is a JVM?

What is static binding and where does it occur?

**Integer.MAX_VALUE + 1 == Integer.MIN_VALUE** 
T/F

**Consider the following interface:**

**public interface Foo {**

   **void bar(); // A**

   **public void barBar(); // B**

   **abstract void barBarBar(); // C**

   **public abstract void barBarBarBar(); // D**

**}** 

Which method declarations shown above are valid?
guessing all of them are valid



Which of the following assertions about method overriding is true?

A) Overriding is the same as overloading
B) The signature of the overridden method must be different from the signature of the original method
C) None of the assertions are true
D) A method can be overridden only in the same class where the original method is defined
E) A derived class can override a method of the base class

What is the method signature of the **makeMatrix** method?

**static int[][] makeMatrix(int[] arr1, int[] arr2) throws ArrayIndexOutOfBoundsException {****}

How many base cases does a well-defined recursive function have?

---
##### T/F Question about File and Network IO Objects
**I. PrintWriter will always overwrite the contents of the file.**

This statement is **incorrect**. The `PrintWriter` class in Java does **not always** overwrite the contents of the file. Whether or not it overwrites the file depends on how it is instantiated. If you create a `PrintWriter` using a `FileWriter` that is set to append (`new FileWriter("file.txt", true)`), it will append data to the file. Without the append flag, it will overwrite the contents.

**II. BufferedReader can be used to write across a network stream.**

This statement is **incorrect**. The `BufferedReader` class is used for reading character data from an input stream, typically from files or other character-based input sources (like console input or network sockets), but it **cannot** be used to write data. For writing to a network stream, you would use classes like `BufferedWriter` or `OutputStreamWriter`, not `BufferedReader`.

**III. BufferedWriter can only be used with files.**

This statement is **incorrect**. The `BufferedWriter` class can be used not only with files but also with other output streams, such as network streams or other `Writer`-based streams (like `OutputStreamWriter` or `PrintWriter`). It is not limited to file use.

**In Java an abstract class cannot extend another class**
False

**What is a JVM?**
A Java Virtual Machine -- EXPLAIN WHAT IT IS HERE

What is static binding and where does it occur?
Static binding is the process in programming where the the code of a function and where itis called is connected. It is established during compile time.

**Integer.MAX_VALUE + 1 == Integer.MIN_VALUE**
T

**Which of the following assertions about method overriding is true?**
E) A derived class can override a method of the base class

**What is the method signature of the makeMatrix method?**
makeMatrix(int[] arr1, int[] arr2)

**How many base cases does a well-defined recursive function have?**
At least 1