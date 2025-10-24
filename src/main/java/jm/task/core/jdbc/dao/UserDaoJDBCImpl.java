package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.util.Util;
import jm.task.core.jdbc.model.User;
import java.util.ArrayList;
import java.util.List;

//public class UserDaoJDBCImpl implements UserDao {
//
//    public UserDaoJDBCImpl() {}
//
//    public void createUsersTable() {
//
//        String sql = "CREATE TABLE IF NOT EXISTS users (" +
//                "id BIGINT PRIMARY KEY AUTO_INCREMENT, " +
//                "name VARCHAR(50), " +
//                "lastName VARCHAR(50), " +
//                "age TINYINT)";
//
//        try (Connection connection = Util.getInstance().getConnection()) {
//            connection.setAutoCommit(false);
//            try (Statement statement = connection.createStatement()) {
//                statement.execute(sql);
//                connection.commit();
//                System.out.println("Таблица 'users' создана успешно");
//            } catch (SQLException e) {
//                connection.rollback();
//                System.out.println("Ошибка создания таблицы: " + e.getMessage());
//                throw e;
//            }
//        } catch (SQLException e) {
//            System.out.println("Ошибка подключения: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void dropUsersTable() {
//        String sql = "DROP TABLE IF EXISTS users";
//
//        try (Connection connection = Util.getInstance().getConnection()) {
//            connection.setAutoCommit(false);
//            try (Statement statement = connection.createStatement()) {
//                statement.execute(sql);
//                connection.commit();
//                System.out.println("Таблица 'users' удалена успешно");
//            } catch (SQLException e) {
//                connection.rollback();
//                System.out.println("Ошибка удаления таблицы: " + e.getMessage());
//                throw e;
//            }
//        } catch (SQLException e) {
//            System.out.println("Ошибка подключения: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void saveUser(String name, String lastName, byte age) {
//
//
//        String sql = "INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)";
//
//        try (Connection connection = Util.getInstance().getConnection()) {
//            connection.setAutoCommit(false);
//            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//                preparedStatement.setString(1, name);
//                preparedStatement.setString(2, lastName);
//                preparedStatement.setByte(3, age);
//                preparedStatement.executeUpdate();
//                connection.commit();
//                System.out.println("Пользователь " + name + " сохранен успешно");
//            } catch (SQLException e) {
//                connection.rollback();
//                System.out.println("Ошибка сохранения пользователя: " + e.getMessage());
//                throw e;
//            }
//        } catch (SQLException e) {
//            System.out.println("Ошибка подключения: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public void removeUserById(long id) {
//        String sql = "DELETE FROM users WHERE id = ?";
//
//        try (Connection connection = Util.getInstance().getConnection()) {
//            connection.setAutoCommit(false);
//            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//                preparedStatement.setLong(1, id);
//                preparedStatement.executeUpdate();
//                connection.commit();
//                System.out.println("Пользователь с id " + id + " удален успешно");
//            } catch (SQLException e) {
//                connection.rollback();
//                System.out.println("Ошибка удаления пользователя: " + e.getMessage());
//                throw e;
//            }
//        } catch (SQLException e) {
//            System.out.println("Ошибка подключения: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        List<User> users = new ArrayList<>();
//        String sql = "SELECT * FROM users";
//
//
//        try (Connection connection = Util.getInstance().getConnection();
//             Statement statement = connection.createStatement();
//             ResultSet resultSet = statement.executeQuery(sql)) {
//
//            while (resultSet.next()) {
//                User user = new User();
//                user.setId(resultSet.getLong("id"));
//                user.setName(resultSet.getString("name"));
//                user.setLastName(resultSet.getString("lastName"));
//                user.setAge(resultSet.getByte("age"));
//                users.add(user);
//            }
//            System.out.println("Получено пользователей: " + users.size());
//
//        } catch (SQLException e) {
//            System.out.println("Ошибка получения пользователей: " + e.getMessage());
//            e.printStackTrace();
//        }
//        return users;
//    }
//
//    @Override
//    public void cleanUsersTable() {
//        String sql = "TRUNCATE TABLE users";
//
//        try (Connection connection = Util.getInstance().getConnection()) {
//            connection.setAutoCommit(false);
//            try (Statement statement = connection.createStatement()) {
//                statement.execute(sql);
//                connection.commit();
//                System.out.println("Таблица 'users' очищена успешно"); // ✅ Добавлено сообщение
//            } catch (SQLException e) {
//                connection.rollback();
//                System.out.println("Ошибка очистки таблицы: " + e.getMessage());
//                throw e;
//            }
//        } catch (SQLException e) {
//            System.out.println("Ошибка подключения: " + e.getMessage());
//            e.printStackTrace();
//        }
//    }
//}