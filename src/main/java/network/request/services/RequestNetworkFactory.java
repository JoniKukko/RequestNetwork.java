package network.request.services;

/**
 * The RequestNetworkFactory class is the single entry-point into the
 * RequestNetwork.java library. It builds the RequestNetwork instance that can
 * be used to interact with the RequestNetwork.
 */
public final class RequestNetworkFactory {

    private RequestNetworkFactory() {
        throw new AssertionError();
    }

    /**
     * Returns the RequestNetwork implementation.
     * 
     * @return singleton of RequestNetwork
     */
    public static RequestNetwork getInstance() {
        return RequestNetworkSingleton.INSTANCE;
    }
}
