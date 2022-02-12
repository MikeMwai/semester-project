package com.main;

import com.main.db.Db;
import com.main.gui.Gui;
//import com.main.intf.*;
import com.main.Console;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.SQLException;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger();



    public static void main(String[] args) {

       // Console.main(args);
        try {
            Db db = new Db();

        } catch (SQLException e){
            LOGGER.error(e);
            System.exit(1);
        }

    }
}
