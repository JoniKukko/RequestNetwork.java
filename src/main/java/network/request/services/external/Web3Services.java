package network.request.services.external;

public final class Web3Services {

    private static Web3Service service;
    private static final Object DEFAULT_WEB3_PROVIDER = null;
    private static final int DEFAULT_NETWORK_ID = -1;

    private Web3Services() {
        throw new AssertionError();
    }

    /**
     * Initialize Web3Service with default web3provider and networkId
     */
    public static void init() {
        if (isInitialized()) {
            throw new IllegalStateException("Web3Service already initialized");
        }
        service = new Web3Single(DEFAULT_WEB3_PROVIDER, DEFAULT_NETWORK_ID);
    }

    /**
     * Initialize Web3Service with web3provider and default networkId
     * 
     * @param web3Provider
     */
    public static void init(Object web3Provider) {
        if (isInitialized()) {
            throw new IllegalStateException("Web3Service already initialized");
        }
        service = new Web3Single(web3Provider, DEFAULT_NETWORK_ID);
    }

    /**
     * Initialize Web3Service with networkId and default web3provider
     * 
     * @param networkId
     */
    public static void init(int networkId) {
        if (isInitialized()) {
            throw new IllegalStateException("Web3Service already initialized");
        }
        service = new Web3Single(DEFAULT_WEB3_PROVIDER, networkId);
    }

    /**
     * Initialize Web3Service with web3provider and networkId
     * 
     * @param web3Provider
     * @param networkid
     */
    public static void init(Object web3Provider, int networkId) {
        if (isInitialized()) {
            throw new IllegalStateException("Web3Service already initialized");
        }
        service = new Web3Single(web3Provider, networkId);
    }

    /**
     * Get the instance of Web3Service
     * 
     * @return The implementation of Web3Service
     */
    public Web3Service getInstance() {
        if (!isInitialized()) {
            throw new IllegalStateException("Web3Service not initialized");
        }
        return service;
    }

    /**
     * Check if Web3Service is initialized.
     * 
     * @return true if Web3Service is initialized
     */
    public static boolean isInitialized() {
        return service != null;
    }
}
