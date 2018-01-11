package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testTaskFactory () {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task driving = taskFactory.taskGenerator(TaskFactory.getDRIVING());
        Task shopping = taskFactory.taskGenerator(TaskFactory.getSHOPPING());
        Task painting = taskFactory.taskGenerator(TaskFactory.getPAINTING());

        //Then
        Assert.assertEquals("Driving to the city", driving.getTaskName());
        Assert.assertEquals("Shoping task is executed",shopping.executeTask());
        Assert.assertTrue(painting.isTaskExecuted());
    }

}
