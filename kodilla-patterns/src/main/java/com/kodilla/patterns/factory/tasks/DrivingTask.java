package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
    @Override
    public boolean isTaskExecuted(){
        return true;
    }
    @Override
    public String executeTask(){
        return "Driving task is executed";
    }
}
