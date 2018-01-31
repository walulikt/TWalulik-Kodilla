package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static String DESCRIPTION = "This is a description of the Task List";

    @Test
    public void testFindByListName(){

        //Given
        TaskList taskList = new TaskList(1, "To Do List", DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        Assert.assertEquals (taskList.getListName(), taskListDao.findByListName("To Do List").get(0).getListName());

        //CleanUp
        taskListDao.delete(taskList);
    }
}
