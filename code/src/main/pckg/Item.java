package pckg;

public class Item {
    private String description;
    private String isDone;

    public Item(String s, String b) {
        description = s;
        isDone = b;
    }

    protected void markAsDone(Item i){
        if(i.isDone.equals("not done")){
            isDone = "done";
        }
    }

    public String toString(){
        return description+", "+isDone;
    }
}
