package xmlWork;

import candy.Candy;

import java.util.Comparator;

public class Sorter implements Comparator<Candy> {
    @Override
    public int compare(Candy a, Candy b) {
        if (a.Energy > b.Energy) return 1;
        if (a.Energy < b.Energy) return -1;
        return 0;
    }

}
