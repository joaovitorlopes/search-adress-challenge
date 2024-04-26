package joaovitorlopes.com.github.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public void writeJson(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writer = new FileWriter(address.cep() + ".json");
        writer.write(gson.toJson(address));
        writer.close();
    }
}
