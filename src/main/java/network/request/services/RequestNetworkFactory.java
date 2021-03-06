package network.request.services;

/**
 * The RequestNetworkFactory class is the single entry-point into the
 * RequestNetwork.java library. It builds the RequestNetwork instance that can
 * be used to interact with the RequestNetwork.
 */
public final class RequestNetworkFactory {

    private static boolean initialized = false;

    private RequestNetworkFactory() {
        // TODO: default values in this class should come from configuration file
        throw new AssertionError();
    }

    /**
     * Initialize RequestNetwork with default values.
     */
    public static void init() {
        init(null, -1, true);
    }

    /**
     * Initialize RequestNetwork with default provider and networkId.
     * 
     * @param useIpfsPublic
     *            if ipfs should be initialized as public or private
     */
    public static void init(boolean useIpfsPublic) {
        init(null, -1, useIpfsPublic);
    }

    /**
     * Initialize RequestNetwork with default provider and as public ipfs.
     * 
     * @param networkId
     *            networkId to use in web3j
     */
    public static void init(int networkId) {
        init(null, networkId, true);
    }

    /**
     * Initialize RequestNetwork with default provider.
     * 
     * @param networkId
     *            networkId to use in web3j
     * @param useIpfsPublic
     *            if ipfs should be initialized as public or private
     */
    public static void init(int networkId, boolean useIpfsPublic) {
        init(null, networkId, useIpfsPublic);
    }

    /**
     * Initialize RequestNetwork with public ipfs.
     * 
     * @param provider
     *            Web3jProvider
     * @param networkId
     *            networkId to use in web3j
     */
    public static void init(Object provider, int networkId) {
        init(provider, networkId, true);
    }

    /**
     * Initialize RequestNetwork with given values.
     * 
     * @param provider
     *            Web3jProvider
     * @param networkId
     *            networkId to use in web3j
     * @param useIpfsPublic
     *            if ipfs should be initialized as public or private
     */
    public static void init(Object provider, int networkId, boolean useIpfsPublic) {
        if (initialized) {
            throw new IllegalStateException("RequestNetwork already initialized");
        }
        IpfsSingleton.INSTANCE.usePublicIpfs(useIpfsPublic);
        Web3Singleton.INSTANCE.init(provider, networkId);
        // TODO: init singleton with correct objects
        RequestNetworkSingleton.INSTANCE.init(null, null, null);
        initialized = true;
    }

    /**
     * Returns the RequestNetwork implementation.
     * 
     * @return singleton of RequestNetwork
     */
    public static RequestNetwork getInstance() {
        if (!initialized) {
            throw new IllegalStateException("You must initialize RequestNetwork first with init-method.");
        }
        return RequestNetworkSingleton.INSTANCE;
    }
}
