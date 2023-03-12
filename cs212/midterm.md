## Introduction

## Classes and Objects
Primitives
Objects
Class
Instantiation
Static variables
Instance variables
final modifer
methods
Inheritance

## Arrays and Sorting
```java
TextFileInput in = new TextFileInput(filename);
```
readline();
Math.min();

learn selection sort

## Methods and Parameter Passing
```java
public class ClassName {
    public static void main (String[] args){
        int a,b; // actual parameters
        method(a,b);
    }
    public static method(int x, int y){
        //x and y are formal parameters
        // do something
    }
}
```
Primitive type parameters are passed by value

Object type parameters are passed by reference. A reference to the parameter is given to the method.

How does this work with memory location ?

//lots of other stuff in this slide

arrays are pass by reference in methods

How does selection sort work!?

## Program Modularity and Error Handling

Assertions
Exceptions
```java
throw new IllegalArgumentException("An SSN length must be 9");
```
## Using a simple GUI
Creating a jframe
Putting data inside jframe
Inheritance
ContentPane can be divided into different areas using LayoutManager : borderLayout, GridLayout

Non-application Classes (no main method)
example
```java
import javax.swing.*;
public class SSNGUI extends JFrame {
  public SSNGUI(String title, int height, int width) {
    setTitle(title);
    setSize(height, width);
}
```
## Defining a simple Class
Attributes: data values
Behavior: constructor, set and get method

Private method
Static method

equals()
toString()
this operator

## File Input and Wrappers

TextFileInput
```java
String s;
TextFileInput in = new TextFileInput(“input.txt”);
s = in.readLine();
while (s != null) {
   System.out.println(s);
   s = in.readLine();
}
```
Scaner
```java
import java.io.File;
import java.io.IOException; 
import java.util.Scanner; 

public class ReadFile { 
   public static void main(String[] args) throws IOException { 
      Scanner scanner = new Scanner(new File("input.txt"));
      while(scanner.hasNextLine()){
         System.out.println(scanner.nextLine()); 
      } 
      scanner.close(); 
   }
}
```

Scanner from Keyboard
```java
import java.util.*;  
public class Main 
{  
    public static void main(String args[]){
       Scanner in = new Scanner (System.in);  
       System.out.print ("Enter a String: ");  
       String mystr = in.nextLine();  
       System.out.println("The String you entered is: " + mystr); 
       in.close();             
    }  
}

```

Wrapper class Character

```java
Character c = new Character(‘a’);
char myChar = Character.charValue(c);// myChar gets  ‘a’
Character.isDigit(c);         // returns false
Character.isLetter(c);        // returns true
Character.isLowerCase(c);     // returns true
Character.isUpperCase(c);     // returns false
Character.toLowerCase(c);     // returns   ‘a’
Character.toUpperCase(c);     // returns  ‘A’
Character.toString(c);          //  returns   “a”
```

Wrapper Class Integer
```java
Integer i = new Integer (123);     


Integer i = new Integer(“123”);
Integer.intValue(i);        // returns   123
Integer.parseInt(“123”);    // returns   123
Integer.toString(i);        // returns  “123”
```
## Dynamic vs Static Structures
Linked lists.

