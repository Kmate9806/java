package model;

import model.enums.Consumption;
import model.enums.MechanicalStatus;
import model.enums.OwnershipStatus;

import java.util.List;

public class Motor {
    private String dealerName;
    private String manufacturer;
    private String type;
    private int price;
    private int chassis_number;
    private List<Specification> specifications;

    public Motor(String dealerName, String manufacturer, String type, int price, int chassis_number, List<Specification> specifications) {
        this.dealerName = dealerName;
        this.manufacturer = manufacturer;
        this.type = type;
        this.price = price;
        this.chassis_number = chassis_number;
        this.specifications = specifications;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "dealerName='" + dealerName +
                ", manufacturer='" + manufacturer +
                ", type='" + type +
                ", price=" + price +
                ", chassis_number=" + chassis_number +
                ", specifications=" + specifications + '\n'+
                '}'+ '\n';
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getChassis_number() {
        return chassis_number;
    }

    public void setChassis_number(int chassis_number) {
        this.chassis_number = chassis_number;
    }

    public List<Specification> getSpecifications() {
        return specifications;
    }

    public void setSpecifications(List<Specification> specifications) {
        this.specifications = specifications;
    }
}
