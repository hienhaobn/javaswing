
package com.qlda.model;

import java.util.Date;

/**
 *
 * @author hienh
 */
public class Project {
    private int project_id;
    private String project_name;
    private int person_number;
    private Date date_from;
    private Date date_to;
    private float total_money;
    private String description;
    private String status_project;

    public int getProject_id() {
        return project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public int getPerson_number() {
        return person_number;
    }

    public void setPerson_number(int person_number) {
        this.person_number = person_number;
    }

    public Date getDate_from() {
        return date_from;
    }

    public void setDate_from(Date date_from) {
        this.date_from = date_from;
    }

    public Date getDate_to() {
        return date_to;
    }

    public void setDate_to(Date date_to) {
        this.date_to = date_to;
    }

    public float getTotal_money() {
        return total_money;
    }

    public void setTotal_money(float total_money) {
        this.total_money = total_money;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus_project() {
        return status_project;
    }

    public void setStatus_project(String status_project) {
        this.status_project = status_project;
    }

    @Override
    public String toString() {
        return "Project{" + "project_id=" + project_id + ", project_name=" + project_name + ", person_number=" + person_number + ", date_from=" + date_from + ", date_to=" + date_to + ", total_money=" + total_money + ", description=" + description + ", status_project=" + status_project + '}';
    }

}
