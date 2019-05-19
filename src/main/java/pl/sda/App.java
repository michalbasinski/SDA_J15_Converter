package pl.sda;

import pl.sda.utils.SDAFileConverter;

public class App
{
    public static void main( String[] args ) {
        String input = "/home/michal/SDA/Java15/Projekty/converter/src/main/resources/cars.csv";
        String output = "/home/michal/output_cars.xlsx";

        SDAFileConverter converter = new SDAFileConverter();
        converter.convert(input, output);
    }
}
