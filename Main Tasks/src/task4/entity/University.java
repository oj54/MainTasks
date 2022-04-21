package task4.entity;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<Faculty> facultiesInUniversity;

    public University(String name) {
        this.name = name;
        facultiesInUniversity = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Faculty> getFacultiesInUniversity() {
        return facultiesInUniversity;
    }

    public void setFacultiesInUniversity(List<Faculty> facultiesInUniversity) {
        this.facultiesInUniversity = facultiesInUniversity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;

        University that = (University) o;

        return name.equals(that.name);
    }


    @Override
    public String toString() {
        return "University name - " + name + "\n" +
                "Faculties in the university: \n" + facultiesInUniversity;
    }
}
