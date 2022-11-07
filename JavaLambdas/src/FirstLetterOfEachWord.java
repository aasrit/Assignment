import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
    public class FirstLetterOfEachWord {
        List<String> list = Arrays.asList("Sania", "Virat", "Alia", "Sam", "John", "Henry");
        public static void main(String[] args) {
            FirstLetterOfEachWord firstletter = new FirstLetterOfEachWord();
            processWords(firstletter.list);
        }

        public static String processWords(List<String> list) {
            StringBuilder words = new StringBuilder();
            Consumer<String> consumer = p-> words.append(p.charAt(0));
            list.stream().forEach(consumer);
            System.out.println(words);
            return  words.toString();
        }
    }
