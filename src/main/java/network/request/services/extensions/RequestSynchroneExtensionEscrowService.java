package network.request.services.extensions;

import java.util.List;

import network.request.services.entities.RequestNetworkEvent;
import network.request.services.entities.RequestNetworkException;
import network.request.services.entities.RequestNetworkOptions;
import network.request.services.entities.RequestNetworkRequest;
import network.request.services.entities.RequestNetworkResponse;

/**
 * Interface for the Request Escrow extension.
 */
public interface RequestSynchroneExtensionEscrowService {

    /**
     * Parse extension parameters (generic method).
     * 
     * @param extensionParams
     *            list of parameters for the extension
     * @return object with array of the parsed parameters
     * @throws RequestNetworkException
     */
    Object parseParameters(List<Object> extensionParams) throws RequestNetworkException;

    /**
     * Release payment to Payee as payer or escrow.
     * 
     * @param requestId
     *            requestId of the request
     * @return response containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    RequestNetworkResponse releaseToPayeeAction(String requestId) throws RequestNetworkException;

    /**
     * Release payment to Payee as payer or escrow.
     * 
     * @param requestId
     *            requestId of the request
     * @param options
     *            options for the method (gasPrice, gas, value, from,
     *            numberOfConfirmation)
     * @return response containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    RequestNetworkResponse releaseToPayeeAction(String requestId, RequestNetworkOptions options)
            throws RequestNetworkException;

    /**
     * Release payment to payer as payee or escrow.
     * 
     * @param requestId
     *            requestId of the request
     * @return response containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    RequestNetworkResponse releaseToPayerAction(String requestId) throws RequestNetworkException;

    /**
     * Release payment to payer as payee or escrow.
     * 
     * @param requestId
     *            requestId of the request
     * @param options
     *            options for the method (gasPrice, gas, value, from,
     *            numberOfConfirmation)
     * @return response containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    RequestNetworkResponse releaseToPayerAction(String requestId, RequestNetworkOptions options)
            throws RequestNetworkException;

    /**
     * Get a request by its requestId. Alias of RequestCoreServices.getRequest().
     * 
     * @param requestId
     *            requestId of the request
     * @return request object
     * @throws RequestNetworkException
     */
    RequestNetworkRequest getRequest(String requestId) throws RequestNetworkException;

    /**
     * Get info from extension contract (generic method).
     * 
     * @param requestId
     *            requestId of the request
     * @return object containing the information from the extension contract of the
     *         request
     * @throws RequestNetworkException
     */
    Object getRequestExtensionInfo(String requestId) throws RequestNetworkException;

    /**
     * Get a request's events. Alias of RequestCoreServices.getRequestEvents().
     * 
     * @param requestId
     *            requestId of the request
     * @return list of events about the request
     * @throws RequestNetworkException
     */
    List<RequestNetworkEvent> getRequestEvents(String requestId) throws RequestNetworkException;

    /**
     * Get a request's events. Alias of RequestCoreServices.getRequestEvents().
     * 
     * @param requestId
     *            requestId of the request
     * @param fromBlock
     *            search events from this block
     * @return list of events about the request
     * @throws RequestNetworkException
     */
    List<RequestNetworkEvent> getRequestEvents(String requestId, int fromBlock) throws RequestNetworkException;

    /**
     * Get a request's events. Alias of RequestCoreServices.getRequestEvents().
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
    List<RequestNetworkEvent> getRequestEvents(String requestId, int fromBlock, int toBlock)
            throws RequestNetworkException;

    /**
     * Get request events from extension contract (generic method).
     * 
     * @param requestId
     *            requestId of the request
     * @return list of events from the extension contract
     * @throws RequestNetworkException
     */
    List<RequestNetworkEvent> getRequestEventsExtensionInfo(String requestId) throws RequestNetworkException;

    /**
     * Get request events from extension contract (generic method).
     * 
     * @param requestId
     *            requestId of the request
     * @param fromBlock
     *            search events from this block
     * @return list of events from the extension contract
     * @throws RequestNetworkException
     */
    List<RequestNetworkEvent> getRequestEventsExtensionInfo(String requestId, int fromBlock)
            throws RequestNetworkException;

    /**
     * Get request events from extension contract (generic method).
     * 
     * @param requestId
     *            requestId of the request
     * @param fromBlock
     *            search events from this block
     * @param toBlock
     *            search events until this block
     * @return list of events from the extension contract
     * @throws RequestNetworkException
     */
    List<RequestNetworkEvent> getRequestEventsExtensionInfo(String requestId, int fromBlock, int toBlock)
            throws RequestNetworkException;

}
