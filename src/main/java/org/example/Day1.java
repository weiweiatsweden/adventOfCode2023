package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Day1 {
    public void part1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("./day1Input.txt"));
        String line = bufferedReader.readLine();
        int firstDigit = 0;
        int lastDigit = 0;
        int calibrationNumber = 0;
        while(line != null){
            System.out.println(line);
            ArrayList<Character> lineArray = new ArrayList<>();
            for (char i: line.toCharArray()
                 ) { lineArray.add(i);
            }
            for (Character c: lineArray
                 ) {
                if(Character.isDigit(c)){
                    firstDigit = Integer.parseInt(c.toString());
                    System.out.println(firstDigit);
                    break;
                }
            }

            for(int i= lineArray.size()-1; i>=0; i -- ){
                if (Character.isDigit(lineArray.get(i))){
                    lastDigit =Integer.parseInt(lineArray.get(i).toString());
                    System.out.println(lastDigit);
                    break;
                }
            }
            calibrationNumber = firstDigit*10 + lastDigit+ calibrationNumber;
            System.out.println(calibrationNumber);
            line = bufferedReader.readLine();

        }

    }



    public void part2() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("./day1Input.txt"));
        String line = bufferedReader.readLine();
        int firstDigit = 0;
        int lastDigit = 0;
        int calibrationNumber = 0;
        while(line != null){
            System.out.println(line);
            line = line.replaceAll("one", "o1e");
            line = line.replaceAll("two", "t2o");
            line = line.replaceAll("three", "t3e");
            line = line.replaceAll("four", "f4r");
            line = line.replaceAll("five", "f5e");
            line = line.replaceAll("six", "s6x");
            line = line.replaceAll("seven", "s7n");
            line = line.replaceAll("eight", "e8t");
            line = line.replaceAll("nine", "n9e");
            System.out.println(line);

            ArrayList<Character> lineArray = new ArrayList<>();
            for (char i: line.toCharArray()
            ) { lineArray.add(i);
            }
            for (Character c: lineArray
            ) {
                if(Character.isDigit(c)){
                    firstDigit = Integer.parseInt(c.toString());
                    System.out.println(firstDigit);
                    break;
                }
            }

            for(int i= lineArray.size()-1; i>=0; i -- ){
                if (Character.isDigit(lineArray.get(i))){
                    lastDigit =Integer.parseInt(lineArray.get(i).toString());
                    System.out.println(lastDigit);
                    break;
                }
            }
            calibrationNumber = firstDigit*10 + lastDigit+ calibrationNumber;
            System.out.println(calibrationNumber);
            line = bufferedReader.readLine();

        }

    }
}
