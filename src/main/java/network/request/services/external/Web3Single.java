package network.request.services.external;

import java.util.List;

import network.request.services.entities.RequestNetworkException;
import network.request.services.entities.RequestNetworkOptions;

final class Web3Single implements Web3Service {

    Web3Single(Object web3Provider, int networkId) {
    }

    /*
     * (non-Javadoc)
     * 
     * @see network.request.services.external.Web3Service#broadcastMethod(java.lang.
     * Object, java.lang.Object, java.lang.Object, java.lang.Object,
     * java.lang.Object)
     */
    @Override
    public void broadcastMethod(Object method, Object callbackTransactionHash, Object callbackTransactionReceipt,
            Object callbackTransactionConfirmation, Object callbackTransactionError) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see network.request.services.external.Web3Service#broadcastMethod(java.lang.
     * Object, java.lang.Object, java.lang.Object, java.lang.Object,
     * java.lang.Object, network.request.services.entities.RequestNetworkOptions)
     */
    @Override
    public void broadcastMethod(Object method, Object callbackTransactionHash, Object callbackTransactionReceipt,
            Object callbackTransactionConfirmation, Object callbackTransactionError, RequestNetworkOptions options)
            throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * network.request.services.external.Web3Service#callMethod(java.lang.Object,
     * network.request.services.entities.RequestNetworkOptions)
     */
    @Override
    public Object callMethod(Object method, RequestNetworkOptions options) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see network.request.services.external.Web3Service#getDefaultAccount()
     */
    @Override
    public Object getDefaultAccount() throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * network.request.services.external.Web3Service#getDefaultAccountCallback(java.
     * lang.Object)
     */
    @Override
    public Object getDefaultAccountCallback(Object callback) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * network.request.services.external.Web3Service#toSolidityBytes32(java.lang.
     * String, java.lang.Object)
     */
    @Override
    public String toSolidityBytes32(String type, Object value) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * network.request.services.external.Web3Service#listToBytes32(java.util.List)
     */
    @Override
    public List<String> listToBytes32(List<Object> data) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * network.request.services.external.Web3Service#isAddressNoChecksum(java.lang.
     * String)
     */
    @Override
    public boolean isAddressNoChecksum(String address) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * network.request.services.external.Web3Service#areSameAddressesNoChecksum(java
     * .lang.String, java.lang.String)
     */
    @Override
    public boolean areSameAddressesNoChecksum(String address1, String address2) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * network.request.services.external.Web3Service#isHexStrictBytes32(java.lang.
     * String)
     */
    @Override
    public boolean isHexStrictBytes32(String hex) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * network.request.services.external.Web3Service#generateWeb3Method(java.lang.
     * Object, java.lang.String, java.util.List)
     */
    @Override
    public Object generateWeb3Method(Object contractInstance, String name, List<Object> parameters)
            throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * network.request.services.external.Web3Service#decodeInputData(java.util.List,
     * java.lang.String)
     */
    @Override
    public Object decodeInputData(List<Object> abi, String data) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * network.request.services.external.Web3Service#decodeTransactionLog(java.util.
     * List, java.lang.String, java.lang.Object)
     */
    @Override
    public Object decodeTransactionLog(List<Object> abi, String event, Object log) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * network.request.services.external.Web3Service#decodeEvent(java.util.List,
     * java.lang.String, java.lang.Object)
     */
    @Override
    public Object decodeEvent(List<Object> abi, String eventName, Object event) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * network.request.services.external.Web3Service#getTransactionReceipt(java.lang
     * .String)
     */
    @Override
    public Object getTransactionReceipt(String hash) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see network.request.services.external.Web3Service#getTransaction(java.lang.
     * String)
     */
    @Override
    public Object getTransaction(String hash) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    /*
     * (non-Javadoc)
     * 
     * @see network.request.services.external.Web3Service#getBlockTimestamp(int)
     */
    @Override
    public Object getBlockTimestamp(int blockNumber) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }
}
