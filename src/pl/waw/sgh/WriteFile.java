package pl.waw.sgh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        String home=System.getProperty("user.home");
        System.out.println(home);
        File myFile = new File(home + "/myfile.txt");

        System.out.println("Your file " + myFile.getAbsolutePath() + " exists: " + myFile.exists() +
                " last modified: " + new Date(myFile.lastModified()));
        myFile.length();


        FileWriter fw = new FileWriter(myFile, true); // true doda dane do istniejącego pliku, a nie go zastąpi
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("My first line");
        bw.newLine();
        bw.write("2nd line\r\n");
        bw.flush(); // przepisuje natychmiastowo dane z bufora do pliku
        bw.write("3rd line");

        bw.close();
        fw.close();
    }
}
