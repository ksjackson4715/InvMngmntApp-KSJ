package Main;

public class Inventory {
    //variables for Parts Table
    private int PartID;
    public int getPartID() { return PartID; }
    public void setPartID(int num) { this.PartID = PartID; }
    private String PartName;
    public String getPartName() { return PartName; }
    public void setPartName(String name) { this.PartName = PartName; }
    private int Inventory;
    public int getInventory() { return Inventory; }
    public void setInventory(int num) { this.Inventory = Inventory; }
    private double Price;
    public double getPrice() { return Price; }
    public void setPrice(double price) { this.Price = Price; }
    private int Min;
    public int getMin() { return Min; }
    public void setMin(int quantity) { this.Min = Min; }
    private int Max;
    public int getMax() { return Max; }
    public void setMax(int quantity) { this.Max = Max; }

    //variables for Products Table
    //need to add the variable for associatedParts:Observable List
    private int ProductID;
    public int getProductID() { return ProductID; }
    public void setProductID(int num) { this.ProductID = ProductID; }
    private String ProductName;
    public String getProductName() { return ProductName; }
    public void setProductName(String name) { this.ProductName = ProductName; }
    
    public static void main(String[] args) {
        launch(args);
    }

    private static void launch(String[] args) {
    }

}