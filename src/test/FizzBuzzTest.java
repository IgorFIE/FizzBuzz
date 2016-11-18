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
    private PrintStream old;
    private String[] array;

    @Before
    public void init(){
        test = new FizzBuzz();
        baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);

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

            if(count % 3 == 0 && count % 5 == 0){
                assertEquals("FizzBuzz", s);
                count++;
                continue;
            }

            if(count % 3 == 0) assertEquals("Fizz", s);
            if(count % 5 == 0) assertEquals("Buzz", s);

            count++;
        }

    }

    @After
    public void close(){
        try {
            baos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
