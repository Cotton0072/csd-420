/**
 * Author: Will Cotton
 * Date: 04/04/2026
 * Assignment: Module 2 Programming Assignment
 *
 * This program generates an array of five random integers and
 * an array of five random doubles. The values are written to
 * a file named "Will_datafile.dat". If the file already exists,
 * the data is appended; otherwise, the file is created.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class WriteDataFile {
    public static void main(String[] args) {
        String filename = "Will_datafile.dat";
        Random rand = new Random();

        try (PrintWriter out = new PrintWriter(new FileWriter(filename, true))) {

            out.println("Five Random Integers:");
            for (int i = 0; i < 5; i++) {
                out.print(rand.nextInt(100) + " ");
            }
            out.println();

            out.println("Five Random Doubles:");
            for (int i = 0; i < 5; i++) {
                out.print(rand.nextDouble() + " ");
            }
            out.println();

            out.println("----------------------------------");

            System.out.println("Data written/appended to " + filename);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
