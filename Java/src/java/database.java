/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editorimport

/**
 *
 * @author SATVIR RANA
 */
import java.sql.*;
public class database {
    public static void main(String agrs[]){
        Connection con=null;
    
            try{
                String Query="select *from student1 ";
               // String Query1="insert into student values(1,'ajay','1457956655','ajay@gamil,com')";
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("driver lodded");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","");
                System.out.println("Connection stablish");
                Statement st= con.createStatement();
                //int count = st.executeUpdate();
                System.out.println("updated");
                
                ResultSet rs =st.executeQuery(Query);
                while(rs.next()){
                String userdata=rs.getString(1) +" : "+ rs.getString(2)+" :"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5)+":"+rs.getInt(6);
                System.out.println(userdata);
                } 
                st.close();
                con.close();
            
            }catch(Exception e){
                System.out.println(e+"error");
    }
    }
}