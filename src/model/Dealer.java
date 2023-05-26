package model;

import java.util.List;

public class Dealer {
    private String name;
    private String address;

    private int taxNumber;

    private List<Employee> employee;
    private List<Motor> motor;

    public Dealer(String name, String address, int taxNumber, List<Employee> employee, List<Motor> motor) {
        this.name = name;
        this.address = address;
        this.taxNumber = taxNumber;
        this.employee = employee;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "name='" + name +
                ", address='" + address +
                ", taxNumber=" + taxNumber +
                ", employee=" + employee +
                ", motor=" + motor +
                '}'+ '\n' ;
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



    public int getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public List<Motor> getMotor() {
        return motor;
    }

    public void setMotor(List<Motor> motor) {
        this.motor = motor;
    }
}
