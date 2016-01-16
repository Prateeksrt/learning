package com.money;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class MoneyTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void test_value_of_five_dollar(){
        Dollar five = new Dollar(5);
        assertEquals(5.0,five.getValue(),0);
    }

    @Test
    public void test_value_of_ten_dollar(){
        Dollar five = new Dollar(10);
        assertEquals(10.0,five.getValue(),0);
    }

    @Test
    public void test_addition_five_and_ten_dollar(){
        Dollar five = new Dollar(5);
        Dollar ten = new Dollar(10);
        Dollar result = ten.add(five);
        assertEquals(15.0,result.getValue(),0);
    }

    @Test
    public void test_multiplication_of_five_dollar_by_five(){
        Dollar five = new Dollar(5);
        Dollar result = five.times(5);
        assertEquals(25.0,result.getValue(),0);
    }

    @Test
    public void test_negative_five_dollar_creation(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Value cannot be less than one");
        new Dollar(-5);
    }

    @Test
    public void test_zero_dollar_creation(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Value cannot be less than one");
        new Dollar(0);
    }

    @Test
    public void test_value_of_ten_rupee(){
        Rupee five = new Rupee(5);
        assertEquals(5.0,five.getValue(),0.0);
    }

    @Test
    public void test_five_time_five_rupee(){
        Rupee five = new Rupee(5);
        Rupee result = five.times(5);
        assertEquals(25,result.getValue(),0);
    }


    @Test
    public void test_negative_five_rupee_creation(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Value cannot be less than one");
        new Rupee(-5);
    }

    @Test
    public void test_zero_rupee_creation(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Value cannot be less than one");
        new Rupee(0);
    }

    @Test
    public void test_addition_five_and_ten_rupee(){
        Rupee five = new Rupee(5);
        Rupee ten = new Rupee(10);
        Rupee result = ten.add(five);
        assertEquals(15.0,result.getValue(),0);
    }
}
