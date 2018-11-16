package jck.engine.game;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class GameSettings {

    private static HashMap<String,String> settings = new HashMap<String,String>();

    public static void loadSettings() {
        try {
            File settingsFile = new File("GameSettings.jcksettings");
            if (!settingsFile.exists()){
                setupSettings();
                saveSettings();
            }else{
                Scanner fileReader = new Scanner(new FileReader(settingsFile));
                while(fileReader.hasNext()){
                    String line = fileReader.nextLine();
                    String[] args = line.split("=");
                    settings.put(args[0].toLowerCase(),args[1].toLowerCase());
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void saveSettings(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("GameSettings.jcksettings"));
            for(String key : settings.keySet()){
                String value = settings.get(key);
                writer.write(key + "=" + value + "\n");
            }
            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void setupSettings(){
        System.out.println("Setting up settings");
        settings.put("FULLSCREEN", "FALSE");
        settings.put("VSYNC", "FALSE");
    }

    public static boolean getBoolean(String s){
        if(settings.get(s.toLowerCase()) == "true"){
            return true;
        }else{
            return false;
        }
    }

    public static int getInt(String s){
        return Integer.parseInt(settings.get(s.toLowerCase()));
    }

    public static String getString(String s){
        return settings.get(s.toLowerCase());
    }
}
