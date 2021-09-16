
/**
 * A software program for microsoft product to activated license for user company.
 *
 * @author (Sachin Budha Magar)
 * @version (0.1)
 */
public class MicrosoftProduct
{
   private static int ProductNo;
   private String ProductName;
   private String ActivationKey;
   private float PriceOfProduct;
   public MicrosoftProduct(String ProductName, int ProductNo){
    this.ProductName=ProductName;
    this.ProductNo=ProductNo;
    this.ActivationKey="";
    this.PriceOfProduct++;
   }
    
   public static int getProductNo(){
        return ProductNo;
   }
   public String getProductName(){
        return ProductName;
   }
   public String getActivationKey(){
        return ActivationKey;
   }
   public float getPriceOfProduct(){
        return PriceOfProduct;
   }
    
   public void setActivationKey(String ActivationKey){
       this.ActivationKey=ActivationKey;
   }
   public void setPriceOfProduct(float PriceOfProduct){
       this.PriceOfProduct=PriceOfProduct;
   }
   
   public void productDetails(){
        System.out.println("ProductNo.: "+ProductNo);
        System.out.println("Product Name: "+ProductName);
    if(!ActivationKey.equals("")){     
        System.out.println("Activation Key: "+ActivationKey);
        if(PriceOfProduct !=0){ 
            System.out.println("Total price of the product: "+PriceOfProduct);
        }
    }
   }
   abstract class ProductGUI{
      public abstract void ProductGUI();
   }
}
