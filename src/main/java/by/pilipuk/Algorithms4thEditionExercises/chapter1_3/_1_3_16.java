package by.pilipuk.Algorithms4thEditionExercises.chapter1_3;

import java.io.*;
import java.time.LocalDate;
import java.util.Date;

public class _1_3_16 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String line;
//        while ((line = reader.readLine()) != null && !line.isEmpty()) {
//            String[] str = line.trim().split("/");
//            System.out.println(LocalDate.of(Integer.parseInt(str[2]), Integer.parseInt(str[0]), Integer.parseInt(str[1])));
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line;
        while ((line = reader.readLine()) != null && !line.isEmpty()) {
            String[] str = line.trim().split("[/ ]");
            System.out.println(str[0] + " " + LocalDate.of(Integer.parseInt(str[3]), Integer.parseInt(str[1]), Integer.parseInt(str[2])) + " " + Double.parseDouble(str[4]));
        }
    }
}
