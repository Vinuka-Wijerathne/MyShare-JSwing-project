/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author issur
 */
public class OrderController {
    
    Order orderObj;
    public Order addOrder(int orderId, String customerName, String customerTelephone, String customerEmail, int employeeId, String adObjective, String adTargetAudience, int startDate, int endDate, String bannerSize, int quantity, String bannerDescription, String artworkType, String artworkDescription,  double totalPrice){
        orderObj = new Order(customerName, customerTelephone, customerEmail, employeeId, adObjective, adTargetAudience, startDate, endDate, bannerSize, quantity, bannerDescription, artworkType, artworkDescription, totalPrice);
        return orderObj;
    }
}
