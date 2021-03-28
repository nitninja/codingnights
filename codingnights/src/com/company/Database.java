package com.company;

public class Database {
    private String name;
    private static Database instance;

    public static Database getInstance(String name) {
        if (null==instance){
            instance =new Database(name);
        }else{
        return instance;
    }

    public static void setInstance(Database instance) {
        Database.instance = instance;
    }

    private Database(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

        public void setName(String name) {
            this.name = name;
        }
}}
