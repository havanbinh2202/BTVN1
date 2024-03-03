package com.tn;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
        public String name;

        public String sex;

        public  String address;

        public LocalDate datebirthday;

    // Constructors
    public Person() {

    }
    public Person(String name, String sex, String address, LocalDate datebirthday) {
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.datebirthday = datebirthday;
    }

    // Getter, Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDatebirthday() {
        return datebirthday;
    }

    public void setDatebirthday(LocalDate datebirthday) {
        this.datebirthday = datebirthday;
    }

    public void InputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();

        System.out.println("Nhập giới tinh: ");
        this.sex = sc.nextLine();

        System.out.println("Nhập ngày sinh: ");
        String dateString = sc.nextLine();
        this.datebirthday = LocalDate.parse(dateString);

        System.out.println("Nhập địa chỉ: ");
        this.address = sc.nextLine();
    }

    public void ShowInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Sex: " + this.sex);
        System.out.println("Birth Date: " + this.datebirthday);
        System.out.println("Address: " + this.address);
    }

}


