package http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {

        URL url = new URL("http://localhost:3000");
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.setRequestMethod("GET");
        //байтовий вхідний потік
        InputStream inputStream = request.getInputStream();
        int available = inputStream.available();
        System.out.println(available);
        byte[] answer = new byte[available];
        inputStream.read(answer);
        System.out.println(Arrays.toString(answer));
        String responseFromServer = new String(answer);
        System.out.println(responseFromServer);
        System.out.println();




        Properties systemVariables = System.getProperties();

        for (Object property : systemVariables.keySet()) {
            System.out.println(property);

        }

        String path = System.getProperty("user.home");
        System.out.println(path);

        System.out.println();
//        File file = new File(path);
//        boolean isDirectory = file.isDirectory();
//        System.out.println(isDirectory);
//        if(isDirectory){
//            String[] filesAndDirs = file.list();
//            for (String currentObj : filesAndDirs) {
//                System.out.println(currentObj);
//            }
//        }

        File file = new File(path + File.separator + "xxx.txt");
//        System.out.println(file.exists());
//        System.out.println(file.createNewFile());


        if(! file.exists()) file.createNewFile();

        //байтовий вихідний потік(Запис до файлу)
//        FileOutputStream fileOutputStream = new FileOutputStream(file);
//        fileOutputStream.write(responseFromServer.getBytes());
//        fileOutputStream.flush();
//        fileOutputStream.close();

        //символьний вихідний потік(Запис до файлу)
//        FileWriter fileWriter = new FileWriter(file);
//        fileWriter.write(responseFromServer);
//        fileWriter.close();

        //буферизований вихідний потік(Запис до файлу)
//        PrintWriter printWriter = new PrintWriter(new FileWriter(file,true));
//        printWriter.println(responseFromServer);
//        printWriter.close();


        //посимвольний вхідний потік(зчитування файлу)
//        FileReader fileReader = new FileReader(file);
//        char[] chars = new char[(int)file.length()];
//        fileReader.read(chars);
//        System.out.println(Arrays.toString(chars));
//        for (char aChar : chars) {
//            System.out.println(aChar);
//
//        }
//        fileReader.close();

        //буферизований вхідний потік(зчитування файлу)
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String s = "";
        while((s = bufferedReader.readLine()) != null){
            System.out.println(s);
        }
        bufferedReader.close();


    }
}
