package week8Files;

public class Interface {
    //TODO what is an interface?
    // what does an asymmetric system mean? what does a symmetric system mean?

    // Examples: Graphical User Interface (GUI): user --> computer
              // Application Programming Interface(API): application program --> library of related methods

    // Java Class "clients" --> Java Class
    //TODO What does a Java class interface consist of?

    // Java language DEFINES a "contract" between class that implements (provides) interface --> a class that defines the interface
    // TODO what must any class that implements an interface do

    // TODO write an example of interface syntax
    // an interface is like a class in which you forgot to declare the fields and left out the method bodies

    // TODO what is a Default Method?
    // TODO (T/F) an interface can define static methods
     // TODO write an example of a static method being explicitly referenced
    // static methods are NOT inherited when the class is implemented

    // TODO given an interface Cloud and a class Rain write an example of interface implementation
    // ALL METHODS DECLARED IN CLOUD MUST APPEAR IN RAIN (additional methods can appear tho)

    // Fields - implicitly declared public, final, and static
        interface Constants {
            double X = 1234.56;
            int Y = -1;
            String Z = "hello there";
        }
        public class Booyah implements Constants {
            public static void main(String[] args) {
                System.out.println(X);
                System.out.println(Y);
                System.out.println(Z);
            }
        }

        // TODO (T/F) a class can implement multiple interfaces
    // TODO what are the tricky parts of implementing multiple interfaces




    // INTERFACE EXAMPLES
    // TODO review these






}
