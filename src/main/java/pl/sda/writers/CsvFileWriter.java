package pl.sda.writers;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CsvFileWriter implements SDAFileWriter {

    @Override
    public void write(List<Map<String, String>> records, String path) {
        //Budowanie wiersza nagłówkowego
        Set<String> headers = new HashSet<>();
        for (Map<String, String> record : records) {
            headers.addAll(record.keySet());
        }
        String headerRow = "";
        int counter = 0;
        for (String header : headers) {
            headerRow = headerRow + header;
            if (counter < headerRow.length() - 1) {
                headerRow = headerRow + ";";
            }
        }


        //TODO: zbudować wiersze zawierające dane na bazie listy records

        //TODO: zapisać dane do pliku przy użyciu klasy BufferedWriter
    }

}
