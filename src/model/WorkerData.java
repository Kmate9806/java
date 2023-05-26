package model;

import model.enums.Position;

public class WorkerData {
    private String workplace;
    private Position position;
    private int salary;

    private int idNumber;

    public WorkerData(String workplace, Position position, int salary, int idNumber) {
        this.workplace = workplace;
        this.position = position;
        this.salary = salary;
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "WorkerData{" +
                "workplace='" + workplace +
                ", position=" + position +
                ", salary=" + salary +
                ", idNumber=" + idNumber + '\n'+
                '}'+ '\n';
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
