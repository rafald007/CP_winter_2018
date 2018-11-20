package pl.waw.sgh;
import java.io.*;
import java.util.Locale;
import java.util.Scanner;


public class Homework3 {
    public static void main(String[] args) {
        File folder = new File("C://Users//USER//Desktop//uczelnia//Computer programming//Quatations");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println("File " + file.getName());
                try {
                    Quota(file);
                }catch (FileNotFoundException e){
                    System.out.println("File: "+file.getName()+ " not found in "+folder);
                }
            }
        }
    }
    public static void Quota (File file) throws FileNotFoundException { //funkcji nie interesuje przypadek gdy pliku nie ma

        Scanner scanner = new Scanner(file);

        File outfile = new File("C://Users//USER//Desktop//uczelnia//Computer programming//Quatations"+"_"+file.getName());

        try {
            FileWriter fw = new FileWriter(outfile);
            BufferedWriter out = new BufferedWriter(fw);

            out.write(scanner.nextLine()+",Percentage Change"); //omit first row - column names
            out.newLine();
            while (scanner.hasNext()) {

                String line = scanner.nextLine();
                out.write(addPercentageChangeField(line));
                out.newLine();
            }

            out.close();
            fw.close();
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }
    public static String addPercentageChangeField (String line){
        String[] lineSplitted = line.split(",");
        Double openD = Double.parseDouble(lineSplitted[1]);
        Double closeD = Double.parseDouble(lineSplitted[4]);

        Double changeD = ((closeD - openD) / openD) * 100;
        return line+","+String.format(Locale.US, "%.4f", changeD);
    }
}