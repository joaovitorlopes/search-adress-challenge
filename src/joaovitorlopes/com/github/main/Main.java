package joaovitorlopes.com.github.main;

import joaovitorlopes.com.github.models.Address;
import joaovitorlopes.com.github.models.FileWrite;
import joaovitorlopes.com.github.models.SearchZipCode;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        SearchZipCode searchZipCode = new SearchZipCode();

        System.out.println("Enter a zip code:");
        var zipCode = reading.nextLine();

        try {
            Address newAddress = searchZipCode.searchAddress(zipCode);
            System.out.println(newAddress);
            FileWrite fileWrite = new FileWrite();
            fileWrite.writeJson(newAddress);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finishing the application!");
        }
    }
}
