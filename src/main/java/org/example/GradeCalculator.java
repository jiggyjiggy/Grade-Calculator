package org.example;

import java.util.List;

public class GradeCalculator {

    private final Courses courses;

    public GradeCalculator(List<Course> courseList) {
        this.courses = new Courses(courseList);
    }

    public double calculateGrade() {
        // (학점수 * 교과목 평점) 의 합계
        double totalMultipliedCreditAndCourseGrade = courses.multipliedCreditAndCourseGrade();
        // 수강신청 총학점 수
        double totalCompletedCredit = courses.totalCompletedCredit();

        return totalMultipliedCreditAndCourseGrade / totalCompletedCredit;
    }
}
