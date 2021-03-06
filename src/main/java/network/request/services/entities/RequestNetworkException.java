package network.request.services.entities;

/**
 * Generic exception for RequestNetwork related problems.
 */
public class RequestNetworkException extends Exception {

    private static final long serialVersionUID = 1L;

    public RequestNetworkException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestNetworkException(String message) {
        super(message);
    }

    public RequestNetworkException(Throwable cause) {
        super(cause);
    }
}
