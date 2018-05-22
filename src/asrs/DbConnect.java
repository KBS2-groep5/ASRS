/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asrs;

import java.sql.*;

/**
 *
 * @author chris
 */
public class DbConnect {
    private Connection con;
    private ResultSet rs;
    
    public DbConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/kbs2a?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            con = DriverManager.getConnection(url,"root","");
            
        }catch(Exception ex){
            System.out.println("Error: " + ex);
        }
    }
    
    public int[] getData(int artikelnr){
        int[] data = new int[]{artikelnr,0,0};
        
        try{    
            PreparedStatement stmt = con.prepareStatement("select * from packages where artikelnr = ?");
            stmt.setInt(1, artikelnr);
            rs = stmt.executeQuery();
            
            //System.out.println("getting data");
            
            while(rs.next()){
                data[1] = rs.getInt("x");
                data[2] = rs.getInt("y");
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        return data;
    }
        
    public String getName(int artikelnr){
        String name = "";
        
        try{    
            PreparedStatement stmt = con.prepareStatement("select * from packages where artikelnr = ?");
            stmt.setInt(1, artikelnr);
            rs = stmt.executeQuery();
            
            //System.out.println("getting data");
            
            while(rs.next()){
                name = rs.getString("productName");
            }
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        return name;
    }
    
}
