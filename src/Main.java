import model.*;
import model.enums.Consumption;
import model.enums.MechanicalStatus;
import model.enums.OwnershipStatus;
import model.enums.Position;
import persist.exceptions.*;
import service.DealerService;
import service.EmployeeService;
import service.MotorService;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) throws DealerNotFoundException, DealerAlreadyExistException, EmployeeNotFoundException, EmployeeAlreadyExistException, MotorNotFoundException,MotorAlreadyExistException {


        DealerService dealerService = new DealerService();
        EmployeeService employeeService = new EmployeeService();
        MotorService motorService = new MotorService();


        //Dolgozok listaja
        List<Employee> employeeList = new ArrayList<>();

        //Dolgozo munkahelyi adatai
        List<WorkerData> workerDataList = new ArrayList<>();
        workerDataList.add(
                new WorkerData("TotalLegit kereskedes",Position.SELLER,
                        400000,1));
        workerDataList.add(
                new WorkerData("TotalLegit kereskedes",Position.OWNER,
                        800000,2));
        workerDataList.add(
                new WorkerData("Motor kereskedes",Position.ADMINISTRATOR,
                        300000,3));

        //Motorok listaja
        List<Motor> motorList = new ArrayList<>();

        //Motor specifikacio lista
        List<Specification> specificationList = new ArrayList<>();
        specificationList.add(
                new Specification(600, Consumption.LOW, MechanicalStatus.NEW,
                        OwnershipStatus.INLOT));
        specificationList.add(
                new Specification(1200, Consumption.MEDIUM, MechanicalStatus.NEW,
                        OwnershipStatus.INLOT));
        specificationList.add(
                new Specification(1000, Consumption.HIGH, MechanicalStatus.NEW,
                        OwnershipStatus.SOLD));

        //Dealer metodusok
        Dealer dealer1 = new Dealer("TotalLegit kereskedes","Valamilyen utca 1",1111,employeeList,motorList);
        Dealer dealer2= new Dealer("Masik kereskedes","Masik utca 2",2222,employeeList,motorList);
        Dealer dealer3 = new Dealer("Rossz kereskedes","Rossz utca 3",3333,employeeList,motorList);
        dealerService.addDealer(dealer1);
        dealerService.addDealer(dealer2);
        dealerService.addDealer(dealer3);
        dealerService.updateDealerName(3333,"Jo Kereskedes");
        dealerService.deleteDealer(2222);
        //Employee metodusok
        Employee employee1 = new Employee("Nagy Lajos","Kitalalt utca 1",111111,1,workerDataList);
        Employee employee2 = new Employee("Kovacs Sandor","Random utca 2",222222,2,workerDataList);
        Employee employee3 = new Employee("Tarka Bab","Masik utca 25",333333,3,workerDataList);
        employeeService.addEmployee(employee1);
        employeeService.addEmployee(employee2);
        employeeService.addEmployee(employee3);
        employeeService.updateTelephone(1,123);
        employeeService.deleteEmployee(3);
        //Motor metodusok
        Motor motor1 = new Motor("TotalLegit kereskedes","Ducati","monster",100000,1,specificationList);
        Motor motor2 = new Motor("TotalLegit kereskedes","Ducati","monster",200000,2,specificationList);
        Motor motor3 = new Motor("Rossz kereskedes","Ducati","monster",300000,3,specificationList);
        motorService.addMotor(motor1);
        motorService.addMotor(motor2);
        motorService.addMotor(motor3);
        motorService.updateMotorPrice(1,4000000);
        motorService.deleteMotor(2);



        //kiiratas
        System.out.println("--------Dealer dolgok--------");
        System.out.println(dealerService.getAllDealers());
        System.out.println(dealerService.getDealerByTaxNumber(1111));
        System.out.println("---------Vege-------");

        System.out.println("--------Employee dolgok--------");
        System.out.println(employeeService.getAllEmployees());
        System.out.println(employeeService.getEmployee("TotalLegit kereskedes",1));
        System.out.println("---------Vege-------");

        System.out.println("--------Motor dolgok--------");
        System.out.println(motorService.getAllMotors());
        System.out.println(motorService.getMotorByChassis_number(1));
        System.out.println("---------Vege-------");




    }
}