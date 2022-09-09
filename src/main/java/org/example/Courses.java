package org.example;

import java.util.List;

public class Courses {
    private final List<Course> courseList;

    public Courses(List<Course> courseList) {
        this.courseList = courseList;
    }

    public double multipliedCreditAndCourseGrade() {
        return courseList.stream()
                .mapToDouble(Course::multipliedCreditAndCourseGrade)
                .sum();
    }

    public int totalCompletedCredit() {
        return courseList.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
