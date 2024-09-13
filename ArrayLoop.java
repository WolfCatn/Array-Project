/*
This project was completed by Naomi Johnson. This project will print out numbers 1-100 and say whether each number is odd or even.
At the end of the number list, it will also print out the sum of the numbers 1-100.
 */
public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        short sum = 0;
        String type = "";
        //Setting up the variables and arrays.
        for(byte n = 0; n < numbers.length; n++) {
            numbers[n] = n + 1;
        }
        //Setting up the list to print the numbers 1-100
        for(int i : numbers) {
            //Determining whether the numbers are odd or even.
           if(i % 2 == 0) {
            //If the remainder is 0, the number is even. If not, the number is odd.
                type = "even";
                //If the number is even, print out "even" next to the number.
            } else {
                type = "odd";
                //If not even, print out "odd" next to the number.
            }
            System.out.println(i + ": " + type);
            //Prints out the number and whether it is even or odd.
            sum += i;
            //Adds each number to the sum variable.
        }
        System.out.println("The sum of numbers 1-100 is " + sum);
        //Prints out the sum of all the numbers after the list.
    }
}