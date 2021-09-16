/**
 * A program that uses all methods of MicrosoftProduct and EnterpriseEdition to set new pricePerUser, activate and 
  terminate license of product through GUI.
 *
 * @author (Sachin Budha Magar)
 * @version (0.1)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Color;
public class ProductGUI implements ActionListener, KeyListener {
    JFrame frame;
    JLabel labelTitle1,labelTitle2,labelTitle3,labelTitle4,
    labelProductNo,labelProductName,labelTotalPrice,labelClientCompanyName,labelActivationDate,
    labelLicenseExpireDate,labelActivationKey,labelNumberOfUser,labelPricePerUser,labelPricePerUser1,labelProductNo1,
    labelProductNo2,labelProductNo3;
    JTextField
    txtProductNo,txtProductName,txtTotalPrice,txtClientCompanyName,txtNumberOfUser,
    txtPricePerUser,txtPricePerUser1,txtActivationDate,txtLicenseExpireDate,txtActivationKey,
    txtProductNo1,txtProductNo2,txtProductNo3;
    JButton buttonAdd,activeLicense,buttonTerminate,buttonSetPrice,buttonDisplay,buttonClear;
    ArrayList<MicrosoftProduct> list=new ArrayList<MicrosoftProduct>();
  
    public ProductGUI(){
          frame=new JFrame("Details of Microsoft Product ");
          frame.setLayout(null);
          frame.setSize(900,750);
          frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
          frame.setVisible(true);
          
          labelTitle1=new JLabel("Section For Product Addation");
          labelTitle1.setBounds(650,30,300,20);
          frame.add(labelTitle1);
          
          labelProductNo=new JLabel("Product no.:");
          labelProductNo.setBounds(100,100,200,25);
          frame.add(labelProductNo);
              
          txtProductNo=new JTextField();
          txtProductNo.setBounds(200,100,200,30);
          frame.add(txtProductNo);
              
          labelProductName=new JLabel("Name of the product:");
          labelProductName.setBounds(850,100,200,25);
          frame.add(labelProductName);
          
          txtProductName= new JTextField();
          txtProductName.setBounds(1000,100,200,30);
          frame.add(txtProductName);
          
          labelPricePerUser=new JLabel("Price per users:");
          labelPricePerUser.setBounds(450,160,200,25);
          frame.add(labelPricePerUser);
          
          txtPricePerUser=new JTextField();
          txtPricePerUser.setBounds(600,160,200,30);
          frame.add(txtPricePerUser);
          
          buttonAdd=new JButton("Add");
          buttonAdd.setBounds(600,200,150,30);
          frame.add(buttonAdd);
          buttonAdd.addActionListener(this);
          
          labelTitle2=new JLabel("For License Activation");
          labelTitle2.setBounds(670,240,200,30);
          frame.add(labelTitle2);
          
          labelProductNo1=new JLabel("Product no. :");
          labelProductNo1.setBounds(100,280,200,25);
          frame.add(labelProductNo1);
          
          txtProductNo1=new JTextField();
          txtProductNo1.setBounds(200,280,200,30);
          frame.add(txtProductNo1);
          
          labelClientCompanyName=new JLabel("Name of the company client:");
          labelClientCompanyName.setBounds(850,280,200,25);
          frame.add(labelClientCompanyName);
              
          txtClientCompanyName=new JTextField();
          txtClientCompanyName.setBounds(1020,280,200,30);
          frame.add(txtClientCompanyName);
          
          labelNumberOfUser=new JLabel("No. of users:");
          labelNumberOfUser.setBounds(100,320,200,25);
          frame.add(labelNumberOfUser);
          
          txtNumberOfUser=new JTextField();
          txtNumberOfUser.setBounds(200,320,200,30);
          frame.add(txtNumberOfUser);
              
          labelActivationDate=new JLabel("Activation date of license:");
          labelActivationDate.setBounds(850,320,200,25);
          frame.add(labelActivationDate);
              
          txtActivationDate=new JTextField();
          txtActivationDate.setBounds(1020,320,200,30);
          frame.add(txtActivationDate);
              
          labelLicenseExpireDate=new JLabel("Expire date of license:");
          labelLicenseExpireDate.setBounds(850,360,200,25);
          frame.add(labelLicenseExpireDate);
              
          txtLicenseExpireDate=new JTextField();
          txtLicenseExpireDate.setBounds(1020,360,200,30);
          frame.add(txtLicenseExpireDate);
              
          labelActivationKey=new JLabel("Activation key");
          labelActivationKey.setBounds(100,360,200,25);
          frame.add(labelActivationKey);
              
          txtActivationKey=new JTextField();
          txtActivationKey.setBounds(200,360,200,30);
          frame.add(txtActivationKey);
          
          labelTotalPrice=new JLabel("Total Price :");
          labelTotalPrice.setBounds(550,400,200,25);
          frame.add(labelTotalPrice);
              
          txtTotalPrice=new JTextField();
          txtTotalPrice.setBounds(640,400,200,30);
          frame.add(txtTotalPrice);
          txtTotalPrice.setEditable(false);  
          
          activeLicense=new JButton("Activate License");
          activeLicense.setBounds(625,440,150,30);
          frame.add(activeLicense);
          activeLicense.addActionListener(this);
          
          labelTitle3=new JLabel("To Terminate License");
          labelTitle3.setBounds(180,480,200,30);
          frame.add(labelTitle3);
          
          labelProductNo2=new JLabel("Product no. :");
          labelProductNo2.setBounds(100,520,200,25);
          frame.add(labelProductNo2);
          
          txtProductNo2=new JTextField();
          txtProductNo2.setBounds(200,520,200,30);
          frame.add(txtProductNo2);      
          
          buttonTerminate=new JButton("Terminate License");
          buttonTerminate.setBounds(180,560,150,30);
          frame.add(buttonTerminate);
          buttonTerminate.addActionListener(this);
          
          labelTitle4=new JLabel("To Declare Price");
          labelTitle4.setBounds(670,600,200,30);
          frame.add(labelTitle4);
          
          labelProductNo3=new JLabel("Product no.:");
          labelProductNo3.setBounds(100,640,200,25);
          frame.add(labelProductNo3);
          
          txtProductNo3=new JTextField();
          txtProductNo3.setBounds(200,640,200,30);
          frame.add(txtProductNo3);
          
          labelPricePerUser1=new JLabel("Price per user:");
          labelPricePerUser1.setBounds(850,640,200,25);
          frame.add(labelPricePerUser1);
          
          txtPricePerUser1=new JTextField();
          txtPricePerUser1.setBounds(1020,640,200,30);
          frame.add(txtPricePerUser1);
          
          buttonSetPrice=new JButton("Set price per user");
          buttonSetPrice.setBounds(625,700,150,30);
          frame.add(buttonSetPrice);
          buttonSetPrice.addActionListener(this);
          
          buttonDisplay=new JButton("Display");
          buttonDisplay.setBounds(100,730,150,30);
          frame.add(buttonDisplay);
          buttonDisplay.addActionListener(this);
          
          buttonClear=new JButton("Clear");
          buttonClear.setBounds(100,760,150,30);
          frame.add(buttonClear);
          buttonClear.addActionListener(this);
          
          txtNumberOfUser.addKeyListener(this);
          
        }
        
        public void keyPressed(KeyEvent key){}
        public void keyTyped(KeyEvent key){}
        public void keyReleased(KeyEvent key){
            try{
                float productNo=Float.parseFloat(txtProductNo1.getText());
                float noOfUser=Float.parseFloat(txtNumberOfUser.getText());
                setTotalPrice(productNo,noOfUser);
            }catch(Exception e){
                JOptionPane.showMessageDialog(frame,"You are requested to enter valid values.");
            }
        }
        
        public void setTotalPrice(float productNo, float noOfUser){   
            boolean productNumber=false;
            for(MicrosoftProduct items:list){
                if(items.getProductNo()==productNo){
                    EnterpriseEdition obj =(EnterpriseEdition)items;
                    float totalPrice=noOfUser*obj.getPricePerUser();
                    txtTotalPrice.setText(totalPrice+"");
                    productNumber=true;
                    break; 
                }
            }
            if(productNumber==false){
               txtTotalPrice.setText(0+"");  
            }
        }
      
        public static void main (String []args){
            new ProductGUI();
        }
      
        public void actionPerformed(ActionEvent e){
             if(e.getSource()==buttonAdd){
                        String productName=txtProductName.getText();
                        String ProductNo=txtProductNo.getText();
                        String pricePerUser=txtPricePerUser.getText();
                        if(ProductNo.equals("") || productName.equals("") || pricePerUser.equals("")){
                            JOptionPane.showMessageDialog(frame,"Enter your value");
                        }else{
                            try{
                                int productNo=Integer.parseInt(txtProductNo.getText());
                                float pricePerUser1=Float.parseFloat(txtPricePerUser.getText());
                                boolean dubValue=false;
                                for(MicrosoftProduct items:list){
                                    if(items.getProductNo()==productNo || items.getProductName()==productName){
                                        dubValue=true;
                                        break;
                                    }
                                }    
                                if(dubValue==false){
                                    EnterpriseEdition ep=new EnterpriseEdition(productNo,productName,pricePerUser1);
                                    list.add(ep);
                                    JOptionPane.showMessageDialog(frame, "Details of product are added successfully.");
                                }else{
                                    JOptionPane.showMessageDialog(frame,"Enter new Value.");
                                }
                            }catch(Exception h){
                                JOptionPane.showMessageDialog(frame,"Text fields can't be empty");
                            }   
                        }
             }
                
                if(e.getSource()==activeLicense){
                        String clientCompanyName=txtClientCompanyName.getText();
                        String numberOfUser=txtNumberOfUser.getText();
                        String activationDate=txtActivationDate.getText();
                        String licenseExpireDate=txtLicenseExpireDate.getText();
                        String activationKey=txtActivationKey.getText();
                        String productNo1=txtProductNo1.getText();
                        String perUserPrice=txtPricePerUser.getText();                    
                        if(clientCompanyName.equals("") || numberOfUser.equals("") || activationDate.equals("") || licenseExpireDate.equals("") |
                        activationKey.equals("") || productNo1.equals("") || perUserPrice.equals("")){
                            JOptionPane.showMessageDialog(frame,"Fields can't be empty");
                        }else{
                            try{
                                float productNumber=Float.parseFloat(txtProductNo1.getText());
                                float perPriceUser=Float.parseFloat(txtPricePerUser.getText());
                                int numOfUser=Integer.parseInt(txtNumberOfUser.getText());
                                boolean dubValue=false;
                                for(MicrosoftProduct items:list){
                                    if(items.getProductNo()==productNumber){
                                        dubValue=true;
                                        EnterpriseEdition ee=(EnterpriseEdition)items;
                                        if(ee.getIsActivated()){
                                            JOptionPane.showMessageDialog(frame,"Liscense has been activated already");
                                            break;
                                        }else{
                                            ee.activeLicense(clientCompanyName, numOfUser, activationDate, licenseExpireDate, activationKey);
                                            JOptionPane.showMessageDialog(frame,"License has been activated successfully");
                                            list.add(ee);
                                            break; 
                                        }
                                    }
                                    if(dubValue==false){
                                           JOptionPane.showMessageDialog(frame,"Product no. is not in the list");  
                                           break;
                                    }
                                }
                            }catch(Exception io){
                                    JOptionPane.showMessageDialog(frame,"Text fields can't be empty");
                            }
                        }
                } 
            
                if(e.getSource()==buttonTerminate){
                        String productNo2=txtProductNo2.getText();
                        if(productNo2.equals("")){
                            JOptionPane.showMessageDialog(frame, "Product no. not found");
                        }else{
                                float produtNo2=Float.parseFloat(txtProductNo2.getText());
                                boolean dubValue=false;
                                for(MicrosoftProduct items:list){
                                   if(items.getProductNo()==produtNo2){
                                        dubValue=true;
                                        EnterpriseEdition ed=(EnterpriseEdition)items;
                                        if(ed.getIsActivated()){
                                            ed.terminateLicense();
                                            JOptionPane.showMessageDialog(frame,"License has been terminated successfully");
                                        }else{
                                             JOptionPane.showMessageDialog(frame,"Product no. is available to issue license");
                                             break;
                                        }
                                   }
                                   if(dubValue==false){
                                       JOptionPane.showMessageDialog(frame,"Product no. is not available");
                                       break;
                                   }
                                }
                        }
                }
                
                if(e.getSource()==buttonSetPrice){
                    String productNo3=txtProductNo3.getText();
                    String pricePerUser=txtPricePerUser1.getText();
                    if(productNo3.equals("")){
                            JOptionPane.showMessageDialog(frame, "Product no. not found");
                    }else{
                        float prodNo=Float.parseFloat(txtProductNo3.getText());
                        float perUserPrice1=Float.parseFloat(txtPricePerUser1.getText());
                        boolean dubValue=false;
                        for(MicrosoftProduct items:list){
                             if(items.getProductNo()==prodNo){
                                   dubValue=true;
                                   EnterpriseEdition epe=(EnterpriseEdition)items;
                                   if(epe.getIsActivated()){
                                       JOptionPane.showMessageDialog(frame,"License has been activated already");
                                       break;
                                   }else{
                                       epe.setPricePerUser(perUserPrice1);
                                       JOptionPane.showMessageDialog(frame,"License has been terminated so price per user has been changed");
                                       list.add(epe);
                                       break;
                                   }
                             }
                        }
                    }
                }
                
                if(e.getSource()==buttonDisplay){ 
                    for(MicrosoftProduct items:list){
                        EnterpriseEdition obj=(EnterpriseEdition)items;
                        obj.productDetails();
                        break;
                    }          
                }
                
                if(e.getSource()==buttonClear){
                        txtProductNo.setText("");
                        txtProductName.setText("");
                        txtTotalPrice.setText("");
                        txtClientCompanyName.setText("");
                        txtNumberOfUser.setText("");
                        txtPricePerUser.setText("");
                        txtPricePerUser1.setText("");
                        txtActivationDate.setText("");
                        txtLicenseExpireDate.setText("");
                        txtActivationKey.setText("");
                        txtProductNo1.setText("");
                        txtProductNo2.setText(""); 
                        txtProductNo3.setText("");
                        JOptionPane.showMessageDialog(frame,"All cleared");
                }
       }
}

