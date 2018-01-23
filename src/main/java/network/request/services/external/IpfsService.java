package network.request.services.external;

import network.request.services.entities.RequestNetworkException;

/**
 * Interface for ipfs node
 */
public interface IpfsService {

    /**
     * Add a file in ipfs
     * 
     * @param data
     *            data that will be store in ipfs
     * @return the hash of the created file
     * @throws RequestNetworkException
     */
    String addFile(String data) throws RequestNetworkException;

    /**
     * Get a file from ipfs from its hash
     * 
     * @param hash
     *            hash of the file to get
     * @return the data of the file
     * @throws RequestNetworkException
     */
    String getFile(String hash) throws RequestNetworkException;
}
