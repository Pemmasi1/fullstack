package com.siva.fullstack.studentsystem.pojo;

public class StudentDto {
    private String name;

    private String address;

    private String branch;

    @Override
    public String toString() {
        return "StudentDto{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", branch='" + branch + '\'' +
                ", isWorking='" + isWorking + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getIsWorking() {
        return isWorking;
    }

    public void setIsWorking(String isWorking) {
        this.isWorking = isWorking;
    }

    private String isWorking;
}
