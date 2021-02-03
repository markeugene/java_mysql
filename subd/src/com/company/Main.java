package com.company;


import java.io.IOException;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static int temp;

    public static void menu(changeWeather ch) throws SQLException {
        System.out.println("Options:\n1)Date when it snowed and temperature was lower than chosen.\n2)Weather in region\n");
        Scanner scanner = new Scanner(System.in);
        temp = scanner.nextInt();
        switch (temp) {
            case 1:
                System.out.println("Enter temperature: ");
                int tm;
                tm = scanner.nextInt();
                ch.whichTemp(tm);
                break;
            case 2:
                System.out.println("Enter region");
                String str;
                str= scanner.next();
                ch.weatherInRegion(str);break;


        }
    }
        public static void main(String[] args) throws SQLException{
            Scanner scanner = new Scanner(System.in);
            Weather w1;
            changeWeather change = new changeWeather();
            String reg;
            String dt;
            int t;
            int fl;
            boolean q = true;
            String choice;

            while (q) {

                System.out.println("Vvedite region: ");
                reg = scanner.nextLine();

                System.out.println("\nVvedite daty: ");
                dt = scanner.nextLine();

                System.out.println("\nVvedite temp: ");
                t = scanner.nextInt();
                System.out.println("\nVvedite osadki: ");
                fl = scanner.nextInt();

                w1 = new Weather();
                w1.setDate(dt);
                w1.setFallout(fl);
                w1.setRegion(reg);
                w1.setTemp(t);

                change.addToWeather(w1);
                System.out.println("Prodoljit? Yes/No");
                choice = scanner.next();

                if (choice.toLowerCase() == "yes") {

                } else if (choice.toLowerCase() == "no") {
                    q = false;
                } else {
                    System.out.println("Try again!");
                }
                menu(change);

            }


        }
    }

