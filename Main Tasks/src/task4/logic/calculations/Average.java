package task4.logic.calculations;


import task4.entity.Faculty;
import task4.entity.Student;
import task4.entity.StudentGroup;
import task4.entity.University;
import task4.logic.exceptions.NoFacultyException;
import task4.logic.exceptions.NoGroupException;
import task4.logic.exceptions.NoStudentException;
import task4.logic.exceptions.NoSubjectException;

import java.util.ArrayList;
import java.util.List;






public class  Average {

    public static double getStudentAverage(Student student) throws NoSubjectException {
        int gradeSum = 0;
        int numOfGrades= 0;
        List<Integer> grades = new ArrayList<>(student.getGrades());
        if (grades.size() != 0) {
            for (Integer grade : grades) {
                if (grade != null) {
                    gradeSum += grade;
                    numOfGrades++;
                }
            }
        } else {
            throw new NoSubjectException("The student has no subjects!");
        }
        return (double) gradeSum / numOfGrades;
    }


    public static double getSubjectFacultyGroupAverage(Faculty faculty, String studentGroup, String subject)
            throws NoStudentException, NoGroupException {
        int gradeSum = 0;
        int numOfStudentWithSubject = 0;

        List<StudentGroup> groupsOnFaculty = faculty.getStudentGroups();
        if (groupsOnFaculty.size() != 0) {
            StudentGroup desiredGroup = groupsOnFaculty.stream().
                    filter(p -> p.getName().equals(studentGroup)).
                    findAny().orElseThrow(IllegalArgumentException::new);
            if (desiredGroup.getStudentsInGroup().size() != 0) {
                for (Student student : desiredGroup.getStudentsInGroup()) {
                    int pos =student.getSubjects().indexOf(subject);
                    if (student.getSubjects().contains(subject) && student.getGrades().get(pos)!= null ) {
                        numOfStudentWithSubject++;
                        gradeSum += student.getGrades().get(pos);
                    }
                }
            } else {
                throw new NoStudentException("There are no students in the group ");
            }
        } else {
            throw new NoGroupException("There are no groups at the faculty ");
        }
        return (double) gradeSum / numOfStudentWithSubject;
    }

    public static double getAverageScoreByUniversity(University university, String subject)
            throws NoFacultyException, NoGroupException, NoStudentException {
        double sumOfAverageScoreByGroups = 0;
        int numOfGroups = 0;
        List<Faculty> universityFaculties = university.getFacultiesInUniversity();
        if (universityFaculties.size() != 0) {
            for (Faculty faculty : universityFaculties) {
                for (StudentGroup studentGroup : faculty.getStudentGroups()) {
                    sumOfAverageScoreByGroups += getSubjectFacultyGroupAverage(faculty, studentGroup.getName(), subject);
                    numOfGroups++;
                }
            }
        } else {
            throw new NoFacultyException("The university has no faculties :c");
        }
        return sumOfAverageScoreByGroups / numOfGroups;
    }














}
