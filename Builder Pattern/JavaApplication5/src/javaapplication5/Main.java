public class Main {
    public static void main(String[] args) {
        // Basic configuration
        Computer basicPC = new Computer.Builder("Intel i5", "8GB").build();

        // Gaming configuration
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setStorage("1TB SSD")
                .setWifiCard("Intel AX200")
                .build();

        // Office configuration
        Computer officePC = new Computer.Builder("AMD Ryzen 5", "16GB")
                .setStorage("512GB SSD")
                .build();

        // Display configurations
        System.out.println("Basic PC: " + basicPC);
        System.out.println("Gaming PC: " + gamingPC);
        System.out.println("Office PC: " + officePC);
    }
}
