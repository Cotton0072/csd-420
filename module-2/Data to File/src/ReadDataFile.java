/**
 * Author: Will Cotton
 * Date: 04/04/2026
 * Assignment: Module 2 Programming Assignment
 *
 * This program reads the contents of the file "Will_datafile.dat"
 * and displays the data to the console. The file must already exist
 * and contain data written by the WriteDataFile program.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFile {
    public static void main(String[] args) {
        String filename = "Will_datafile.dat";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            System.out.println("Contents of " + filename + ":");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
