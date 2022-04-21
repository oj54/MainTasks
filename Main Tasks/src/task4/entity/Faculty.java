package task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private List<StudentGroup> studentGroups;

    public Faculty(String name) {
        this.name = name;
        studentGroups = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;

        Faculty faculty = (Faculty) o;

        return name.equals(faculty.name);
    }


    @Override
    public String toString() {
        return "Faculty name - " + name +
                ", student groups: \n" + studentGroups;
    }
}
