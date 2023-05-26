package persist.interfaces;


import model.Motor;
import persist.exceptions.MotorAlreadyExistException;
import persist.exceptions.MotorNotFoundException;

import java.util.List;

public interface MotorRepository {
    void addNewMotor(Motor motor) throws MotorAlreadyExistException;

    List<Motor> getAllMotors();

    Motor getMotor(int Chassis_number) throws MotorNotFoundException;

    void deleteMotor(int Chassis_number) throws MotorNotFoundException;

    public void updateMotorPrice(int Chassis_number, int price) throws MotorNotFoundException;

}
