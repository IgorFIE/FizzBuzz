package test;


import FizzBuzz.FizzBuzz;
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

    private boolean multiplesOfThreeAndFive(int count, String s){
        if(count % 3 == 0 && count % 5 == 0) {
            assertEquals("FizzBuzz", s);
            return true;
        }
        return false;
    }

    private void multiplesOfThree(int count,String s){
        if(count % 3 == 0) assertEquals("Fizz", s);
    }

    private void multiplesOfFive(int count,String s){
        if(count % 5 == 0) assertEquals("Buzz", s);
    }

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
