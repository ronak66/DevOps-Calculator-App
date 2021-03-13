package app;

import org.junit.*;

// import org.junit.After;
// import org.junit.Before;
// import org.junit.BeforeClass;
// import org.junit.Ignore;
// import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    /**
     * Rigorous Test :-)
     */
    private Calculator calculator;
    
    @Before
    public void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testSquareRoot(){
        double num = 101;
        double expected_result = Math.sqrt(num);
        calculator.square_root(num);
        double result = calculator.get_ans();
        Assert.assertEquals(expected_result, result, 0.00001);
    }

    @Test
    public void testfactorial(){
        double num = 5;
        double expected_result = 120;
        calculator.factorial(num);
        double result = calculator.get_ans();
        Assert.assertEquals(expected_result, result, 0.00001);   
    }

    @Test
    public void loge(){
        double num = 2.7;
        double expected_result = Math.log(num);
        calculator.loge(num);
        double result = calculator.get_ans();
        Assert.assertEquals(expected_result, result, 0.00001);
    }

    @Test
    public void power(){
        double base = 5;
        double power = 3;
        double expected_result = 125;
        calculator.power(base,power);
        double result = calculator.get_ans();
        Assert.assertEquals(expected_result, result, 0.00001);
    }
}
