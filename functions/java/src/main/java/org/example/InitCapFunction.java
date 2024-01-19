package org.example;

import java.util.Objects;
import java.util.function.Function;

public class InitCapFunction implements Function<String,String> {
    @Override
    public String apply(String s) {
        if (Objects.nonNull(s) || s.length() > 0) {
            String s1 = Character.toUpperCase(s.charAt(0))+s.substring(1);
            return s1;
        }

        throw new IllegalArgumentException("Invalid message length");
    }
}
