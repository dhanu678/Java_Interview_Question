public class Armstrong_number {
// number that is equal to the sum of its own digits raised to the power of the number of digits.
//153 = 1^3+5^3+3^ =153
    public static void main(String[] args) {
        int sum = 0,res,temp;
        // Declares three variables:
// 'sum' is initialized to 0. It will store the sum of the cubes of the digits.
// 'res' will hold the remainder (last digit of the number) during the calculation.
// 'temp' will store the original number for comparison later.
        int num = 153;
        temp = num;
        // The value of 'num' is stored in 'temp'.
// This ensures that the original number is preserved for the final comparison.
        while(num>0){
            // A loop that continues as long as 'num' is greater than 0.
    // This loop will break the number into its digits, process each digit, and calculate the sum of their cubes.
            res = num%10;
            // Extracts the last digit of 'num' by taking the remainder of division by 10.
// Example for num = 153: res = 153 % 10 = 3
            sum = sum +(res*res*res);
            // Calculates the cube of the extracted digit ('res') and adds it to 'sum'.
// Example for res = 3: sum = 0 + (3 * 3 * 3) = 27

        }
        if (temp == sum)
        System.out.println(temp+"is Armstrong_number") ;
        else
        System.out.println(temp+ "is not amstrong number");



}

    
}