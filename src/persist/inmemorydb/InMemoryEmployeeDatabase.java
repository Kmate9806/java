package persist.inmemorydb;

import model.Employee;
import model.WorkerData;
import persist.exceptions.EmployeeAlreadyExistException;
import persist.exceptions.EmployeeNotFoundException;
import persist.interfaces.EmployeeRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryEmployeeDatabase implements EmployeeRepository {
    private HashMap<Integer, Employee> employeeDatabase;
    private HashMap<Integer, WorkerData> workerDatabase;
    public InMemoryEmployeeDatabase(){
        employeeDatabase = new HashMap<>();
    }
    @Override
    public void addNewEmployee(Employee employeeNew) throws EmployeeAlreadyExistException {
        if (!employeeDatabase.containsKey(employeeNew.getIdNumber())) {
            employeeDatabase.put(employeeNew.getIdNumber(),employeeNew);
        } else {
            throw new EmployeeAlreadyExistException();
        }
    }
    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        for (Map.Entry<Integer, Employee> entry : employeeDatabase.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }
    @Override
    public Employee getEmployee(String workplace,int idNumber) throws EmployeeNotFoundException {
        if (!employeeDatabase.containsKey(idNumber)){
            throw new EmployeeNotFoundException();
        }
        return employeeDatabase.get(idNumber);
    }
    @Override
    public void updateTelephone(int idNumber, int telephone) throws EmployeeNotFoundException {
        if (!employeeDatabase.containsKey(idNumber)) {
            throw new EmployeeNotFoundException();
        }else
       employeeDatabase.get(idNumber).setTelephone(telephone);
    }



    @Override
    public void deleteEmployee(int idNumber) throws EmployeeNotFoundException {
        if (!employeeDatabase.containsKey(idNumber)) {
            throw new EmployeeNotFoundException();
        }
        employeeDatabase.remove(idNumber);
    }
}
