package task4.entity;

import task4.logic.exceptions.GradeOutOfLimitsException;

import java.util.ArrayList;

public class Student {
    private String fullName;

    private ArrayList<String> subjects;
    private ArrayList<Integer> grades;


    public Student(String fullName) {
        this.fullName = fullName;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }




    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList <String> subjects  ) {
        this.subjects = subjects;
    }


    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList <Integer> grades  ) throws GradeOutOfLimitsException {

        for (Integer grade : grades) {

            if (grade >= 0 && grade <= 10) {
                this.grades = grades;

            } else {
                throw new GradeOutOfLimitsException("The mark must be in the range from 0 to 10!");
            }


        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return fullName.equals(student.fullName);
    }



    @Override
    public String toString() {
        return "Student " +
                "fullname=" + fullName +

                "grades=" + grades +
                "subjects=" + subjects   ;
    }
}
