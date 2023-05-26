package persist.inmemorydb;

import model.Motor;
import persist.exceptions.MotorAlreadyExistException;
import persist.exceptions.MotorNotFoundException;
import persist.interfaces.MotorRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryMotorDatabase implements MotorRepository {

   private HashMap<Integer,Motor> motorDatabase;

   public InMemoryMotorDatabase(){
       motorDatabase = new HashMap<>();
   }
    @Override
    public void addNewMotor(Motor motorNew) throws MotorAlreadyExistException {
        if (!motorDatabase.containsKey(motorNew.getChassis_number())) {
            motorDatabase.put(motorNew.getChassis_number(),motorNew);
        } else {
            throw new MotorAlreadyExistException();
        }
    }

    @Override
    public List<Motor> getAllMotors() {
        List<Motor> list = new ArrayList<>();
        for (Map.Entry<Integer, Motor> entry : motorDatabase.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }

    @Override
    public Motor getMotor(int Chassis_number) throws MotorNotFoundException {
        if (!motorDatabase.containsKey(Chassis_number)){
            throw new MotorNotFoundException();
        }
        return motorDatabase.get(Chassis_number);
    }

    @Override
    public void deleteMotor(int Chassis_number) throws MotorNotFoundException {
        if (!motorDatabase.containsKey(Chassis_number)) {
            throw new MotorNotFoundException();
        }
        motorDatabase.remove(Chassis_number);
    }

   
    public void updateMotorPrice(int Chassis_number, int price) throws MotorNotFoundException {
        if (!motorDatabase.containsKey(Chassis_number)) {
            throw new MotorNotFoundException();
        }
        motorDatabase.get(Chassis_number).setPrice(price);
    }


}
