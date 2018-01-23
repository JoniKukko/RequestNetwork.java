package network.request.services;

import network.request.services.entities.RequestNetworkException;
import network.request.services.external.IpfsService;

/**
 * Implementation for IpfsService
 */
enum IpfsSingleton implements IpfsService {
    INSTANCE;

    private boolean publicIpfs;

    void usePublicIpfs(boolean publicIpfs) {
        this.publicIpfs = publicIpfs;
    }

    @Override
    public String addFile(String data) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getFile(String hash) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }
}
