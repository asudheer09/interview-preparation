import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Map<Character,Integer> map= new HashMap<>();

        map.put('a',1);
        map.put('b',2);

        System.out.println(map.get('a'));
        System.out.println(map.get('b'));

      boolean res=  map.containsKey('a');
      boolean res1= map.containsKey('b');
      boolean res2= map.containsKey('c');

        System.out.println(res); //true
        System.out.println(res1); //true
        System.out.println(res2);// false


    }
}