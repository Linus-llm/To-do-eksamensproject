package pckg;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        itemLoader iL = new itemLoader();
//test //test
        ArrayList<Item> tmp = iL.loadFile("code/data/todo.csv");
        TodoList todoList = new TodoList(tmp);
        todoList.displayItems();
        todoList.setItemsToDone(0);
        System.out.println("\n");
        todoList.displayItems();
        iL.saveData(todoList.getItemsList(),"code/data/todo.csv","Description, Done");

    }
}