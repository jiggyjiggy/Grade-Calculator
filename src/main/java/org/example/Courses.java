package org.example;

import java.util.List;

public class Courses {
    public Courses(List<Course> courseList) {
        this.courseList = courseList;
    }

    private final List<Course> courseList;

    public double multipliedCreditAndCourseGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courseList) {
            multipliedCreditAndCourseGrade += course.multipliedCreditAndCourseGrade();
        }
        return multipliedCreditAndCourseGrade;
    }

    public int totalCompletedCredit() {
        return courseList.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
