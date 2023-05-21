## Linked lists
- define list node \

- singly list list with head node and counter
- traversing linked list
- appending
- insert new node after a given node

## Interfaces
- class
- interface
- classes are extended while interfaces are implemented

## Inheritance
- super()

## Abstract classes and methods
- what are abstract classes and methods

## Event - Driven programming
- creating of a GUI (Jframe) with Jmenubar, Jmenu, and JMenuItem
- JMenuItem and an event handler (ActionListener)
- Creating an ActionListener


```java

public interface Flapping {
 public static final int DEFAULT_WING_BEATS = 30;
 public static final int DEFAULT_POPULATION = 10000;
 public int wingBeats ();
 public boolean flaps ();
}

public abstract class Animal {
    String species;
    int population;

    public Animal (String s, int p) {
        if (s == null || s=="")
            throw new InvalidAnimalException("Species must be given.");
        if (p<0)
            throw new InvalidAnimalException("Population cannot be negative");
        species = s;
        population =p; 
        System.out.println("New animal, species is " + species + ",population " + population);

        public String getSpecies(){
            return species;
        }

        public setPopulation(int p){
            if (p < 0)
                throw new InvalidAnimalException("Population cannot be negative");
            population = p;
        }
    }
}


public class FlyingAnimalException extends IllegalAtgumentException{
    public FlyingAnimalException(String message){
        super(message);
    }
}


public abstract class FlyingAnimal extends Animal implements Flapping {
    protected int wingBeatsPerSecond;
    public FlyingAnimal (String name, int population, int w) {
        super(name,population);
        if (w<1) throw new FlyingAnimalException("Wing beats must be > 0");
        else
            wingBeatsPerSecond = w;
    }
    public String toString() {
        return this.getClass().getName();
    }
}


public class Bird extends FlyingAnimal {
    private boolean flapping = true;
    public Bird (String species) {
        super (species, Flapping.DEFAULT_WING_BEATS,Flapping.DEFAULT_POPULATION);
    }
    public Bird (String species, int population, int wingBeats) {
        super(species, population, wingBeats);

        System.out.println(this.toString()+" created, Species is "+ species+" wing beats = "+wingBeats);
    }
    public int wingBeats() {
        return wingBeatsPerSecond;
    }
    public boolean flaps (){
        return flapping;
    }
}


public class Bat extends FlyingAnimal {
    private boolean flapping = false;
    public Bat (String species) {
        super (species, Flapping.DEFAULT_WING_BEATS,Flapping.DEFAULT_POPULATION);
    }
    public Bat (String species, int population, int wingBeats) {
        super(species, population, wingBeats);

        System.out.println(this.getClass().getName()+" created, Species is "+
        species+" wing beats = "+wingBeats);
    }
    public int wingBeats() {
        return wingBeatsPerSecond;
    }
    public boolean flaps (){
        return flapping;
    }

}

```








```java

import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame { // class
    private JFrame mainWindow;
    private JMenuBar mainMenuBar;
    private Menu exam2 ;
    private JMenuItem mPass, mFail, mQuit ;
    private Exam2Listener exam2ML;

    public static void main (String args[]){
        MainWindow m = new MainWindow("Exam 2");
    } 

    public MainWindow (String title) { // constructor
        mainWindow = new JFrame(title);
        mPass = new JMenuItem ("Pass");
        mFail = new JMenuItem ("Fail");
        mQuit = new JMenuItem ("Quit");
        exam2 = new Menu ("Exam 2", /*tearoff =*/ false);
        exam2.add(mPass);
        exam2.add(mFail);
        exam2.addSeparator();
        exam2.add(mQuit);
        mainMenuBar = new MenuBar();
        mainMenuBar.add(exam2);
        mainWindow.setMenuBar(mainMenuBar);
        exam2ML = new Exam2Listener(this); //ActionListener
        mPass.addActionListener(exam2ML);
        mFail.addActionListener(exam2ML);
        mQuit.addActionListener(exam2ML);

        mainWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainWindow.setSize(400,400);
        mainWindow.setLocation(100,100);
        mainWindow.setVisible(true);
    } // constructor
} // class

```

```java
import java.awt.*;
import java.awt.event.*;
public class Exam2Listener implements ActionListener {
    private MainWindow mainFrame;

    public Exam2Listener(MainWindow f) {
        mainFrame = f;
    } // constructor

    public void actionPerformed(ActionEvent e) {
        String chosenItem = ((MenuItem) e.getSource()).getLabel();
        if (chosenItem.equals( "Pass" )) {
            System.out.println("Hooray! You passed!");
        } // end if mInputFile

        else if (chosenItem.equals("Fail")) {
            System.out.println( "Too bad! You failed." );
        } // end if mInputFile

        else if ( chosenItem.equals("Quit")) {
            System.exit(0);
        } //if
    } // action performed

} // class Exam2Listener


```

## Exam 2
### Question 1

```java

public class Question1 {
    public static void main(String[] args) {
        String items[] = {"10","exam","20","five"};
        for (int i = -1; i<items.length; i++) {
            try {
                System.out.println("The answer is: "+Integer.parseInt(items[i]));
            }
            catch (NumberFormatException nfe) {
                System.out.println("Oops! "+items[i]);
            }
            catch (ArrayIndexOutOfBoundsException aob){
                System.out.println("Bad array.");
            }
            catch (Exception e) {
                System.out.println("Oh, no!");
            }
            finally {
                System.out.println(“Let’s go.”)
            }
        }
    }
}
/*
Output: 

Bad array.
Let’s go.
The answer is 10
Let’s go.
Oops! Exam
Let’s go.
The answer is 20
Let’s go.
Oops! Five
*/
```

### Question 2

```java

public class Question {
    public static void main (String[] args) {
        Alpha myArray [] = new Alpha[4];
        myArray[0] = new Beta(1);
        myArray[1] = new Beta(3);
        myArray[2] = new Gamma(5);
        myArray[3] = new Gamma(7);

    }
}
public class Alpha {
    public Alpha(int x) {
        super();
        System.out.println("I am Alpha, and x is "+x);
    }
}

public class Beta extends Alpha {
    public Beta (int y) {
        super(y+3);
        System.out.println("I am Beta, and y is "+y);
    }
}

public class Gamma extends Alpha {
    public Gamma (int y){
        super(y+5);
        System.out.println("I am Gamma and y is "+y);
    }
}

/*
Output:
I am Alpha, and x is 4
I am Beta, and y is 1
I am Alpha, and x is 6
I am Beta, and y is 3
I am Alpha, and x is 10
I am Gamma, and y is 5
I am Alpha, and x is 12
I am Gamma, and y is 7
*/
```

### Question 3

```java
public class StringNode {
    String data;
    StringNode next;

    public StringNode() {
        data=null;
        next=null;
    }
    public StringNode(String value){
        data=value;
        next=null;
    }
}

public class StringList {
    StringNode first;
    StringNode last;
    int length;

    //a - fill in the missing constructor
    public StringList(){
        StringNode newNode = new StringNode();
        first = newNode;
        last = newNode;
        length = 0;
    }

    //b - fill in the prepend method
    public void prepend(String value){
        StringNode newNode = new StringNode(value);
        newNode.next = first.next;
        first.next = newNode;
        if(first == last) last = newNode;
        length++;
    }

    //c - equals method
    public boolean equals(StrintgList other){
        if(length != other.length) return false;

        StringNode thisNode = first.next;
        StringNode otherNode = other.first.next;

        while (thisNode != null){
            if(!thisNode.data.equals(otherNode.data)) return false
            thisNode = thisNode.next;
            otherNode = otherNode.next;
        }

        return true
    }

}

```

### Question 4

```java
import java.awt.*;
import java.awt.event.*;
public class Exam2Listener implements ActionListener {

    private MainWindow mainFrame;

    public Exam2Listener(MainWindow f) {
        mainFrame = f;
    } // constructor

    public void actionPerformed(ActionEvent e) {
        String chosenItem = ((MenuItem) e.getSource()).getLabel();
        if (chosenItem.equals( "Succeed" )) {
        System.out.println("Hooray! You passed!");
        } // end if mInputFile
        else if (chosenItem.equals("Fail")) {
        System.out.println( "Sorry! You failed." );
        } // end if mInputFile
        else if ( chosenItem.equals("Quit")) {
        System.exit(0);
        } //if
    } //
} // class Exam2Listener
```