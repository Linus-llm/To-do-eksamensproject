package pckg;

import java.util.ArrayList;

public class TodoList {
    ArrayList<Item> items;

    TodoList(ArrayList<Item> items){
        this.items = items;
    }
    void displayItems(){
        for(int i = 0;i<items.size();i++){
            System.out.println(i+1 +". "+ items.get(i).toString());
        }
    }

    public void setItemsToDone(int i) {
        items.get(i).markAsDone(items.get(i));
    }
    public ArrayList<Item> getItemsList(){
        return items;
    }
}
