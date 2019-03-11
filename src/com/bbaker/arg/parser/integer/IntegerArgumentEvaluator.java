package com.bbaker.arg.parser.integer;

public interface IntegerArgumentEvaluator {

    /**
     * Used to process the integer that was found
     * @param token the integer that was found
     * @return true is the token was accepted by the evaluator
     */
    boolean evaluate(int token);

}
