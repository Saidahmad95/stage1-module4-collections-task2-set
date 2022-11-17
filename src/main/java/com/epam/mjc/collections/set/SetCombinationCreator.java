package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> firstSet1 = new HashSet<>(firstSet);
        firstSet1.retainAll(secondSet);
        firstSet1.removeAll(thirdSet);

        Set<String> firstAndSecond = new HashSet<>(firstSet);
        firstAndSecond.addAll(secondSet);

        thirdSet.removeAll(firstAndSecond);

        Set<String> result = new HashSet<>();
        result.addAll(firstSet1);
        result.addAll(thirdSet);

        return result;
    }
}
