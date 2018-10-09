package lt.kaunascoding.crud;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCRUD {
    public void createFile() {
        System.out.println("Iveskite failo pavadinima \u263A");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        System.out.println("Ivestas failo pavadinimas: " + fileName + " \u263B");

        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("Toks failas egzistuoja");
        } else {
            System.out.println("Toks failas neegzistuoja \uD83D\uDE22");
            System.out.println("Ar norite toki faila sukurti? Y/n");
            String arSukurti = sc.nextLine();
            if (arSukurti.toLowerCase().equals("y")) {//sulyginame mazaja raide
                try {
                    file.createNewFile();
                    System.out.println("Failas sukurtas sekmingai");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Sum ting wong");
                }
            }
        }
    }
}