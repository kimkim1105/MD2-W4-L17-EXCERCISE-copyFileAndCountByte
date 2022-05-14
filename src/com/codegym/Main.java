package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Student> list = new ArrayList<>();
//        list.add(new Student(1,"ha"));
//        list.add(new Student(2,"a"));
//        list.add(new Student(3,"k"));
        String path1 = "D:\\java\\GIT\\MODULE 2\\W4\\L17\\copyFileAndCountByte\\source.txt";
        String path2 = "D:\\java\\GIT\\MODULE 2\\W4\\L17\\copyFileAndCountByte\\target.txt";
//        ConfigReadAndWrite.write(path1,list);
        ConfigReadAndWrite.read(path1);
        ConfigReadAndWrite.write(path2,ConfigReadAndWrite.read(path1));
        System.out.println(ConfigReadAndWrite.cnt);
        System.out.println(ConfigReadAndWrite.read(path1));
    }
}
