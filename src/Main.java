import Cache.LRUCache;
import Constants.ANSI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(100);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(ANSI.ANSI_BLUE+"Please choose an action: PUT:1, GET:2, EXIT:0 --> Action : "+ANSI.ANSI_RESET);
            String action = scanner.nextLine().trim().toUpperCase();

            switch (action) {
                case "1":
                    System.out.print(ANSI.ANSI_BLUE+"Enter key:");
                    String key = scanner.nextLine().trim();
                    System.out.print("Enter value:"+ANSI.ANSI_RESET);
                    String value = scanner.nextLine().trim();
                    cache.put(key, value);
                    System.out.println(ANSI.ANSI_YELLOW+"Entry added to cache."+ANSI.ANSI_RESET);
                    break;
                case "2":
                    System.out.print(ANSI.ANSI_BLUE+"Enter key:");
                    key = scanner.nextLine().trim();
                    value = cache.get(key);
                    if (value != null) {
                        System.out.println(ANSI.ANSI_YELLOW+"Value: " + value + ANSI.ANSI_RESET);
                    } else {
                        System.out.println(ANSI.ANSI_RED+"Key not found."+ANSI.ANSI_RESET);
                    }
                    break;
                case "0":
                    System.out.print(ANSI.ANSI_BLUE+"Exiting.."+ANSI.ANSI_RESET);
                    System.exit(0);
                    break;
                default:
                    System.out.println(ANSI.ANSI_RED+"Invalid action. Please choose either PUT, GET, or EXIT."+ANSI.ANSI_RESET);
                    break;
            }
        }
    }
}