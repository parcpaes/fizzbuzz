package FizzBazz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    public void isNotFizzBuzz(){
        //Arrange
        int fizzBuzzNumber =1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //Acts
        String expected = "1";
        String actual = fizzBuzz.isFizzBuzzNumber(fizzBuzzNumber);
        //Asserts
        assertEquals(expected,actual);
    }

    @Test
    void shouldReturnFizzBuzzStringWithValidNumber(){
        int fizzBuzzNumber = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String expected = "FizzBuzz";
        String actual = fizzBuzz.isFizzBuzzNumber(fizzBuzzNumber);

        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @MethodSource("provideMultiplesOfThree")
    public void isFizz(int multiplesOfThree){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Fizz";
        Assertions.assertEquals(expected,fizzBuzz.isFizz(multiplesOfThree));
    }

    public static int[] provideMultiplesOfThree(){
        int arrayOfMultiplesOfThree[] = new int[100];
        for (int i = 1; i <= arrayOfMultiplesOfThree.length; i++) {
            arrayOfMultiplesOfThree[i-1] = i*3;
        }
        return arrayOfMultiplesOfThree;
    }

    @ParameterizedTest
    @MethodSource("provideMultiplesOfFive")
    public void isBuzz(int multiplesOfFive){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";
        Assertions.assertEquals(expected,fizzBuzz.isBuzz(multiplesOfFive));
    }

    public static int[] provideMultiplesOfFive(){
        int arrayOfMultiplesOfThree[] = new int[100];
        for (int i = 1; i <= arrayOfMultiplesOfThree.length; i++) {
            arrayOfMultiplesOfThree[i-1] = i*5;
        }
        return arrayOfMultiplesOfThree;
    }

}