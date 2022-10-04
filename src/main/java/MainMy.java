import com.hw4.model.entity.*;
import com.hw4.model.repository.*;
import com.hw4.model.repository.impl.*;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

public class MainMy {
    public static void main(String[] args) {

        AirCompanyRepository airCompanyRepository =new AirCompanyRepositoryImpl();

        AirplaneRepository airplaneRepository = new AirplaneRepositoryImpl();

        RolesRepositoryImpl roles =new RolesRepositoryImpl();

        UserRepository userRepository = new UserRepositoryImpl();

        PassportDataRepositoyImpl passportDataRepositoy = new PassportDataRepositoyImpl();

        CityRepository cityRepository =new CityRepositoryImpl();

        RouteRepository routeRepository = new RouteRepositoryImpl();

        TicketRepository ticketRepository = new TicketRepositoryImpl();

        System.out.println(ticketRepository.findById(1));


    }
}
