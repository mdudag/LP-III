package q03;

import java.util.ArrayList;
import java.util.List;

public class PoliticoExample {
    List<Politico> myPoliticos = new ArrayList<>();
    Data data = new Data(6, 3, 1888);

    myPoliticos.add(new Politico("Ana Maria", 12345, data, "ABC", 123));
    myPoliticos.add(new Prefeito("Ana Julia", 123456, data, "DEF", 345));
    myPoliticos.add(new Governador("Ana Clara", 123457, data, "GHI", 678));

    for (Politico item: myPoliticos) 
        System.out.println(item.toString());
        
    System.out.println();
}
