package com.shijie.interface_;

public class Interface03 {
    public static void main(String[] args) {

        MySqlDB mySqlDB = new MySqlDB();
        t(mySqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }

    public static void t(DBInterface db) {
        db.connect();
        db.close();
    }
}
