package com.bbaker.arg.parser.text;

import java.util.OptionalInt;

import com.bbaker.arg.parser.exception.BadArgumentException;

public interface TextArgumentEvaluator {

    /**
     * @param token the string token
     * @param left the numeric value that prefixes the token
     * @param right the numeric value that suffixes the token
     * @return true if the token was evaluated successfully. False otherwise.
     * @throws BadArgumentException if a non-recoverable error occurs
     */
    boolean evaluate(String token, OptionalInt left, OptionalInt right) throws BadArgumentException;

    public static int getTotal(OptionalInt left, OptionalInt right) {
        int total = 0;
        boolean useDefault = true;

        if(left.isPresent()) {
            total += left.getAsInt();
            useDefault = false;
        }

        if(right.isPresent()) {
            total += right.getAsInt();
            useDefault = false;
        }

        if(useDefault) {
            total = 1;
        }
        return total;
    }

}