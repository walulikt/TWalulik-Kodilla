package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLog() {
        //Given
       //When
        Logger.getInstance().log("Log nr 1");

        //Then
        Assert.assertEquals("Log nr 1", Logger.getInstance().getLastLog());
    }

}
