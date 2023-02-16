package com.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Hello world!
 */
public class App{
    protected App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static person pete;
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        isPhone("123-456-7890");
        System.out.println(pete.getPhone());
    }
    public static boolean isPhone(String p){
        String regex = "^\\s*(?:\\+?(\\d{1,3}))?[-. (]*(\\d{3})[-. )]*(\\d{3})[-. ]*(\\d{4})(?: *x(\\d+))?\\s*$";
        if(p.matches(regex)){
            //pete.setPhone(p);
            return true;
        }
        return false;
    }
}
