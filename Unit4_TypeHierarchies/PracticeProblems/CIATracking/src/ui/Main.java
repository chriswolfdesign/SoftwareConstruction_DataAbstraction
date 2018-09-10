package ui;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Traceable> list = new ArrayList<Traceable>();

        Person criminal = new Person("Dirty Dan");
        FingerPrint print = new FingerPrint("Bikini Bottom", criminal);
        CellPhone phone = new CellPhone("Bikini Bottom", criminal);
        Call call1 = new Call("Bikini Bottom", phone);

        list.add(print);
        list.add(phone);
        list.add(call1);

        for(Traceable trace : list)
            trace.track();

        criminal.track();

        Person realCriminal = new Person("Pinhead Larry");
        realCriminal.track();
    }
}
