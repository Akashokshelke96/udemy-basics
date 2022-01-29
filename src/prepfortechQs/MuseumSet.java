package prepfortechQs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MuseumSet {
    public static void main (String[] args) //throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T!=0)
        {
            int N = sc.nextInt();
            int C = sc.nextInt();
            sc.nextLine();
            String fos = sc.nextLine();
            Set<Character> fset = new HashSet<Character>();
            for(int i=0; i<N; i++)
            {
                char f = fos.charAt(i);
                fset.add(f);
            }
            int S = fset.size();
            if(S >= C)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println((C-S));
            }
            T--;
        }
    }//First-line will contain T, the number of test cases. Then the test cases follow.
   // Each test case contains a two-input N(Length of the array) and C (Empty spaces in the museum).
    //Single Line containing N inputs a1,a2,a3…an(fossils delivered to the museum)
    //Constraints
}

