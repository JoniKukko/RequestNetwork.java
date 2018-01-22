package network.request.services.core;

import java.util.List;

import network.request.services.entities.RequestNetworkException;
import network.request.services.entities.RequestNetworkResponse;

/**
 * Interface for the Request Core contract.
 */
public interface RequestCoreService {

    /**
     * Get the number of the last request (N.B: number !== id).
     * 
     * @return the number of the last request
     * @throws RequestNetworkException
     */
    int getCurrentNumRequest() throws RequestNetworkException;

    /**
     * Get the version of the contract.
     * 
     * @return the version of the contract
     * @throws RequestNetworkException
     */
    int getVersion() throws RequestNetworkException;

    /**
     * Get the estimation of ether (in wei) needed to create a request.
     * 
     * @param expectedAmount
     *            amount expected of the request
     * @param currencyContract
     *            address of the currency contract of the request
     * @param extension
     *            address of the extension contract of the request
     * @return the number of wei needed to create the request
     * @throws RequestNetworkException
     */
    int getCollectEstimation(int expectedAmount, String currencyContract, String extension)
            throws RequestNetworkException;

    /**
     * Get a request by its requestId.
     * 
     * @param requestId
     *            requestId of the request
     * @return the object containing the request
     * @throws RequestNetworkException
     */
    Object getRequest(String requestId) throws RequestNetworkException;

    /**
     * Get a request and method called by the hash of a transaction.
     * 
     * @param hash
     *            hash of the ethereum transaction
     * @return response containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    RequestNetworkResponse getRequestByTransactionHash(String hash) throws RequestNetworkException;

    /**
     * Get a request's events.
     * 
     * @param requestId
     *            requestId of the request
     * @return list of events about the request
     * @throws RequestNetworkException
     */
    List<Object> getRequestEvents(String requestId) throws RequestNetworkException;

    /**
     * Get a request's events.
     * 
     * @param requestId
     *            requestId of the request
     * @param fromBlock
     *            search events from this block
     * @return list of events about the request
     * @throws RequestNetworkException
     */
    List<Object> getRequestEvents(String requestId, int fromBlock) throws RequestNetworkException;

    /**
     * Get a request's events.
     * 
     * @param requestId
     *            requestId of the request
     * @param fromBlock
     *            search events from this block
     * @param toBlock
     *            search events until this block
     * @return list of events about the request
     * @throws RequestNetworkException
     */
    List<Object> getRequestEvents(String requestId, int fromBlock, int toBlock) throws RequestNetworkException;

    /**
     * Get the list of requests connected to an address.
     * 
     * @param address
     *            address to get the requests
     * @return list of requests
     * @throws RequestNetworkException
     */
    List<Object> getRequestsByAddress(String address) throws RequestNetworkException;

    /**
     * Get the list of requests connected to an address.
     * 
     * @param address
     *            address to get the requests
     * @param fromBlock
     *            search requests from this block
     * @return list of requests
     * @throws RequestNetworkException
     */
    List<Object> getRequestsByAddress(String address, int fromBlock) throws RequestNetworkException;

    /**
     * Get the list of requests connected to an address.
     * 
     * @param address
     *            address to get the requests
     * @param fromBlock
     *            search requests from this block
     * @param toBlock
     *            search requests until this block
     * @return list of requests
     * @throws RequestNetworkException
     */
    List<Object> getRequestsByAddress(String address, int fromBlock, int toBlock) throws RequestNetworkException;

    /**
     * Get Ipfs file.
     * 
     * @param hash
     * @return
     * @throws RequestNetworkException
     */
    Object getIpfsFile(String hash) throws RequestNetworkException;
}
