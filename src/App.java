import java.util.Hashtable;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        String[] arrayOne = new String[]{"Morango", "Uva", "Acerola", "Manga"};
        String[] arrayTwo = new String[]{"Pêra", "Caju", "Morango", "Kiwi"};
        Hashtable<String, Integer> all = new Hashtable<>();

        for(int i = 0; i < arrayOne.length; i++){
            if(all.containsKey(arrayOne[i])){
                all.put(arrayOne[i], (all.get(arrayOne[i]) + 1));
            }else{
                all.put(arrayOne[i], 1);
            }
        }

        for(int i = 0; i < arrayTwo.length; i++){
            if(all.containsKey(arrayTwo[i])){
                all.put(arrayTwo[i], (all.get(arrayTwo[i]) + 1));
            }else{
                all.put(arrayTwo[i], 1);
            }
        }

        for (Map.Entry<String, Integer> e : all.entrySet())
            if(e.getValue() > 1)
                System.out.println(e.getKey());
    }
}
