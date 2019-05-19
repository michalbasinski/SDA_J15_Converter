package pl.sda;

import pl.sda.readers.FileReaderFactory;
import pl.sda.readers.SDAFileReader;
import pl.sda.writers.FileWriterFactory;
import pl.sda.writers.SDAFileWriter;

import java.util.List;
import java.util.Map;

public class App
{
    public static void main( String[] args ) {
        String input = "/home/michal/SDA/Java15/Projekty/converter/src/main/resources/persons.xlsx";
        String output = "/home/michal/output_persons.json";

        FileReaderFactory readerFactory = new FileReaderFactory();
        FileWriterFactory writerFactory = new FileWriterFactory();

        SDAFileReader reader = readerFactory.produce(input);
        SDAFileWriter writer = writerFactory.produce(output);

        List<Map<String, String>> records = reader.read(input);
        writer.write(records, output);
    }
}
