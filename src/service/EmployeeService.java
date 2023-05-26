package service;

import model.Employee;
import persist.exceptions.EmployeeAlreadyExistException;
import persist.exceptions.EmployeeNotFoundException;
import persist.inmemorydb.InMemoryEmployeeDatabase;
import persist.interfaces.EmployeeRepository;
import java.util.List;


public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(){
        employeeRepository =  new InMemoryEmployeeDatabase();
    }

    public Integer addEmployee(Employee employee) {
        if (employee.getName().length() < 3) {
            return -1;
        }
        while (true) {
            try {
                employeeRepository.addNewEmployee(employee);
                return employee.getIdNumber();
            } catch (EmployeeAlreadyExistException e) {
                employee.setIdNumber(employee.getIdNumber() + 1);
            }
        }
    }

    public void deleteEmployee(int idNumber) throws EmployeeNotFoundException {
        employeeRepository.deleteEmployee(idNumber);
    }


    public void updateTelephone(int idNumber, int telephone) throws EmployeeNotFoundException{
        employeeRepository.updateTelephone(idNumber,telephone);
    }


    public Employee getEmployee(String wokplace,int idNumber) throws EmployeeNotFoundException {
        return employeeRepository.getEmployee(wokplace,idNumber);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
