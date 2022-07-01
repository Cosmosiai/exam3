package ThirdExam.Three;

public class FigEx extends Exception{
    public FigEx() {
    }

    public FigEx(String message) {
        super(message);
    }

    public FigEx(String message, Throwable cause) {
        super(message, cause);
    }

    public FigEx(Throwable cause) {
        super(cause);
    }

    public FigEx(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
