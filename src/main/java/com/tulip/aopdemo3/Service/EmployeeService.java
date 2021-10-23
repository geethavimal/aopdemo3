package com.tulip.aopdemo3.Service;
import com.tulip.aopdemo3.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    public Employee createEmployee( String empId, String fname, String sname)
    {
        Employee emp = new Employee();
        emp.setEmpId(empId);
        emp.setFirstName(fname);
        emp.setSecondName(sname);
        return emp;
    }
    public void deleteEmployee(String empId)
    {

    }
}
