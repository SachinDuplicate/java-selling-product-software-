/**
 * A sub class program of microsoft product that change pricePerUser, activate and terminate licensce for user company.
 *
 * @author (Sachin Budha Magar)
 * @version (0.1)
 */
public class EnterpriseEdition extends MicrosoftProduct
{
  private String clientCompanyName;   
  private float pricePerUser;   
  private static int numberOfUser;  
  private String activationDate;  
  private String licenseExpireDate;  
  private boolean isActivated;   
  private boolean isExpired;
  public EnterpriseEdition(int productNo, String productName, float pricePerUser){
    super(productName,productNo);
    this.pricePerUser=pricePerUser;
    this.numberOfUser=0;
    this.activationDate="";
    this.licenseExpireDate="";
    this.isActivated=false;
    this.isExpired=false;
    this.clientCompanyName="";
  }
  
  public float getPricePerUser(){
    return pricePerUser;
  }
  public static int getNumberOfUser(){
    return numberOfUser;
  }
  public String getActivationDate(){
    return activationDate;
  }
  public String getlicenseExpireDate(){
    return licenseExpireDate;
   }
  public boolean getIsActivated(){
    return isActivated;
  }
  public boolean getIsExpired(){
    return isExpired;
   }
  public String getClientCompanyName(){
    return clientCompanyName;
   }

   public void setPricePerUser(float pricePerUser){
     if(isActivated==true){ 
        System.out.println("Sorry license has been activated so, price per user can't changed now");
     }else{ 
        this.pricePerUser=pricePerUser;
     }
   }    
  public void activeLicense(String clientCompanyName, int numberOfUser, String activationDate, String licenseExpireDate, String activationKey){
    if(isActivated==true){ 
      System.out.println("License has been already activated");
      System.out.println("Client name of company: "+clientCompanyName);
      System.out.println("Total no. of user: "+numberOfUser);
    }else{   
      this.clientCompanyName=clientCompanyName;
      this.numberOfUser=numberOfUser;
      this.activationDate=activationDate;
      this.licenseExpireDate=licenseExpireDate;
      this.pricePerUser=pricePerUser; 
      this.isActivated=true;
      this.isExpired=false;
      super.setActivationKey(activationKey);
      float totalPrice=numberOfUser*pricePerUser;
      super.setPriceOfProduct(totalPrice);
      System.out.println("License has been successfully activated");
    }
  }
    
  public void terminateLicense(){
      if(isActivated==true){ 
          this.clientCompanyName="";  
          this.numberOfUser=0;
          this.activationDate="";
          this.licenseExpireDate="";
          super.setPriceOfProduct(0);
          super.setActivationKey("");
          this.isExpired= true;
          this.isActivated=false;
          System.out.println("License has been terminated successfully");        
      }else{ 
          System.out.println("License is already expired.");
        }
    }
    
  public void productDetails(){
    super.productDetails();
    System.out.println("Price per user: "+pricePerUser);
     if(isActivated==true){ 
       System.out.println("Name of client: "+clientCompanyName);
       System.out.println("Total no. of user: "+numberOfUser);
       System.out.println("Activation date of license: "+activationDate);
       System.out.println("Expire date of license: "+licenseExpireDate);       
      }
  }

}
