package test;


import main.FizzBuzz;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;


/**
 * Created by pacifist on 18-11-2016.
 */
public class FizzBuzzTest {

    private FizzBuzz test;
    private ByteArrayOutputStream baos;
    private PrintStream out;
    private PrintStream old;
    private String[] array;


    /**
     * Instantiate the main class for the test
     * Instantiate the printStream with a ByteArrayOutputStream to collect the output
     * Save the old System out and set a the new one to collect
     *
     * Then call the fizzBuzz method with a insane amount of numbers
     *
     * Then get the output to String and Split it into a Array
     */
    @Before
    public void init(){
        test = new FizzBuzz();

        baos = new ByteArrayOutputStream();
        out = new PrintStream(baos);

        old = System.out;
        System.setOut(out);

        test.fizzBuzz(1000);

        System.out.flush();
        System.setOut(old);

        array = baos.toString().split("\n");
    }


    /**
     * Test the array to see if the multiples of three/five and both
     * are printing the correct answer
     */
    @Test
    public void fizzBuzzTest(){
        int count = 1;

        for(String s : array){
            if(multiplesOfThreeAndFive(count,s)){
                count++;
                continue;
            }

            multiplesOfThree(count,s);
            multiplesOfFive(count,s);

            count++;
        }
    }


    /**
     * Test to see if a number is multiple of three and five
     * and the output is printing "FizzBuzz"
     *
     * @param count number
     * @param s output
     * @return true if the number is multiple of both five and three
     */
    private boolean multiplesOfThreeAndFive(int count, String s){
        if(count % 3 == 0 && count % 5 == 0) {
            assertEquals("FizzBuzz", s);
            return true;
        }
        return false;
    }

    /**
     * Test to see if a number is multiple of three and if
     * the output is "Fizz"
     *
     * @param count number
     * @param s output
     */
    private void multiplesOfThree(int count,String s){
        if(count % 3 == 0) assertEquals("Fizz", s);
    }

    /**
     * Test to see if a number is multiple of five and if
     * the output is "Buzz"
     *
     * @param count number
     * @param s output
     */
    private void multiplesOfFive(int count,String s){
        if(count % 5 == 0) assertEquals("Buzz", s);
    }


    /**
     * Close all the Streams
     */
    @After
    public void close(){
        try {
            baos.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
