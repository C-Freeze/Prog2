// CFEmpProdDemo.java
// 3/29/2022
// Carter Freeze
// Demo of a Production Worker
public class CFEmpProdDemo {
    public static void main(String[] args) {
        // Create a ProductionWorker object
        CFProductionWorker worker = new CFProductionWorker("Bob", 1, 20.00);

        // Display the object
        System.out.println(worker);
    }
}
