package com.academy.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlConnect {

    private static final String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    private static final String LOGIN = "root";
    private static final String PASS = "Aa+2541850";
    private static String query;

    private SqlConnect() {
    }

    public static void createTable() {

        query = "CREATE TABLE company (id BIGINT NOT NULL AUTO_INCREMENT, Name VARCHAR(255) NOT NULL," +
                " FullName VARCHAR(255) NOT NULL, Address VARCHAR(255), PRIMARY KEY (id))";
        execute();

        query = "CREATE TABLE bus (id BIGINT NOT NULL AUTO_INCREMENT, Model VARCHAR(255) NOT NULL, CompanyID BIGINT," +
                " PRIMARY KEY (id), FOREIGN KEY (CompanyID) REFERENCES company(id))";
        execute();
    }

    public static void truncateTable() {
        query = "TRUNCATE TABLE bus";
        execute();
        query = "TRUNCATE TABLE company";
        execute();
    }

    public static void dropTable() {
        query = "DROP TABLE bus";
        execute();
        query = "DROP TABLE company";
        execute();
    }

    public static void regDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void addCompany(String name, String fullName, String address) {
        query = "INSERT INTO company(Name, FullName, Address) VALUES (?, ?, ?)";

        try (Connection con = DriverManager.getConnection(URL, LOGIN, PASS);
             PreparedStatement st = con.prepareStatement(query);) {
            st.setString(1, name);
            st.setString(2, fullName);
            st.setString(3, address);
            st.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public static void addBus(String model, int company) {
        query = "INSERT INTO bus(Model, CompanyID) VALUES (?, ?)";

        try (Connection con = DriverManager.getConnection(URL, LOGIN, PASS);
             PreparedStatement st = con.prepareStatement(query);) {
            st.setString(1, model);
            st.setInt(2, company);
            st.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    private static void execute() {
        try (Connection con = DriverManager.getConnection(URL, LOGIN, PASS);
             PreparedStatement st = con.prepareStatement(query);) {
            st.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
