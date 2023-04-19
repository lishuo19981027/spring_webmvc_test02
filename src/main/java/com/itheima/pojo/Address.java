package com.itheima.pojo;

public class Address {
    private String city;
    private String area;

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
