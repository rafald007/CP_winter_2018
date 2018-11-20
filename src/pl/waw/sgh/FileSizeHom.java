package pl.waw.sgh;

import java.io.File;

public class FileSizeHom {
    static File file = new File("C://Users//USER//Desktop//uczelnia//ekonometria");

    public static void main(String[] args) {
        boolean isDir = file.isDirectory();
        if (isDir) {
            int numberOfFiles = countFiles(file);
            double spaceTaken = countSpaceTaken(file);
            int numberOfFolders=countFolders(file);
            System.out.println("Space taken = " + spaceTaken + ". Number of files = " + numberOfFiles + ". Number of folders = "+numberOfFolders);
        } else {
            System.out.println("Space taken = " + file.length() + ". Number of files = 1.");
        }
    }

    public static int countFiles(File file) {
        File[] files = file.listFiles();
        int countNumber = 0;

        for (File f : files) {
            if (f.isDirectory())
                countNumber += countFiles(f);
            else
                countNumber++;
        }
        return countNumber;
    }

    public static double countSpaceTaken(File file) {
        File[] files = file.listFiles();
        double countSpace = 0d;
        for (File f : files) {
            if (f.isDirectory())
                countSpace += countSpaceTaken(f);
            else
                countSpace += f.length();
        }
        return countSpace;
    }

    public static int countFolders(File file) {
        File[] files = file.listFiles();
        int countFolders = 0;
        for (File f : files) {
            if (f.isDirectory()) {
                countFolders++;
                countFolders(f);
            }
        }
        return countFolders;
    }
}

