package org.homework.stream.Homeworks.students;

public class Students {

    private String name;
    private String facultet;
    private int course;

    private int age;

    public Students(String name, String facultet, int course, int age) {
        this.name = name;
        this.facultet = facultet;
        this.course = course;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacultet() {
        return facultet;
    }

    public void setFacultet(String facultet) {
        this.facultet = facultet;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", facultet='" + facultet + '\'' +
                ", course=" + course +
                ", age=" + age +
                '}';
    }
}

