package com.bbaker.arg.parser.exception;

public class BadArgumentException extends Exception {


    public BadArgumentException(String messageTemplate, Object... args) {
        super(String.format(messageTemplate, args));
    }

}
