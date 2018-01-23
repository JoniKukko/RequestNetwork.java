package network.request.services;

import network.request.services.contracts.RequestEthereumService;
import network.request.services.core.RequestCoreService;
import network.request.services.extensions.RequestSynchroneExtensionEscrowService;

/**
 * The RequestNetwork interface is the single entry-point into the
 * RequestNetwork.java library. It contains all of the library's functionality
 * and all calls to the library should be made through a RequestNetwork
 * instance.
 */
public interface RequestNetwork {
    
    RequestEthereumService getEthereumService();
    
    RequestSynchroneExtensionEscrowService geSynchroneExtensionEscrowService();
    
    RequestCoreService getCoreService();
}
