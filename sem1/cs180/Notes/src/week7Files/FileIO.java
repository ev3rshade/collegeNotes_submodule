/* week 7
 * wednesday
 * File I/O
 * */

import com.sun.source.tree.Tree;

import java.io.*;

public class FileIO {
    // RAM vs Files
    // Draw File I/O in its role as a communicator between programs

    // Java is platform independent --> explain that in common words

    // File class in java
             // 3 layers of abstraction
             // All data stored as a stream of bytes

    // buffering
             // why do we buffer
             // is buffering faster or slower for large volumes of data?

             // what is DRAM?
             // T/F buffers sends output immediately to disk drive

             // what must you always do with files when you're done? write it in terms of buffers too
    public static void main(String[] args) throws IOException {
        // LOW-LEVEL
          // "Raw" data transfer: byte-oriented
          // What are the classes for low level data transfer??

        File f = new File("lowlevel");

        FileOutputStream fos = new FileOutputStream(f);
        OOS BUILD ON FOS:
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        OOS BUILD ON FOS:
        Tree tree1 = new Tree(42, "elm");
        oos.writeObject(tree1);
        oos.close();

        // write method --> append is also an option to allow OS to establish "buffers" and other info abt file
        // transfers data from user process to file or output stream
        fos.write(42);

        // what you must do after every file op
        fos.close();

        FileInputStream fis = new FileInputStream(f);
        OOS BUILD ON FOS:
        ObjectInputStream ois = new ObjectInputStream(fis);

        // object is read
        Tree tree2 = (Tree) ois.readObject();

        ois.close();

        // read, data transfer from file/input stream --> user process
        //specific method sig indicate types
        int i = fis.read();
        System.out.printf("Read%d%n", i);

        // what you must do after every file op
        fis.close();


        // KEEP TRACK OF WHAT YOU'RE DOING!!!!
        // T/F Data values must be read in the same order in which they were written

        // Compare and contrast text files and binary files
        // don't forget to write down their file endings

        // HIGHLEVELFILEIO
        File f = new File("textio.txt");

        // open FileOutputStream in append mode (true)
        FileOutputStream fos = new FileOutputStream(f, true);

        // why is PrintWriter favored over PrintStream?
        PrintWriter pw = new PrintWriter(fos);
        pw.println("our old friend");

        // must use
        pw.close();

        // when would you use BufferedReader over FileReader or Scanner?
        FileInputStream fis = new FileInputStream(f);
        FileReader fr = new FileReader();

        //what you must do every time you read or write a file
        pw.close();
    }
    }
}