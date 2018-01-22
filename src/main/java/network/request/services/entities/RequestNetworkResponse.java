package network.request.services.entities;

public class RequestNetworkResponse {

    private final RequestNetworkRequest request;
    private final String transactionHash;

    public RequestNetworkResponse(RequestNetworkRequest request, String transactionHash) {
        this.request = request;
        this.transactionHash = transactionHash;
    }

    public RequestNetworkRequest getRequest() {
        return request;
    }

    public String getTransactionHash() {
        return transactionHash;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((request == null) ? 0 : request.hashCode());
        result = prime * result + ((transactionHash == null) ? 0 : transactionHash.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof RequestNetworkResponse))
            return false;
        RequestNetworkResponse other = (RequestNetworkResponse) obj;
        if (request == null) {
            if (other.request != null)
                return false;
        } else if (!request.equals(other.request))
            return false;
        if (transactionHash == null) {
            if (other.transactionHash != null)
                return false;
        } else if (!transactionHash.equals(other.transactionHash))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RequestNetworkResponse [request=" + request + ", transactionHash=" + transactionHash + "]";
    }
}
