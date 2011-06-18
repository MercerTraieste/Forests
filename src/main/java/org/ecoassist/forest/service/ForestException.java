package org.ecoassist.forest.service;

public class ForestException extends Exception {
    public ForestException() {
        super();
    }

    public ForestException(String s) {
        super(s);
    }

    public ForestException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ForestException(Throwable throwable) {
        super(throwable);
    }

    protected ForestException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
