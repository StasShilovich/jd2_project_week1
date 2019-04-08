package com.gmail.shilovich.stas;

import com.gmail.shilovich.stas.impl.StringServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class AddServiceTest {

    @Test
    public void shouldReturnZeroWhenStringNull() {
        StringService stringService = StringServiceImpl.getInstance();
        int sum = stringService.add("");
        Assert.assertEquals(0, sum);
    }

    @Test
    public void shouldAddMaximumTwoNumbers() {
        StringService stringService = StringServiceImpl.getInstance();
        String numbers = "0,34:2";
        int sum = stringService.add(numbers);
        Assert.assertEquals(0, sum);
    }

    @Test
    public void shouldAddMethodWorkCorrect() {
        StringService stringService = StringServiceImpl.getInstance();
        String numbers = "34|2";
        int sum = stringService.add(numbers);
        Assert.assertEquals(36, sum);
    }
}
