package network.request.services.entities;

/**
 * Class presenting options for the Request Network
 */
public class RequestNetworkOptions {

    /**
     * Static builder for Request Network options
     */
    public static class Builder {
        private int gasPrice;
        private int gas;
        private int value;
        private int from;
        private int numberOfConfirmations;

        public Builder setGasPrice(int gasPrice) {
            this.gasPrice = gasPrice;
            return this;
        }

        public Builder setGas(int gas) {
            this.gas = gas;
            return this;
        }

        public Builder setValue(int value) {
            this.value = value;
            return this;
        }

        public Builder setFrom(int from) {
            this.from = from;
            return this;
        }

        public Builder setNumberOfConfirmations(int numberOfConfirmations) {
            this.numberOfConfirmations = numberOfConfirmations;
            return this;
        }

        public RequestNetworkOptions build() {
            return new RequestNetworkOptions(gasPrice, gas, value, from, numberOfConfirmations);
        }
    }

    private final int gasPrice;
    private final int gas;
    private final int value;
    private final int from;
    private final int numberOfConfirmations;

    private RequestNetworkOptions(int gasPrice, int gas, int value, int from, int numberOfConfirmations) {
        this.gasPrice = gasPrice;
        this.gas = gas;
        this.value = value;
        this.from = from;
        this.numberOfConfirmations = numberOfConfirmations;
    }

    public int getGasPrice() {
        return gasPrice;
    }

    public int getGas() {
        return gas;
    }

    public int getValue() {
        return value;
    }

    public int getFrom() {
        return from;
    }

    public int getNumberOfConfirmations() {
        return numberOfConfirmations;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + from;
        result = prime * result + gas;
        result = prime * result + gasPrice;
        result = prime * result + numberOfConfirmations;
        result = prime * result + value;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof RequestNetworkOptions))
            return false;
        RequestNetworkOptions other = (RequestNetworkOptions) obj;
        if (from != other.from)
            return false;
        if (gas != other.gas)
            return false;
        if (gasPrice != other.gasPrice)
            return false;
        if (numberOfConfirmations != other.numberOfConfirmations)
            return false;
        if (value != other.value)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RequestNetworkOptions [gasPrice=" + gasPrice + ", gas=" + gas + ", value=" + value + ", from=" + from
                + ", numberOfConfirmations=" + numberOfConfirmations + "]";
    }
}
