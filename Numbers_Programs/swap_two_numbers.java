class SwapTwoNumbers { // This defines a class named 'SwapTwoNumbers'.
    public static void main(String[] args) { // The main method, where program execution starts.
        
        int a = 4; // Variable 'a' is initialized with the value 4.
        int b = 7; // Variable 'b' is initialized with the value 7.

        // At this point:
        // a = 4, b = 7

        int temp = a; // A temporary variable 'temp' is created to hold the value of 'a'.
        // Now, temp = 4 (original value of 'a').

        a = b; // The value of 'b' is assigned to 'a'.
        // Now, a = 7 (value of 'b').

        b = temp; // The value stored in 'temp' (original value of 'a') is assigned to 'b'.
        // Now, b = 4 (value originally in 'a').

        System.out.println("After swapping: a = " + a + ", b = " + b); 
        // This prints the swapped values of 'a' and 'b' to the console.
    }
}