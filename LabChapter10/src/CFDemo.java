//CFDemo.java
// Carter Freeze
// 4/16/22
// Demonstration of classes built around the CF_BJEmployee class

public class CFDemo {

    public static void main(String[] args) {
        CF_BJEmployee listOfEmployees[] = 
        {
            new CFOwner("Carter Freeze", "09/30/2015", "001-A", 250000, 1.0),
            new CFShiftSupervisor(50000, 1000, "McKenna Monetz", "04/21/2018", "012-B"),
            new CFShiftSupervisor(50000, 1000, "Nathan Painter", "06/07/2020", "905-L"),
            new CF_BJTeamLeader("Alice"),
            new CF_BJTeamLeader("Bob"),
            new CF_BJProductionWorker(1, 15.00, "Charlie", "09/30/2015", "141-C"),
            new CF_BJEmployee("Dennis", "09/30/2015", "142-D")
        };

        for (CF_BJEmployee employee : listOfEmployees) {
            System.out.println(employee);
        }
    }

    
}
