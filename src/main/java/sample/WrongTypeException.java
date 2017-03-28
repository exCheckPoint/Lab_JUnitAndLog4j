package sample;

/**
 * Created by Unerty on 04.11.2016.
 */
public class WrongTypeException extends Exception {
    public WrongTypeException(){

    }
    public WrongTypeException(String message){
        super(message);
    }
    public WrongTypeException(Throwable cause){
        super(cause);
    }
    public WrongTypeException(String message, Throwable cause){
        super(message, cause);
    }
}
