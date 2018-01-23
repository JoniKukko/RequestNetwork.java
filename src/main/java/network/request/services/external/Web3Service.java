package network.request.services.external;

import java.util.List;

import network.request.services.entities.RequestNetworkException;
import network.request.services.entities.RequestNetworkOptions;

/**
 * Interface for Web3
 */
public interface Web3Service {

    /**
     * Send a web3 method
     * 
     * @param method
     *            the method to send
     * @param callbackTransactionHash
     *            callback when the transaction is submitted
     * @param callbackTransactionReceipt
     *            callback when the transacton is mined (0 confirmation block)
     * @param callbackTransactionConfirmation
     *            callback when a new confirmation block is mined (up to 20)
     * @param callbackTransactionError
     *            callback when an error occured
     * @throws RequestNetworkException
     */
    void broadcastMethod(Object method, Object callbackTransactionHash, Object callbackTransactionReceipt,
            Object callbackTransactionConfirmation, Object callbackTransactionError) throws RequestNetworkException;

    /**
     * Send a web3 method
     * 
     * @param method
     *            the method to send
     * @param callbackTransactionHash
     *            callback when the transaction is submitted
     * @param callbackTransactionReceipt
     *            callback when the transacton is mined (0 confirmation block)
     * @param callbackTransactionConfirmation
     *            callback when a new confirmation block is mined (up to 20)
     * @param callbackTransactionError
     *            callback when an error occured
     * @param options
     *            options for the method
     * @throws RequestNetworkException
     */
    void broadcastMethod(Object method, Object callbackTransactionHash, Object callbackTransactionReceipt,
            Object callbackTransactionConfirmation, Object callbackTransactionError, RequestNetworkOptions options)
            throws RequestNetworkException;

    /**
     * Send a web3 method
     * 
     * @param method
     *            the method to call()
     * @param options
     *            options for the method
     * @return
     * @throws RequestNetworkException
     */
    Object callMethod(Object method, RequestNetworkOptions options) throws RequestNetworkException;

    /**
     * Get the default account (account[0] of the wallet)
     * 
     * @return the default account
     * @throws RequestNetworkException
     */
    Object getDefaultAccount() throws RequestNetworkException;

    /**
     * Get the default account (account[0] of the wallet) With a callback
     * 
     * @param callback
     *            callback with the default account
     * @return the default account
     * @throws RequestNetworkException
     */
    Object getDefaultAccountCallback(Object callback) throws RequestNetworkException;

    /**
     * Convert a value in solidity bytes32 string
     * 
     * @param type
     *            type of the value to convert (e.g: address, uint, int etc...)
     * @param value
     *            value to convert
     * @return solidity like bytes32 string
     * @throws RequestNetworkException
     */
    String toSolidityBytes32(String type, Object value) throws RequestNetworkException;

    /**
     * Convert list to an list of solidity bytes32 string
     * 
     * @param data
     *            data to convert
     * @return list of solidity like bytes32 strings
     * @throws RequestNetworkException
     */
    List<String> listToBytes32(List<Object> data) throws RequestNetworkException;

    /**
     * Check if an address is valid (ignoring case)
     * 
     * @param address
     *            address to check
     * @return true if address is valid
     * @throws RequestNetworkException
     */
    boolean isAddressNoChecksum(String address) throws RequestNetworkException;

    /**
     * Check if two addresses are equals (ignoring case)
     * 
     * @param address1
     *            address to check
     * @param address2
     *            address to check
     * @return true if _address1 is the same as _address2
     * @throws RequestNetworkException
     */
    boolean areSameAddressesNoChecksum(String address1, String address2) throws RequestNetworkException;

    /**
     * Check if a string is a bytes32
     * 
     * @param hex
     *            string to check
     * @return true if _hex is a bytes32
     * @throws RequestNetworkException
     */
    boolean isHexStrictBytes32(String hex) throws RequestNetworkException;

    /**
     * Generate web3 method
     * 
     * @param contractInstance
     *            contract instance
     * @param name
     *            method's name
     * @param parameters
     *            method's _parameters
     * @return return a web3 method object
     * @throws RequestNetworkException
     */
    Object generateWeb3Method(Object contractInstance, String name, List<Object> parameters)
            throws RequestNetworkException;

    /**
     * Decode transaction input data
     * 
     * @param abi
     *            abi of the contract
     * @param data
     *            input data
     * @return object with the method name and parameters
     * @throws RequestNetworkException
     */
    Object decodeInputData(List<Object> abi, String data) throws RequestNetworkException;

    /**
     * Decode transaction log parameters
     * 
     * @param abi
     *            abi of the contract
     * @param event
     *            event name
     * @param log
     *            log to decode
     * @return object with the log decoded
     * @throws RequestNetworkException
     */
    Object decodeTransactionLog(List<Object> abi, String event, Object log) throws RequestNetworkException;

    /**
     * Decode transaction event parameters
     * 
     * @param abi
     *            abi of the contract
     * @param eventName
     *            event name
     * @param event
     *            event to decode
     * @return object with the event decoded
     * @throws RequestNetworkException
     */
    Object decodeEvent(List<Object> abi, String eventName, Object event) throws RequestNetworkException;

    /**
     * Get Transaction Receipt
     * 
     * @param hash
     *            transaction hash
     * @return transaction receipt
     * @throws RequestNetworkException
     */
    Object getTransactionReceipt(String hash) throws RequestNetworkException;

    /**
     * Get Transaction
     * 
     * @param hash
     *            transaction hash
     * @return transaction
     * @throws RequestNetworkException
     */
    Object getTransaction(String hash) throws RequestNetworkException;

    /**
     * Get timestamp of a block
     * 
     * @param blockNumber
     *            number of the block
     * @return timestamp of a blocks
     * @throws RequestNetworkException
     */
    Object getBlockTimestamp(int blockNumber) throws RequestNetworkException;

}
