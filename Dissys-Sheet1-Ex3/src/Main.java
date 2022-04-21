import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;


        System.out.println("Enter Strings. To end the input press ! ");


        HashSet hashSet = new HashSet();


        Boolean l = false;

        while(l == false) {

            s = sc.nextLine();
            hashSet.add(s);

            if (Objects.equals(s, "!")) {
                l = true;
            }

        }

        Iterator it = hashSet.iterator();


        // Ausgabe
        while (it.hasNext()){

            String setText = (String) it.next();

            System.out.println(setText);

        }



    }

}
