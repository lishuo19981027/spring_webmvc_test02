package com.itheima.pojo;

import java.util.Arrays;
import java.util.Date;

public class User {

    private String username;
    private Integer age;
    private String[] hobbies;
    private Date birthday;
    private Address address;

    public String getUsername() {
        return username;
    }

    public Integer getAge() {
        return age;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Address getAddress() {
        return address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", hobbies=" + Arrays.toString(hobbies) +
                ", birthday=" + birthday +
                ", address=" + address +
                '}';
    }
}
