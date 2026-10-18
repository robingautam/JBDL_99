package abstracttion;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Bank bank = new ICICIBank();
        bank.loanInterest();


        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
    }
}
