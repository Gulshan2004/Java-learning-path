package com.gulshan.SPRINGJDBCEx.repo;

import com.gulshan.SPRINGJDBCEx.model.Student;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(@NonNull Student s) {
        String sql ="insert into student (rollno ,name , marks) values (?,?,?)";
        int rows = jdbc.update(sql,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(rows + " effected");
    }

    public List<Student> findAll() {
 
        String sql = "select * from student";
//        RowMapper<Student> mapper = new RowMapper<Student>(){
//            @Override
//            public Student mapRow(ResultSet rs, int rowNum) throws SQLException{
//                Student s = new Student();
//                s.setRollNo(rs.getInt("rollno"));
//                s.setName(rs.getString("Name"));
//                s.setMarks(rs.getInt("Marks"));
//
//                return s;
//            }

        //USING LAMBDA EXPRESSION
//        RowMapper<Student> mapper =(rs ,  rollNum) -> {
//            Student s = new Student();
//                s.setRollNo(rs.getInt("rollno"));
//                s.setName(rs.getString("Name"));
//                s.setMarks(rs.getInt("Marks"));
//
//                return s;

        //OR

        return jdbc.query(sql,(rs, rollNum) ->{
            Student s = new Student();
                s.setRollNo(rs.getInt("rollno"));
                s.setName(rs.getString("Name"));
                s.setMarks(rs.getInt("Marks"));

                return s;
              });

        };
//        return jdbc.query(sql,mapper); it will return a list of students

    }

