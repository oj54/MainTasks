package task4;


import task4.entity.Faculty;
import task4.entity.Student;
import task4.entity.StudentGroup;
import task4.entity.University;
import task4.logic.exceptions.*;

import java.util.ArrayList;
import java.util.Arrays;

import static task4.logic.calculations.Average.*;


public class MainUniversity {
    public static void main(String[] args) {

        University Surrey = new University("Surrey University");
        Faculty psychologyFaculty = new Faculty("Faculty of Psychology");
        StudentGroup psychologyGroupOne = new StudentGroup("1-PSY");
        StudentGroup psychologyGroupTwo = new StudentGroup("2-PSY");
        Student student1 = new Student("James Wo");
        Student student2 = new Student("Harry Nane");
        Student student3 = new Student("Jane Balo");
        Student student4 = new Student("George Ken");


        // adding subjects
        ArrayList<String> SubjectsPsychology  = new ArrayList<String>();
        SubjectsPsychology.add("Psychology");
        SubjectsPsychology.add("Philosophy");
        SubjectsPsychology.add("Psychotherapy");
        SubjectsPsychology.add("Gestalt Psychology");
        SubjectsPsychology.add("Culture studies");

        student1.setSubjects(SubjectsPsychology);
        student2.setSubjects(SubjectsPsychology);
        student3.setSubjects(SubjectsPsychology);
        student4.setSubjects(SubjectsPsychology);

        // adding grades
        ArrayList<Integer> gradesPsychology1  = new ArrayList<Integer>();
        gradesPsychology1.add(6);
        gradesPsychology1.add(8);
        gradesPsychology1.add(4);
        gradesPsychology1.add(6);
        gradesPsychology1.add(9);

        ArrayList<Integer> gradesPsychology2  = new ArrayList<Integer>();
        gradesPsychology2.add(6);
        gradesPsychology2.add(3);
        gradesPsychology2.add(7);
        gradesPsychology2.add(7);
        gradesPsychology2.add(7);

        ArrayList<Integer> gradesPsychology3  = new ArrayList<Integer>();
        gradesPsychology3.add(6);
        gradesPsychology3.add(2);
        gradesPsychology3.add(7);
        gradesPsychology3.add(10);
        gradesPsychology3.add(5);

        ArrayList<Integer> gradesPsychology4  = new ArrayList<Integer>();
        gradesPsychology4.add(8);
        gradesPsychology4.add(7);
        gradesPsychology4.add(9);
        gradesPsychology4.add(5);
        gradesPsychology4.add(8);



        try {

            student1.setGrades(gradesPsychology1);
            student2.setGrades(gradesPsychology2);
            student3.setGrades(gradesPsychology3);
            student4.setGrades(gradesPsychology4);

            // adding students in groups
            psychologyGroupOne.setStudentsInGroup(Arrays.asList(student1, student2));
            psychologyGroupTwo.setStudentsInGroup(Arrays.asList(student3, student4));
            // adding groups to the Faculty of Psychology
            psychologyFaculty.setStudentGroups(Arrays.asList(psychologyGroupOne, psychologyGroupTwo));
            // adding a faculty to the university
            Surrey.setFacultiesInUniversity(Arrays.asList(psychologyFaculty));




            System.out.println(student1.getFullName() + "'s average");
            System.out.println(getStudentAverage(student1));

            System.out.println("Average grade of Psychology subject at 2-PSY group (Psychology Faculty) ");
            System.out.println(getSubjectFacultyGroupAverage(psychologyFaculty,"2-PSY", "Psychology" ) );

            System.out.println("Average grade of Culture studies subject across the university ");
            System.out.println(getAverageScoreByUniversity(Surrey,"Culture studies"))  ;



        } catch (GradeOutOfLimitsException | NoSubjectException | NoStudentException |
                NoGroupException | NoFacultyException e) {
            e.printStackTrace(System.err);
        }
    }
}
