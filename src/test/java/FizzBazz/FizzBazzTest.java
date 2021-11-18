package FizzBazz;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBazzTest {
    @Test
    public void isNotFizzBazz(){
        int fizzBazzNumber =1;
        FizzBazz fizzBazz = new FizzBazz();
        Assert.assertSame(fizzBazz.isFiszzBazzNumber(fizzBazzNumber),"1");
    }
}