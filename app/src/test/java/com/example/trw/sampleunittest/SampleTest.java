package com.example.trw.sampleunittest;

import org.junit.Assert;
import org.junit.Test;

public class SampleTest {

    @Test
    public void checkPhoneNumber_correctWithTrue() {
        boolean checkPhoneNumber = Sample.checkPhoneNumber("0987-6543-21");
        Assert.assertTrue(checkPhoneNumber);
    }

    @Test
    public void checkPhoneNumber_incorrectWithFalse() {
        boolean checkPhoneNumber = Sample.checkPhoneNumber("098-765-4321");
        Assert.assertFalse(checkPhoneNumber);
    }

    @Test
    public void checkPhoneNumber_incorrectWithNull() {
        boolean checkPhoneNumber = Sample.checkPhoneNumber(null);
        Assert.assertFalse(checkPhoneNumber);
    }

    @Test
    public void checkPhoneNumber_incorrectWithEmpty() {
        boolean checkPhoneNumber = Sample.checkPhoneNumber("");
        Assert.assertFalse(checkPhoneNumber);
    }

    @Test
    public void checkPhoneNumber_incorrectWithNotNumber() {
        boolean checkPhoneNumber = Sample.checkPhoneNumber("ABC");
        Assert.assertFalse(checkPhoneNumber);
    }
}





