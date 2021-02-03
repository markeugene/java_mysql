package com.company;

import java.sql.*;

public class changeWeather {
    private Connection cn;
    private String SQL_ADD="INSERT INTO WEATHER(Region,Daate,Temp,Fallout) VALUES(?,?,?,?);";
    private String SQL_UPDATE="UPDATE WEATHER SET REGION=?,Daate=?,TEMP=?,Fallout=? WHERE TEMP=2;";
    private PreparedStatement pr=null;
    private ResultSet rs;
    private Statement st;


    public void addToWeather(Weather obj) throws SQLException{
        cn=ConnectorDB.getConnection();
        if(cn==null){
            System.out.println("NET SVYAZI S DB");
        }
        pr=cn.prepareStatement(SQL_ADD);
        pr.setString(1,obj.getRegion());
        pr.setString(2,obj.getDate());
        pr.setInt(3,obj.getTemp());
        pr.setInt(4,obj.getFallout());
        pr.execute();
        cn.close();
    }
    public void updateWeather(Weather obj)throws  SQLException{

      cn=ConnectorDB.getConnection();
        if(cn==null){
            System.out.println("NET SVYAZI S DB");
        }
        pr=cn.prepareStatement(SQL_UPDATE);
        pr.setString(1,obj.getRegion());
        pr.setString(2,obj.getDate());
        pr.setInt(3,obj.getTemp());
        pr.setInt(4,obj.getFallout());
        pr.executeUpdate();
        cn.close();
    }
    public void whichTemp(int temp) throws SQLException {
        cn=ConnectorDB.getConnection();
        if(cn==null){
            System.out.println("NET SVYAZI S DB");}

        String findout = "Select *from weather where temp<" + temp;
        st = cn.createStatement();
        rs= st.executeQuery(findout);
        while(rs.next()){
            String rg=rs.getString(2);
            int fl=rs.getInt(5);
            System.out.println(rg +" "+ fl);
        }
        cn.close();
    }
    public void weatherInRegion(String region) throws SQLException {
        cn=ConnectorDB.getConnection();
        if(cn==null){
            System.out.println("NET SVYAZI S DB");
        }
        String findWeather="Select *from weather where Region='"+region+"'";
        st = cn.createStatement();
        rs= st.executeQuery(findWeather);
        while(rs.next()){
           int temp=rs.getInt(4);
           System.out.println(region+" "+temp);
        }
        cn.close();

    }

}
