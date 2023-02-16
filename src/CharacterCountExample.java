import java.util.HashMap;
import java.util.Map;

public class CharacterCountExample {
    public static void main(String[] args) {
        String s="hello";

        char[] data= s.toCharArray();

        Map<Character,Integer> map= new HashMap<>();

        for(char c:data){
           if(map.containsKey(c)){
               map.put(c,map.get(c)+1);
           }else {
               map.put(c, 1);
           }
        }

        System.out.println(map);
    }
}

//  c-->h     {h - 1}
//  c-->e     {e - 1}
//  c-->l     {l - 1}
//  c-->l     {l - 2}