package com.musa.education;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String separator = File.separator; //separator выступает в кач-ве разделителя на любой ОС(сам понимает направление слеша)
        String path = separator + "C:" + separator + "Users" + separator + "musa1" + separator + "Desktop" + separator +
                "Новая папка" + separator + "text.txt"; //заносим расположение файла в строку, чтобы обращаться к ней, а не писать каждый раз по новой
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
