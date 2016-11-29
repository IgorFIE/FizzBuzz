package main;

/**
 * Created by pacifist on 18-11-2016.
 */
public class FizzBuzz {

    /**
     * Print number from 1 to a respective number
     * numbers multiples of three it will print "Fizz"
     * numbers multiples of five it will print "Buzz"
     * numbers multiples of both three and five it will print "main"
     *
     * @param n number that the method will stop printing
     */
    public void fizzBuzz(int n){

        for(int x = 1; x <= n; x++){
            String text = "";

            if( x % 3 == 0) text += "Fizz";
            if( x % 5 == 0) text += "Buzz";

            if(text == ""){
                System.out.println(x);
                continue;
            }

            System.out.println(text);
        }
    }
}
