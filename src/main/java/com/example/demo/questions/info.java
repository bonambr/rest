package com.example.demo.questions;

public class info {
    private Integer age;
    private Boolean student;
    private Long income;

    public info() {
        this.student = false;
    }

    public info(Integer age, Boolean student, Long income) {
        this.age = age;
        this.student = student;
        this.income = income;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getStudent() {
        return student;
    }

    public void setStudent(Boolean student) {
        this.student = student;
    }

    public Long getIncome() {
        return income;
    }

    public void setIncome(Long income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "info{" +
                "age=" + age +
                ", info=" + student +
                ", income='" + income + '\'' +
                '}';
    }
}
