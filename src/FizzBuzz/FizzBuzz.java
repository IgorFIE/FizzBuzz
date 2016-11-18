package FizzBuzz;

/**
 * Created by pacifist on 18-11-2016.
 */
public class FizzBuzz {

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
