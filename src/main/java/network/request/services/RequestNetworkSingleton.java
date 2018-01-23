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

    void setSynchroneExtensionEscrowService(RequestSynchroneExtensionEscrowService synchroneExtensionEscrowService) {
        this.synchroneExtensionEscrowService = synchroneExtensionEscrowService;
    }

    @Override
    public RequestSynchroneExtensionEscrowService geSynchroneExtensionEscrowService() {
        return synchroneExtensionEscrowService;
    }

    void setEthereumService(RequestEthereumService ethereumService) {
        this.ethereumService = ethereumService;
    }

    @Override
    public RequestEthereumService getEthereumService() {
        return ethereumService;
    }

    void setCoreService(RequestCoreService coreService) {
        this.coreService = coreService;
    }

    @Override
    public RequestCoreService getCoreService() {
        return coreService;
    }
}
