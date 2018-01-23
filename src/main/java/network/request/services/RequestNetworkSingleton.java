package network.request.services;

import network.request.services.contracts.RequestEthereumService;
import network.request.services.core.RequestCoreService;
import network.request.services.extensions.RequestSynchroneExtensionEscrowService;

/**
 * Implementation for RequestNetwork as singleton.
 */
enum RequestNetworkSingleton implements RequestNetwork {
    INSTANCE;

    private RequestSynchroneExtensionEscrowService synchroneExtensionEscrowService;
    private RequestEthereumService ethereumService;
    private RequestCoreService coreService;

    void init(RequestSynchroneExtensionEscrowService synchroneExtensionEscrowService,
            RequestEthereumService ethereumService, RequestCoreService coreService) {
        this.synchroneExtensionEscrowService = synchroneExtensionEscrowService;
        this.ethereumService = ethereumService;
        this.coreService = coreService;
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
