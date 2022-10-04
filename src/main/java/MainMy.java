import com.hw4.model.entity.*;
import com.hw4.model.repository.*;
import com.hw4.model.repository.impl.*;

import java.sql.Timestamp;
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

        CityRepository cityRepository =new CityRepositoryImpl();
        RouteRepository routeRepository = new RouteRepositoryImpl();
        CountryRepository countryRepository = new CountryRepositoryImpl();

//        Set<Route> routeSet1 = new HashSet<>();
//        routeSet1.add(routeRepository.findById(1));
//
//        City city2 = City.builder()
//                .nameCity("Roma")
//                .countryId(countryRepository.findById(2))
//                .routeSet(routeSet1)
//                .build();
//
//
//        cityRepository.save(city2);

        System.out.println(cityRepository.findAll());


    }
}
