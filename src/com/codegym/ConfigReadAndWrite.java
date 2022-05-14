package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWrite<T> {
    static int cnt;
    public static String read(String path){
        String integerList = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            integerList = (String) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }catch (Exception e){
            System.out.println("khong tim thay file");
        }
        return integerList;
    }
    public static void write(String path,String integerList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(integerList);
            objectOutputStream.close();
            fileOutputStream.close();
        }catch (Exception e){
            System.out.println("khong tim thay file hoac co loi");
        }
    }
}
