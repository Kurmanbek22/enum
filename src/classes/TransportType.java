package classes;

public abstract class TransportType {
    private enums.TransportType transportType;

    private double fare;

    public TransportType() {
    }

    public TransportType(enums.TransportType transportType, double fare) {
        this.transportType = transportType;
        this.fare = fare;
    }

    public enums.TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(enums.TransportType transportType) {
        this.transportType = transportType;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "TransportType{" +
                "transportType=" + transportType +
                ", fare=" + fare +
                '}';
    }
}

