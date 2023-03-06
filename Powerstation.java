public class Customer {
    private String name;
    private String address;
    private String phone;

    public Customer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

public class ElectricityBill extends Customer {
    private int units;
    private double rate;

    public ElectricityBill(String name, String address, String phone, int units, double rate) {
        super(name, address, phone);
        this.units = units;
        this.rate = rate;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculateBillAmount() {
        return units * rate;
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill("John Doe", "123 Main St", "555-1234", 100, 0.15);
        System.out.println("Customer name: " + bill.getName());
        System.out.println("Address: " + bill.getAddress());
        System.out.println("Phone number: " + bill.getPhone());
        System.out.println("Units consumed: " + bill.getUnits());
        System.out.println("Rate per unit: " + bill.getRate());
        System.out.println("Bill amount: $" + bill.calculateBillAmount());
    }
}
