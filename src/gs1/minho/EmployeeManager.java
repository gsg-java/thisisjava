package gs1.minho;

import gs1.minho.controller.Controller;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 6. 8..
 */
public class EmployeeManager {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.run();
    }

    private void run() {
        Controller controller = new Controller();
        controller.start();
    }
}
