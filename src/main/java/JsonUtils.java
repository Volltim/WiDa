import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

public class JsonUtils {

    // Gson Instanz erstellen
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    // Methode zum Speichern eines Objekts als JSON in eine Datei
    public static <T> void saveObjectToFile(T object, String fileName) {
        try (Writer writer = new FileWriter(fileName)) {
            gson.toJson(object, writer);
        } catch (IOException e) {
            throw new RuntimeException("Fehler beim Speichern des Objekts in die Datei " + fileName, e);
        }
    }

    // Methode zum Laden eines Objekts aus einer JSON-Datei
    public static <T> T loadObjectFromFile(Class<T> clazz, String fileName) {
        try (Reader reader = new FileReader(fileName)) {
            return gson.fromJson(reader, clazz);
        } catch (IOException e) {
            throw new RuntimeException("Fehler beim Laden des Objekts aus der Datei " + fileName, e);
        }
    }
    }