package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {

        return list -> {
            List<Integer> m = new ArrayList<>();
            for(int i : list){
                m.add(i/divider);
            }
            return m;
        };
    }
}
