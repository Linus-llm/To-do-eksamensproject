package pckg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class itemLoader {
 String[] tmp;
 String itemBol;
 ArrayList<Item> items = new ArrayList<>();

    protected ArrayList<Item> loadFile(String path){
                File file = new File(path);

        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        scan.nextLine(); //skip header;

                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    tmp = line.split(",");
                    String stringDescription = tmp[0];
                    String stringTmp = tmp[1];
                        Item i = new Item(stringDescription, stringTmp.trim());
                        items.add(i);
                    }

            return items;
            }


            public void saveData(ArrayList<Item> list, String path, String header){
        ArrayList<String> tmpArray = new ArrayList<>();
                for (Item item : list) {
                    String tmp = item.toString();
                    tmpArray.add(tmp);
                }
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(header+"\n");
            for (String s : tmpArray) {
                writer.write(s+"\n");
            }
            writer.close();
        }catch (IOException e) {
            System.out.println("problem: "+ e.getMessage());
        }
    }



}
