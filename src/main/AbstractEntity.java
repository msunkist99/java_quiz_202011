package main;

public class AbstractEntity {
    private static int id;

    public static int getId(){
        id++;
        return id;
    }
}
