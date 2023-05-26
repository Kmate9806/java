package model;

import model.enums.Consumption;
import model.enums.MechanicalStatus;
import model.enums.OwnershipStatus;

public class Specification {
    private int cc;
    private Consumption consumption;
    private MechanicalStatus mechanicalStatus;
    private OwnershipStatus ownershipStatus;

    public Specification(int cc, Consumption consumption, MechanicalStatus mechanicalStatus, OwnershipStatus ownershipStatus) {
        this.cc = cc;
        this.consumption = consumption;
        this.mechanicalStatus = mechanicalStatus;
        this.ownershipStatus = ownershipStatus;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "cc=" + cc +
                ", consumption=" + consumption +
                ", mechanicalStatus=" + mechanicalStatus +
                ", ownershipStatus=" + ownershipStatus +
                '}'+ '\n';
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public Consumption getConsumption() {
        return consumption;
    }

    public void setConsumption(Consumption consumption) {
        this.consumption = consumption;
    }

    public MechanicalStatus getMechanicalStatus() {
        return mechanicalStatus;
    }

    public void setMechanicalStatus(MechanicalStatus mechanicalStatus) {
        this.mechanicalStatus = mechanicalStatus;
    }

    public OwnershipStatus getOwnershipStatus() {
        return ownershipStatus;
    }

    public void setOwnershipStatus(OwnershipStatus ownershipStatus) {
        this.ownershipStatus = ownershipStatus;
    }
}
