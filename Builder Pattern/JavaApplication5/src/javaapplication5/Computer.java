public class Computer {
    // Required attributes
    private String CPU;
    private String RAM;
    
    // Optional attributes
    private String storage;
    private String graphicsCard;
    private String wifiCard;

    // Private constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.wifiCard = builder.wifiCard;
    }

    // Getters for demonstration (optional)
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM +
               ", Storage=" + storage + ", GraphicsCard=" + graphicsCard +
               ", WifiCard=" + wifiCard + "]";
    }

    // Static nested Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private String wifiCard;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setWifiCard(String wifiCard) {
            this.wifiCard = wifiCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
