import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        print();
    }
    public static void print(){
        Set<String> func = new HashSet<>(Arrays.asList("prova","test"));

        String test = "test";

            if(func.contains(test)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }
    }
}