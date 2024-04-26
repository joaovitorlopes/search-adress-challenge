package joaovitorlopes.com.github.main;

import joaovitorlopes.com.github.models.Adress;
import joaovitorlopes.com.github.models.SearchZipCode;

public class Main {
    public static void main(String[] args) {
        SearchZipCode searchZipCode = new SearchZipCode();
        Adress newAdress = searchZipCode.searchAdress("01153000");
        System.out.println(newAdress);
    }
}
