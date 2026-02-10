import java.util.*;

public class Intro{
    public static void main(String[] args){
        // Creating
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);

        if(set.contains(1)){
            System.out.println("True");
        }
        if(!set.contains(24)){
            System.out.println("Correct");
        }
        System.out.println(set.size());
        set.remove(1);
        System.out.println(set);
        System.out.println(set.size());

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}