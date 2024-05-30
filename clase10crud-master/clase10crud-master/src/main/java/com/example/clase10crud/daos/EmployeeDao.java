package com.example.clase10crud.daos;


import com.example.clase10crud.beans.Employees;
import com.example.clase10crud.beans.Job;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeDao {

    public ArrayList<Employees> listar(){

        ArrayList<Employees> lista = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "root";

        String sql = "select * from employees";


        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Employees employees=new Employees();

                employees.setEmp_no(rs.getInt(1));
                employees.setBirth_date(rs.getDate(2));
                employees.setFirst_name(rs.getString(3));
                employees.setLast_name(rs.getString(4));
                employees.setGender(rs.getString(5));
                employees.setHire_date(rs.getDate(6));

                lista.add(employees);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return lista;
    }
}

    /*public int getMaxSalary(){

        int salario = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/hr";
        String username = "root";
        String password = "root";

        String sql = "select max(max_salary) from jobs";


        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                salario = rs.getInt(1);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return salario;
    }*/

    /*ublic void crear(String jobId, String jobTitle, int minSalary, int maxSalary){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "root";

        String sql = "insert into jobs (job_id, job_title, min_salary,max_salary) values (?,?,?,?)";

        try(Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement pstmt = connection.prepareStatement(sql)){

            pstmt.setString(1,jobId);
            pstmt.setString(2,jobTitle);
            pstmt.setInt(3,minSalary);
            pstmt.setInt(4,maxSalary);

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }*/

    /*public Employees buscarPorEMP(int emp_no){

        Employees employees = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/employees";
        String username = "root";
        String password = "root";

        String sql = "select * from employees where emp_no = ?";


        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1,emp_no);

            try(ResultSet rs = pstmt.executeQuery()){
                while (rs.next()) {
                    employees = new Employees();
                    employees.setEmp_no(rs.getInt(1));
                    employees.setBirth_date(rs.getDate(2));
                    employees.setFirst_name(rs.getString(3));
                    employees.setLast_name(rs.getString(4));
                    employees.setGender(rs.getBoolean(5));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }*/

    /*public void actualizar(Employees employees){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/hr";
        String username = "root";
        String password = "root";

        String sql = "update jobs set job_title = ?, min_salary = ?, max_salary = ? where job_id = ?";

        try(Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement pstmt = connection.prepareStatement(sql)){

            pstmt.setString(1,job.getJobTitle());
            pstmt.setInt(2,job.getMinSalary());
            pstmt.setInt(3,job.getMaxSalary());
            pstmt.setString(4,job.getJobId());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void borrar(String jobId) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/hr";
        String username = "root";
        String password = "root";

        String sql = "delete from jobs where job_id = ?";

        try(Connection connection = DriverManager.getConnection(url,username,password);
            PreparedStatement pstmt = connection.prepareStatement(sql)){

            pstmt.setString(1,jobId);
            pstmt.executeUpdate();

        }
    }*/

    /*public ArrayList<Job> buscarIdOrTitle(String name){

        ArrayList<Job> lista = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/hr";
        String username = "root";
        String password = "root";

        String sql = "select * from jobs where job_id = ? or lower(job_title) like lower(?);";


        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1,name);
            pstmt.setString(2,"%" + name + "%");

            try(ResultSet rs = pstmt.executeQuery()){
                while (rs.next()) {
                    Job job = new Job();
                    job.setJobId(rs.getString(1));
                    job.setJobTitle(rs.getString(2));
                    job.setMinSalary(rs.getInt(3));
                    job.setMaxSalary(rs.getInt(4));

                    lista.add(job);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return lista;
    }
}*/

