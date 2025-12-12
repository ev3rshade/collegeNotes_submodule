package week10Files;

public class GUI {
	// DIALOGS - simple GUI's

	// TODO compare and contrast a text-based interfeace with a GUI

	//
	

	// to make a GUI you need the application to be running on JVM with a window system configured -- WDL useres: might work without additional config
	
	
	// TODO Java dialogs are "modal" - what does that mean?
	
	// Java's original approach was the Abstract Window Toolkit (java.awt)
		// develep against a GUI abstraction and Java uses native componenets from the OS
		// what went wrong with "write once, deploy everywhere"?
	
	// TODO what do we now use for Java GUI?
		// TODO write an import statment for this Java class

		// TODO what are the naming standards of swing classes?
		

	// TODO what is the JOptionPane class?
		// TODO what are some common static methods from this class?
		
		// TODO what are some common arguments that can be passed to the class?
			// you can just use the default values instead tho
		
			
			//ANNOTATE EACH BELOW WITH PARAMETERS AND RETURN AND DETAILS
				// TODO ammptate Message Type types
				// TODO annotate showMessageDialog
				// TODO showConfirmDialog
				// TODO showInputDialog
				// TODO showOptionDialog
	







	// GUI EXAMPLES
        // method that displays the number of codons counted form a DNA class
		/* public static void displayCodons(String dna) {
			String message = "";

			// Get as many complete codons as possible
			for (int i = 0; i < dna.length() - 2; i += 3)
				message += "\n" + dna.substring(i, i + 3);
			
			// 1-2 bases might be left over
			int remaining = dna.length() % 3;
			if (remaining == 1)
				message += "\n"+ dna.substring(dna.length() - 1, dna.length()) + "**";

			else if (remaining == 2)
				message += "\n"+ dna.substring(dna.length() - 2, dna.length()) + "*";
				message = "dna length: " + dna.length() + "\n\nCodons: " + message;


			JOptionPane.showMessageDialog(null, message, "Codons in DNA", JOptionPane.INFORMATION_MESSAGE);
		}
		* */ 
        // TODO what is the class for prompting for a file name
            //--> what are the steps
		// TODO write the problem prompting for a file name




    // COMPLEX GUIs
    // TODO compare and contrast command-line interface and GUI

    // TODO what is a model-view controller
        // TODO what are the three parts of the model-view-controller
        // what does the controller do?

    // TODO what are components/widgets (window gadgets)
        // TODO what is the hierarchy -- draw it

    // TODO what are the two package of classes
        // 1.
        /* 2.
         * TODO what are each of these classes
         * JFrame
         *      // TODO what are common JFrame operations
         * JPanel
         *      // TODO what is a panel
         *      // TODO what are common JPanel operations
         *
         * JLabel
         *      // TODO what are common JLabel operations
         *
         * JButton
         * JTextField
         * JTextArea
         * TODO DRAW THE JAVA COMPONENTS TREE*/

    // how do we manage all of these? --> layout
        // NOTE we will learn layout managers later
        // TODO write an example of adding buttons to borders


    // EVENTS
    // --> connects user to computer via IO
    // TODO what are some event examples
    // TODO draw the event handling process (using the graphic from the slides)

    // TODO what is the Event Dispatch Thread (EDT)
    // TODO (T/F) the main thread from the main method  is what you will be using to primarily control your code

    // TODO how are Swing classes handled if they are not Thread safe

    // TODO write the example of launching the JFrame so it runs on the EDT

    // TODO what are the two local inner classes

    // TODO what are all the observers in Java

    // TODO - what are some examples of source to listener relationships?

    // TODO what methods does an ActionListener interface contain
        // TODO annotate the "push me" example

        // TODO what are the three techniques to use an ActionListener
        // TODO when would you use an anonymous inner class
            // WRITE AN EXAMPLE OF ONE
        // TODO what is an adapter class



    // TODO what is a layout manager
        // TODO what are some examples of layout managers
        // FlowLayout - default layout manager
        // TODO write the FlowLayout example



    //












}
