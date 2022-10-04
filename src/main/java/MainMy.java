import com.hw4.model.entity.*;
import com.hw4.model.repository.*;
import com.hw4.model.repository.impl.*;

import java.util.HashSet;
import java.util.Set;

public class MainMy {
    public static void main(String[] args) {

        AirCompanyRepository airCompanyRepository =new AirCompanyRepositoryImpl();

        RolesRepositoryImpl roles =new RolesRepositoryImpl();

        UserRepository userRepository = new UserRepositoryImpl();

        PassportDataRepositoyImpl passportDataRepositoy = new PassportDataRepositoyImpl();

        DepartmentsRepository departmentsRepository = new DepartmentsRepositoryImpl();

        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

        EmployeeDepartments employeeDepartments = new EmployeeDepartments();

        EmpolyeeDeptRepository empolyeeDeptRepository = new EmployeeDeptImpl();
        



    }
}
