/*
 * Copyright (c) 2016. Niranjan Rajendran <niranjan94@yahoo.com>
 */

package com.njlabs.amrita.aid.aums.models;

/**
 * Created by Niranjan on 22-10-2014.
 */
public class CourseData {

    String id;
    String courseCode;
    String courseName;
    String type;
    double credits;

    public CourseData() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
}