package com.taobao.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class DBUtil {
    static String ip = "127.0.0.1";
    static int port = 3306;
    static String database = "taobao";
    static String encoding = "UTF-8";
    static String loginName = "root";
    static String password = "123456";
 
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
   
    
    //静态成员函数不用创建对象直接调用
    public static Connection getConnection() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", ip, port, database, encoding);
        return DriverManager.getConnection(url, loginName, password);
    }
     
    public static void main(String[] args) throws SQLException {
        System.out.println(getConnection());
         
    }
 
}