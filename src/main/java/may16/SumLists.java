package may16;

import java.util.LinkedList;
import java.util.List;

public class SumLists {

  public static void sumLists(List<Integer> a, List<Integer> b) {
     StringBuilder bBuilder = new StringBuilder();
     StringBuilder aBuilder = new StringBuilder();

     a.forEach(num -> {
        aBuilder.insert(0, num);
     });

     b.forEach(num -> {
       bBuilder.insert(0, num);
     });

     Integer sum = Integer.parseInt(aBuilder.toString()) + Integer.parseInt(bBuilder.toString());

     List<Integer> result = new LinkedList<>();
     String sumString = sum.toString();

     for (int i=sumString.length()-1; i>=0; i--) {
       result.add( (int) sumString.charAt(i) - 48);
     }

     System.out.println(result);
  }

}
