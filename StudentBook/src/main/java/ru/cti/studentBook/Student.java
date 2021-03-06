package main.java.ru.cti.studentBook;

import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private String studentId;


    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name) &&
                group.equals(student.group) &&
                studentId.equals(student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, studentId);
    }
}
