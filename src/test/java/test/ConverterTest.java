package test;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class ConverterTest {

    private Converter converter;

    @org.junit.Before
    public void setUp() throws Exception {
        converter = new Converter();
    }

    @Test
    public void converterTest() {
        long numerals = converter.romanToNumerals("X");
        Assert.assertEquals(10L, numerals);
    }

    @Test
    public void easyRomanDigitsTest() {
        long result = converter.findNumeralDigit("I");
        Assert.assertEquals(1L, result);

        result = converter.findNumeralDigit("V");
        Assert.assertEquals(5L, result);

        result = converter.findNumeralDigit("X");
        Assert.assertEquals(10L, result);

        result = converter.findNumeralDigit("L");
        Assert.assertEquals(50L, result);

        result = converter.findNumeralDigit("C");
        Assert.assertEquals(100L, result);

        result = converter.findNumeralDigit("D");
        Assert.assertEquals(500L, result);

        result = converter.findNumeralDigit("M");
        Assert.assertEquals(1000L, result);
    }

    @Test
    public void romanDigit_2_Test() {
        long result = converter.romanToNumerals("II");
        Assert.assertEquals(2L, result);
    }

    @Test
    public void romanDigit_3_Test() {
        long result = converter.romanToNumerals("III");
        Assert.assertEquals(3L, result);
    }

    @Test
    public void romanDigit_MMMDL_3550_Test() {
        long result = converter.romanToNumerals("MMMDL");
        Assert.assertEquals(3550L, result);
    }

    @Test
    public void romanDigit_IX_9_Test() {
        long result = converter.romanToNumerals("IX");
        Assert.assertEquals(9L, result);
    }

    @Test
    public void romanDigit_MMVI_2009_Test() {
        long result = converter.romanToNumerals("MMVI");
        Assert.assertEquals(2006L, result);
    }

    @Test
    public void romanDigit_MCMXLIV_1944_Test() {
        long result = converter.romanToNumerals("MCMXLIV");
        Assert.assertEquals(1944L, result);
    }


}