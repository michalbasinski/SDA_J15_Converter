package pl.sda.writers;

public class FileWriterFactory {
    public SDAFileWriter produce(String path) {

        if (path.endsWith(".json")) {
            return new JsonFileWriter();
        }

        return null;
    }
}
