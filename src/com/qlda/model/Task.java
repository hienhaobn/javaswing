
package com.qlda.model;

/**
 *
 * @author hienh
 */
public class Task {
    private int task_id;
    private int user_id;
    private int project_id;
    private String task_name;
    private int task_timer;
    private String status_task;
    private String description;

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public int getTask_timer() {
        return task_timer;
    }

    public void setTask_timer(int task_timer) {
        this.task_timer = task_timer;
    }

    public String getStatus_task() {
        return status_task;
    }

    public void setStatus_task(String status_task) {
        this.status_task = status_task;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" + "task_id=" + task_id + ", user_id=" + user_id + ", project_id=" + project_id + ", task_name=" + task_name + ", task_timer=" + task_timer + ", status_task=" + status_task + ", description=" + description + '}';
    }
    
}
