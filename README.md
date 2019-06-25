# DKHelpers-Java
A helper class for Java Beginners!
This class may help simplify your code and make it easier to understand Java. 

## Installation
``` $ git clone https://github.com/devanshkaloti/DKHelpers-Java ```

Go into ```DKHelpers/src/DKHelpers.java``` where all the helper functions are located. 

## Implementation
### Only required on superclass
```
public class Human extends DKHelpers {
    // For usage help, please see below
    
}
```

## Functions Available
The following is a list of the functions currently available. Different functions provide different functionality. The first one, for example lets you create a string with placeholders. The other ones focus on user input and error-handling.

### Formatted String
#### Print a formatted string
```
String name = "Devansh"; String hobby = "program";
print("%s loves to %s", name, hobby);
```

#### Take User Input as String
```
String food = DKHelpers.input("What is your favourite food: ");
print("Your favourite food is %s!", food);
```

#### Take User Input as Integers
```
int input = input("Enter any number: ", -0);
int inputMin = input("Enter any number above 5: ", 5);
int inputwithRange = input("Enter any number between 1 & 10: ", 1, 10);
```

#### Converting Datatypes (Internal Code Usage)
```
int myInt = toInt("11");
String myString = toString(11)
char[] myChars = toChars("Hello")
```

If you have any questions, please get in touch with me at devansh@dksources.com!
