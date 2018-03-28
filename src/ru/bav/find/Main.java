package ru.bav.find;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * В классе Main указывается путь к файлу firstfile, в котором указан путь для поиска введенных пользователем с клавиатуры слов.
 *
 * @author Barinov Anton 15IT18
 */

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        try (BufferedReader reader = new BufferedReader(new FileReader("src\\ru\\bav\\find\\firstfile.txt"))) {
            String string = reader.readLine();
            System.out.println("Введите нужные вам слова, либо текст, который вы хотите найти:");
            String message = scan.next();

            Find.main(new File(string),message);
        } catch (NullPointerException e) {

        }
    }
}
