/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author issur
 */
public class Controller {
    
    Employee empObj;
    Supplier supObj;
    Inventory invObj;
    
    
    public Employee addeEmployee(String empName, String empNIC, String gender, String address, String password, String TP, double salary, String role){
        empObj = new Employee(empName, empNIC, gender, address, password, TP, salary, role);
        return empObj;
    }
    
    public Supplier addSupplier(String name, String telephone, String address, String gender, String email, String orders){
        supObj = new Supplier(name, telephone, address, gender, email, orders);
        return supObj;
    }
    
    public Inventory addInventory(String itemName, int quantity, double unitPrice, double totalPrice){
        invObj = new Inventory(itemName, quantity, unitPrice, totalPrice);
        return invObj;
    }
    
}


