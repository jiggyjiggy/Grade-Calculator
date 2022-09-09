package org.example;

import java.util.List;

public class GradeCalculator {
    private final List<Course> courseList;

    public GradeCalculator(List<Course> courseList) {
        this.courseList = courseList;
    }

    public double calculateGrade() {
        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courseList) {
            multipliedCreditAndCourseGrade += course.multipliedCreditAndCourseGrade();
        }
        int totalCompletedCredit = courseList.stream()
                .mapToInt(Course::getCredit)
                .sum();

        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
