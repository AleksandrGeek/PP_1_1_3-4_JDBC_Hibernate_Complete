package jm.task.core.jdbc;

//import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserServiceImpl userService = new UserServiceImpl();
//        userService.saveUser("Ivan", "Ivanov", (byte) 30);
//        userService.saveUser("Boris", "Borisov", (byte) 31);
//        userService.saveUser("Claud", "Claudis", (byte) 32);
//        userService.saveUser("Daniel", "Danielov", (byte) 33);
//        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
