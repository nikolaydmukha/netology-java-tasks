package main.java.ru.cti.employees;

import java.util.Arrays;
import java.util.List;


public class EmployeeAttribute {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String education;
    private String position;
    private String department;

    public EmployeeAttribute (String input){
        List<String> dataRaw;
        dataRaw = Arrays.asList(input.split(" "));
        if (dataRaw.size() != 7)
            throw new IndexOutOfBoundsException();
        this.firstName = dataRaw.get(0);
        this.lastName = dataRaw.get(1);
        this.age = Integer.parseInt(dataRaw.get(2));
        this.gender = dataRaw.get(3);
        this.education = dataRaw.get(4);
        this.position = dataRaw.get(5);
        this.department = dataRaw.get(6);

    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public String getEducation() {
        return this.education;
    }

    public String getPosition() {
        return this.position;
    }

    public String getDepartment() {
        return this.department;
    }
}
