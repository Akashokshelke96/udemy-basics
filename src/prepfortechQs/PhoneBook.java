package prepfortechQs;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {

        {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.nextLine();
            HashMap<String, Integer> hm = new HashMap<String, Integer>();

            for (int i = 0; i < n; i++) {
                String name = in.nextLine();
                int phone = in.nextInt();
                if (new Integer(phone).toString().length() == 8) {


                    hm.put(name, phone);
                    in.nextLine();
                }
            }
            while (in.hasNext()) {
                String s = in.nextLine();
                try {
                    int temp = hm.get(s);
                    System.out.println(s + "=" + temp);
                } catch (NullPointerException e) {
                    System.out.println("Not found");
                }
            }
        }
    }
}//phonebook
