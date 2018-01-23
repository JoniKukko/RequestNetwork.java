package network.request.services;

import java.util.List;

import network.request.services.entities.RequestNetworkException;
import network.request.services.entities.RequestNetworkOptions;
import network.request.services.external.Web3Service;

enum Web3Singleton implements Web3Service {
    INSTANCE;

    private Object provider;
    private int networkId;

    void init(Object provider, int networkId) {
        this.provider = provider;
        this.networkId = networkId;
    }

    @Override
    public void broadcastMethod(Object method, Object callbackTransactionHash, Object callbackTransactionReceipt,
            Object callbackTransactionConfirmation, Object callbackTransactionError) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void broadcastMethod(Object method, Object callbackTransactionHash, Object callbackTransactionReceipt,
            Object callbackTransactionConfirmation, Object callbackTransactionError, RequestNetworkOptions options)
            throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object callMethod(Object method, RequestNetworkOptions options) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getDefaultAccount() throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getDefaultAccountCallback(Object callback) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toSolidityBytes32(String type, Object value) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> listToBytes32(List<Object> data) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isAddressNoChecksum(String address) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean areSameAddressesNoChecksum(String address1, String address2) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isHexStrictBytes32(String hex) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object generateWeb3Method(Object contractInstance, String name, List<Object> parameters)
            throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object decodeInputData(List<Object> abi, String data) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object decodeTransactionLog(List<Object> abi, String event, Object log) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object decodeEvent(List<Object> abi, String eventName, Object event) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getTransactionReceipt(String hash) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getTransaction(String hash) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getBlockTimestamp(int blockNumber) throws RequestNetworkException {
        throw new UnsupportedOperationException();
    }
}
