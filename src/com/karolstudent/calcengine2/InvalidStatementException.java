package com.karolstudent.calcengine2;

/**
 * Created by Karol on 2020-04-13
 */
public class InvalidStatementException extends Exception{
    public InvalidStatementException(String reason, String statement){
        super(reason + ": " + statement);
    }
    public InvalidStatementException(String reason, String statement, Throwable cause){
        super(reason + ": " + statement, cause);
    }
}
