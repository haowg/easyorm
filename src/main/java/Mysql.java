package main.java;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Mysql {
    String dba;
    Boolean isMaster;
    Connection conn;
    Statement stat;

    public Mysql(String dba, Boolean isMaster){
        //init method
        this.dba = dba;
        this.isMaster = isMaster;
        this.Connect(dba);
    }
    private void Connect(String dba){
        // todo
        this.conn = null;
        this.stat = null;
    }
    private void Close(String dba){
        // todo
    }
}
