import java.util.List;

public class Task {
    public static void main(String[] args) {
        // put your code here
    }

    static void changeList(List<String> list) {
        StringBuilder max = new StringBuilder("");
        for (String item : list) {
            if (item.length() > max.length()) {
                max = new StringBuilder(item);
            }
        }

        for(String item : list) {
          item.replaceAll(item, String.valueOf(max));
        }
    }
}
