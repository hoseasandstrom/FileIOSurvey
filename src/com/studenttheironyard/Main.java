package com.studenttheironyard;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

        static final String SAVE_FILE = "survey.json";
        static Scanner scanner = new Scanner(System.in);
        static Beer beer = new Beer();

    public static void main(String[] args) throws Exception {
        beer = loadSurvey(SAVE_FILE);
        if (beer == null) {
            beer = new Beer();
            System.out.println("The beer survey will begin again.");
        } else {
            System.out.println("Found saved file.");
            System.out.println("Start a new beverage survey instead [y/n]");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y")) {
                beer = new Beer();
            }
        }

        System.out.println("Welcome to the beverage survey.");


        if (beer.beer == null) beer.chooseBeer();
        if (beer.type == null) beer.chooseType();
        if (beer.brewer == null) beer.chooseBrewer();
        if (beer.company == null) beer.chooseCompany();
        if (beer.drunk == 0) beer.chooseQty();


        System.out.println("Thanks you for taking the beer survey!");

    }



            public static void saveSurvey(Beer beer, String filename) {
                JsonSerializer serializer = new JsonSerializer();
                String json = serializer.include("*").serialize(beer);

                File f = new File(filename);
                try {
                    FileWriter fw = new FileWriter(f);
                    fw.write(json);
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

            public static Beer loadSurvey(String filename) throws FileNotFoundException {
                File f = new File(filename);
                try {
                    Scanner scanner = new Scanner(f);
                    scanner.useDelimiter("\\Z");
                    String contents = scanner.next();
                    JsonParser parser = new JsonParser();
                    return parser.parse(contents, Beer.class);
                } catch (FileNotFoundException e) {
                }
                return null;
            }
}

