package FizzBazz;

public class FizzBuzz {
    private int number;

    public String isFizzBuzzNumber(int number) {
        String fizzBuzz = isFizz(number)+isBuzz(number);
        if(fizzBuzz.equals("FizzBuzz")) return "FizzBuzz";
        return String.valueOf(number);
    }

    public String isFizz(int multipleByThree){
        if(multipleByThree%3==0) return "Fizz";
        return Integer.toString(multipleByThree);
    }

    public String isBuzz(int multipleByFive){
        if(multipleByFive%5==0) return "Buzz";
        return Integer.toString(multipleByFive);
    }
}
