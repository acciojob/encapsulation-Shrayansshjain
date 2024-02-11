package com.driver;

public class Main {

    public static void main(String[] args){
        RWOnly obj = new RWOnly();
        String val = "Shrayanssh";

        // obj.name = val;            //name has only private access and can be accessed in RWOnly
        //System.out.print(obj.name);

        obj.setName(val);
        obj.getName();
    }
}