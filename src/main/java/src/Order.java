package src;

public class Order {
//    private int orderId;
    private String customerName;
    private String customerTelephone;
    private String customerEmail;
    private int employeeId;
    private String adObjective;
    private String adTargetAudience;
    private int startDate;
    private int endDate;
    private String bannerSize;
    private int quantity;
    private String bannerDescription;
    private String artworkType;
    private String artworkDescription;
    private double totalPrice;

    // Constructor
    public Order(String customerName, String customerTelephone, String customerEmail, int employeeId, String adObjective, String adTargetAudience, int startDate, int endDate, String bannerSize, int quantity, String bannerDescription, String artworkType, String artworkDescription,  double totalPrice) {
        
        this.customerName = customerName;
        this.customerTelephone = customerTelephone;
        this.customerEmail = customerEmail;
        this.employeeId = employeeId;
        this.adObjective = adObjective;
        this.adTargetAudience = adTargetAudience;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bannerSize = bannerSize;
        this.quantity = quantity;
        this.bannerDescription = bannerDescription;
        this.artworkType = artworkType;
        this.artworkDescription = artworkDescription;
        this.totalPrice = totalPrice;
    }

    // Getters and Setter

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerTelephone() {
        return customerTelephone;
    }

    public void setCustomerTelephone(String customerTelephone) {
        this.customerTelephone = customerTelephone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getAdObjective() {
        return adObjective;
    }

    public void setAdObjective(String adObjective) {
        this.adObjective = adObjective;
    }

    public String getAdTargetAudience() {
        return adTargetAudience;
    }

    public void setAdTargetAudience(String adTargetAudience) {
        this.adTargetAudience = adTargetAudience;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getBannerSize() {
        return bannerSize;
    }

    public void setBannerSize(String bannerSize) {
        this.bannerSize = bannerSize;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBannerDescription() {
        return bannerDescription;
    }

    public void setBannerDescription(String bannerDescription) {
        this.bannerDescription = bannerDescription;
    }

    public String getArtworkType() {
        return artworkType;
    }

    public void setArtworkType(String artworkType) {
        this.artworkType = artworkType;
    }

    public String getArtworkDescription() {
        return artworkDescription;
    }

    public void setArtworkDescription(String artworkDescription) {
        this.artworkDescription = artworkDescription;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
