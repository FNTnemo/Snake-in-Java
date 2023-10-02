package snake.Engine;

import java.io.*;

public class Config {
    public static File mainDir = new File("C:/Users/" + System.getProperty("user.name") + "/AppData/Roaming/.Snake-in-Java/");
    public static File score = new File(mainDir + "Score.txt");
    public static  File playerDefaultSettings = new File("");

    public static void Wright(File file, long num){
        try {
            checkFileExist(file);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(Long.toString(num));
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void Wright(File file, double num){
        try {
            checkFileExist(file);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(Double.toString(num));
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void Wright(File file, String string){
        try {
            checkFileExist(file);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(string);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static int Right(File file) {
        try {
            checkFileExist(file);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (bufferedReader.ready()) {
                return Integer.parseInt(bufferedReader.readLine());
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return 0;
    }

    public static void checkFileExist(File file){
        try {
            if(!file.exists()){
                file.createNewFile();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public static void checkDir(File file){
        if(!file.exists() && file.isDirectory()){
            file.mkdir();
        }
    }
}
