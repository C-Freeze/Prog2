// CFTeamDemo.java
// 3/29/2022
// Carter Freeze
// Demo of a Team Leader
public class CFTeamDemo {
    public static void main(String[] args) {
        // Create a ProductionWorker object
        CFTeamLeader worker = new CFTeamLeader("Steve", 1, 20.00, 1000, 60);

        // Display the object
        System.out.println(worker);
    }
}
