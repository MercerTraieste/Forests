package org.ecoassist.forest.service;

public class ForestException extends Exception {

    public ForestException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ForestException(Throwable throwable) {
        super(throwable);
    }

}
