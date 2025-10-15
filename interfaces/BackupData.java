import java.io.Serializable;

class CustomerData implements Serializable {
    String name;
    int age;

    CustomerData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class TestBackup {
    public static void main(String[] args) {
        CustomerData customer = new CustomerData("Alice", 30);
        System.out.println("Customer data ready for backup: " + customer.name);
    }
}
