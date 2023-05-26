package persist.interfaces;

import model.Employee;


import model.enums.Position;
import persist.exceptions.EmployeeAlreadyExistException;
import persist.exceptions.EmployeeNotFoundException;


import java.util.List;

public interface EmployeeRepository {

        void addNewEmployee(Employee employee) throws EmployeeAlreadyExistException;
        Employee getEmployee(String workpalce,int idNumber) throws EmployeeNotFoundException;
        List<Employee> getAllEmployees();

        public void updateTelephone(int idNumber, int telephone) throws EmployeeNotFoundException;


        void deleteEmployee(int idNumber) throws EmployeeNotFoundException;
}
