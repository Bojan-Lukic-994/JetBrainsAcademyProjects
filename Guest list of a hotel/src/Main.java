//put imports you need here
import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while (sc.hasNextLine()) {
            list.add(sc.next());
        }
        
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
