package task4.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private String name;
    private List<Student> studentsInGroup;

    public StudentGroup(String name) {
        this.name = name;
        studentsInGroup = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentsInGroup() {
        return studentsInGroup;
    }

    public void setStudentsInGroup(List<Student> studentsInGroup) {
        this.studentsInGroup = studentsInGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentGroup)) return false;

        StudentGroup that = (StudentGroup) o;

        return name.equals(that.name);
    }



    @Override
    public String toString() {
        return "Student group name - " + name +
                ", studentsInGroup: \n" + studentsInGroup;
    }
}
