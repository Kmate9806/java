package model;

import model.enums.Position;


import java.util.List;

public class Employee {
    private String name;
    private String address;
    private int telephone;
    private int idNumber;
    private List<WorkerData> workerData;

    public Employee(String name, String address, int telephone, int idNumber, List<WorkerData> workerData) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.idNumber = idNumber;
        this.workerData = workerData;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name +
                ", address='" + address +
                ", telephone=" + telephone +
                ", idNumber=" + idNumber +
                ", workerData=" + workerData +
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

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public List<WorkerData> getWorkerData() {
        return workerData;
    }

    public void setWorkerData(List<WorkerData> workerData) {
        this.workerData = workerData;
    }
}
