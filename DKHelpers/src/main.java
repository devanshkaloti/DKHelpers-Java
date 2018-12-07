// V.1.0.0 Final
// Devansh Kaloti

public class main {
    public static void main(String[] args) {
        // Print Function
        String name = "Devansh"; String hobby = "program";

        DKHelpers.print("Example of Formatted String:");
        DKHelpers.print("\t%s loves to %s\n", name, hobby); //*

        // Input - String function
        DKHelpers.print("Example of User Input (String)");
        String food = DKHelpers.input("\tWhat is your favourite food: "); //*
        DKHelpers.print("\tYour favourite food is %s!\n", food);

        // Input - No Range
        DKHelpers.print("Example of User Input (No Range Integer)");
        int input = DKHelpers.input("\tPlease enter any number: ", -0);
        DKHelpers.print("\tYour input was %s!\n", input);

        // Input - Min
        DKHelpers.print("Example of User Input (Min-Value: 5)");
        int inputwithMin = DKHelpers.input("\tPlease enter a number greater than 5: ", 5);
        DKHelpers.print("\tYour input was %s!\n ", inputwithMin);

        // Input - Range
        DKHelpers.print("Example of User Input (Min-Max)");
        int inputwithRange = DKHelpers.input("\tPlease enter a number between 1 and 10: ", 1, 10);
        DKHelpers.print("\tYour input was %s! \n", inputwithRange);







    }

}
