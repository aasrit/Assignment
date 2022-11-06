import java.util.HashMap;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        System.out.println(map);
        map.put("abc",10);
        map.put("def",30);
        System.out.println("Size of the map is :"+map.size());
        System.out.println(map);
        if(map.containsKey("abc")) {
            System.out.println("contains");
        }
    }
}
