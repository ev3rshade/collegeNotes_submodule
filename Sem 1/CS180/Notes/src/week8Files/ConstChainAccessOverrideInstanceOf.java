package week8Files;

public class ConstChainAccessOverrideInstanceOf {
    // TODO What is constructor chaining
    // TODO What are the rules of constructor chaining

    // Default constructor
    /* public ClassName() {
    *     super();
    *  }  */

    // If you provide a constructor, Java inserts the statement super(); automatically
    // There is explicit chaining!!!

    // TODO Write an example of explicit constructor chaining for Person <-- Student
        // if the base class doesn't have a parameterless constructor, the subclass must make an explicit call
        // this(...) and super()
            // if you call this(...), Java does not call super() --> first statement

    // TODO copy terminology from slides




    // ACCESS RESTRICTIONS AND VISIBILITY
    // TODO (T/F) subclasses can access private fields in their superclasses
    // TODO what are the two options to circumvent access issues? And which one is advised

    // TODO what are all Java access modifiers in order of restrictiveness?

    // OVERRIDING
    // TODO what is overloading? what is overriding?
        // TODO which class overrides the other?
    // annotate --> doesn't affect functionality
    // @Override

    // INSTANCE OF OPERATOR
    // it's possible to determine if an object is of a particular class
    // TODO when does (objectA instanceOf ClassB) evaluate to true
    // Person pers = (Person) ois.readObject();

    // Exception class hierarchy
    // TODO draw the exception class hierarchy diagram
    // TODO write an example of your own Exception class




}
