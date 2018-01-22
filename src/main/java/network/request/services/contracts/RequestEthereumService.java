package network.request.services.contracts;

import java.util.List;

import network.request.services.RequestNetworkException;
import network.request.services.entities.RequestNetworkOptions;

/**
 * Interface for the Request Ethereum currency contract.
 */
public interface RequestEthereumService {

    /**
     * Create a request as payee.
     * 
     * @param payer
     *            address of the payer
     * @param amountInitial
     *            amount initial expected of the request
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object createRequestAsPayee(String payer, int amountInitial) throws RequestNetworkException;

    /**
     * Create a request as payee.
     * 
     * @param payer
     *            address of the payer
     * @param amountInitial
     *            amount initial expected of the request
     * @param data
     *            Json of the request's details
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object createRequestAsPayee(String payer, int amountInitial, String data) throws RequestNetworkException;

    /**
     * Create a request as payee.
     * 
     * @param payer
     *            address of the payer
     * @param amountInitial
     *            amount initial expected of the request
     * @param data
     *            Json of the request's details
     * @param extension
     *            address of the extension contract of the request
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object createRequestAsPayee(String payer, int amountInitial, String data, String extension)
            throws RequestNetworkException;

    /**
     * Create a request as payee.
     * 
     * @param payer
     *            address of the payer
     * @param amountInitial
     *            amount initial expected of the request
     * @param data
     *            Json of the request's details
     * @param extension
     *            address of the extension contract of the request
     * @param extensionParams
     *            list of parameters for the extension
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object createRequestAsPayee(String payer, int amountInitial, String data, String extension,
            List<Object> extensionParams) throws RequestNetworkException;

    /**
     * Create a request as payee.
     * 
     * @param payer
     *            address of the payer
     * @param amountInitial
     *            amount initial expected of the request
     * @param data
     *            Json of the request's details
     * @param extension
     *            address of the extension contract of the request
     * @param extensionParams
     *            list of parameters for the extension
     * @param options
     *            options for the method (gasPrice, gas, value, from,
     *            numberOfConfirmation)
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object createRequestAsPayee(String payer, int amountInitial, String data, String extension,
            List<Object> extensionParams, RequestNetworkOptions options) throws RequestNetworkException;

    /**
     * Accept a request as payer.
     * 
     * @param requestId
     *            requestId of the payer
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object accept(String requestId) throws RequestNetworkException;

    /**
     * Accept a request as payer.
     * 
     * @param requestId
     *            requestId of the payer
     * @param options
     *            options for the method (gasPrice, gas, value, from,
     *            numberOfConfirmation)
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object accept(String requestId, RequestNetworkOptions options) throws RequestNetworkException;

    /**
     * Cancel a request as payer or payee.
     * 
     * @param requestId
     *            requestId of the payer
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object cancel(String requestId) throws RequestNetworkException;

    /**
     * Cancel a request as payer or payee.
     * 
     * @param requestId
     *            requestId of the payer
     * @param options
     *            options for the method (gasPrice, gas, value, from,
     *            numberOfConfirmation)
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object cancel(String requestId, RequestNetworkOptions options) throws RequestNetworkException;

    /**
     * Pay a request.
     * 
     * @param requestId
     *            requestId of the payer
     * @param amount
     *            amount to pay in wei
     * @param additionals
     *            additional to declaire in wei
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object paymentAction(String requestId, int amount, int additionals) throws RequestNetworkException;

    /**
     * Pay a request.
     * 
     * @param requestId
     *            requestId of the payer
     * @param amount
     *            amount to pay in wei
     * @param additionals
     *            additional to declaire in wei
     * @param options
     *            options for the method (gasPrice, gas, value, from,
     *            numberOfConfirmation)
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object paymentAction(String requestId, int amount, int additionals, RequestNetworkOptions options) throws RequestNetworkException;

    /**
     * Refund a request as payee.
     * 
     * @param requestId
     *            requestId of the payer
     * @param amount
     *            amount to refund in wei
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object refundAction(String requestId, int amount) throws RequestNetworkException;

    /**
     * Refund a request as payee.
     * 
     * @param requestId
     *            requestId of the payer
     * @param amount
     *            amount to refund in wei
     * @param options
     *            options for the method (gasPrice, gas, value, from,
     *            numberOfConfirmation)
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object refundAction(String requestId, int amount, RequestNetworkOptions options) throws RequestNetworkException;

    /**
     * Add subtracts to a request as payee.
     * 
     * @param requestId
     *            requestId of the payer
     * @param amount
     *            subtract to declare in wei
     * @param options
     *            options for the method (gasPrice, gas, value, from,
     *            numberOfConfirmation)
     * @throws RequestNetworkException
     */
    Object subtractAction(String requestId, int amount) throws RequestNetworkException;

    /**
     * Add subtracts to a request as payee.
     * 
     * @param requestId
     *            requestId of the payer
     * @param amount
     *            subtract to declare in wei
     * @param options
     *            options for the method (gasPrice, gas, value, from,
     *            numberOfConfirmation)
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object subtractAction(String requestId, int amount, RequestNetworkOptions options) throws RequestNetworkException;

    /**
     * Add addtionals to a request as payer.
     * 
     * @param requestId
     *            requestId of the payer
     * @param amount
     *            subtract to declare in wei
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object additionalAction(String requestId, int amount) throws RequestNetworkException;

    /**
     * Add addtionals to a request as payer.
     * 
     * @param requestId
     *            requestId of the payer
     * @param amount
     *            subtract to declare in wei
     * @param options
     *            options for the method (gasPrice, gas, value, from,
     *            numberOfConfirmation)
     * @return object containing the request and the transaction hash
     * @throws RequestNetworkException
     */
    Object additionalAction(String requestId, int amount, RequestNetworkOptions options) throws RequestNetworkException;

    /**
     * Get info from currency contract (generic method).
     * 
     * @param requestId
     *            requestId of the request
     * @return information from the currency contract of the request
     * @throws RequestNetworkException
     */
    Object getRequestCurrencyContractInfo(String requestId) throws RequestNetworkException;

    /**
     * Get a request by its requestId. Alias of RequestCoreService.getRequest().
     * 
     * @param requestId
     *            requestId of the request
     * @return the object containing the request
     * @throws RequestNetworkException
     */
    Object getRequest(String requestId) throws RequestNetworkException;

    /**
     * Get a request's events. Alias of requestCoreServices.getRequestEvents().
     * 
     * @param requestId
     *            requestId of the request
     * @return list of events about the request
     * @throws RequestNetworkException
     */
    List<Object> getRequestEvents(String requestId) throws RequestNetworkException;

    /**
     * Get a request's events. Alias of requestCoreServices.getRequestEvents().
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
     * Get a request's events. Alias of requestCoreServices.getRequestEvents().
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
     * Decode data from input tx (generic method).
     * 
     * @param data
     * @return object with the name of the function and the parameters
     * @throws RequestNetworkException
     */
    Object decodeInputData(String data) throws RequestNetworkException;

    /**
     * Generate web3 method of the contract from name and parameters in array.
     * (generic method)
     * 
     * @param name
     * @param parameters
     * @return
     * @throws RequestNetworkException
     */
    Object generateWeb3Method(String name, List<Object> parameters) throws RequestNetworkException;

    /**
     * Get request events from currency contract (generic method).
     * 
     * @param requestId
     *            requestId of the request
     * @return object containing the events from the currency contract of the
     *         request
     * @throws RequestNetworkException
     */
    Object getRequestEventsCurrencyContractInfo(String requestId) throws RequestNetworkException;

    /**
     * Get request events from currency contract (generic method).
     * 
     * @param requestId
     *            requestId of the request
     * @param fromBlock
     *            search events from this block
     * @return object containing the events from the currency contract of the
     *         request
     * @throws RequestNetworkException
     */
    Object getRequestEventsCurrencyContractInfo(String requestId, int fromBlock) throws RequestNetworkException;

    /**
     * Get request events from currency contract (generic method).
     * 
     * @param requestId
     *            requestId of the request
     * @param fromBlock
     *            search events from this block
     * @param toBlock
     *            search events until this block
     * @return object containing the events from the currency contract of the
     *         request
     * @throws RequestNetworkException
     */
    Object getRequestEventsCurrencyContractInfo(String requestId, int fromBlock, int toBlock)
            throws RequestNetworkException;

}
