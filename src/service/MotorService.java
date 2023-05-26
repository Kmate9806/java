package service;

import model.Motor;

import persist.exceptions.MotorAlreadyExistException;
import persist.exceptions.MotorNotFoundException;
import persist.inmemorydb.InMemoryMotorDatabase;
import persist.interfaces.MotorRepository;

import java.util.List;

public class MotorService {
    private MotorRepository motorRepository;
    public MotorService(){
        motorRepository = new InMemoryMotorDatabase();

    }

    public int addMotor(Motor motor) throws MotorAlreadyExistException{
        motorRepository.addNewMotor(motor);
        return motor.getChassis_number();
    }
    public void deleteMotor(int Chassis_number) throws MotorNotFoundException{
        motorRepository.deleteMotor(Chassis_number);
    }


    public void updateMotorPrice(int Chassis_number, int price)throws MotorNotFoundException{
        motorRepository.updateMotorPrice(Chassis_number,price);
    }


    public Motor getMotorByChassis_number(int Chassis_number) throws MotorNotFoundException {
        return motorRepository.getMotor(Chassis_number);
    }

    public List<Motor> getAllMotors() {
        return motorRepository.getAllMotors();
    }
}
