import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
    public class ConvertKeyValue{
        public static void main(String[] args) {
            HashMap<String,Integer> map = new HashMap<>();
            map.put("Java",2);
            map.put("Python",5);
            map.put("dotnet",9);
            ConvertKeyValue KeyValues = new ConvertKeyValue();
            KeyValues.convertKeyValueToString(map);
        }
        public String convertKeyValueToString(HashMap<String, Integer> map) {

            StringBuilder str = new StringBuilder();
            Consumer<Map.Entry> consumer=(p)->str.append(p.getKey()).append(p.getValue());
            Set set  = map.entrySet();
            set.stream()
                    .forEach(consumer);
            System.out.println(str);
            return str.toString();
        }
    }
