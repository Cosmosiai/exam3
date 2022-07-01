package ThirdExam.Two;

import java.util.List;

public class SimilarEx extends Exception{
    public SimilarEx() {
    }

    public SimilarEx(String message) {
        super(message);
    }

    public SimilarEx(String message, Throwable cause) {
        super(message, cause);
    }

    public SimilarEx(Throwable cause) {
        super(cause);
    }

    public SimilarEx(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
