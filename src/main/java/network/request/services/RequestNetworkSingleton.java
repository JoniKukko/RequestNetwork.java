package network.request.services;

import network.request.services.contracts.RequestEthereumService;
import network.request.services.core.RequestCoreService;
import network.request.services.extensions.RequestSynchroneExtensionEscrowService;

/**
 * Implementation for RequestNetwork as singleton.
 */
enum RequestNetworkSingleton implements RequestNetwork {
    INSTANCE;

    private final RequestSynchroneExtensionEscrowService synchroneExtensionEscrowService;
    private final RequestEthereumService ethereumService;
    private final RequestCoreService coreService;

    RequestNetworkSingleton() {
        this.synchroneExtensionEscrowService = null;
        this.ethereumService = null;
        this.coreService = null;
    }

    @Override
    public RequestSynchroneExtensionEscrowService geSynchroneExtensionEscrowService() {
        return synchroneExtensionEscrowService;
    }

    @Override
    public RequestEthereumService getEthereumService() {
        return ethereumService;
    }

    @Override
    public RequestCoreService getCoreService() {
        return coreService;
    }
}
