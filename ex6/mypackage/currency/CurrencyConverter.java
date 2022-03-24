package mypackage.currency;
public class CurrencyConverter
{   public float cmoney;
  public CurrencyConverter(float money,int choice)
  {
    if(choice==1)
        INR_D(money);
    else if(choice==2)
        INR_E(money);
    else if(choice==3)
        INR_Y(money);
    else if(choice==4)
        D_INR(money);
   else if(choice==5)
        E_INR(money);
   else if(choice==6)
        Y_INR(money);
  }
   void INR_D(float money)
       {
         cmoney=money*0.014f;
       }
    void INR_E(float money)
       {
         cmoney=money*0.013f;
       }
     void INR_Y(float money)
       {
         cmoney=money*1.48f;
       }
     void D_INR(float money)
       {
         cmoney=money*71.76f;
       }
      void E_INR(float money)
       {
         cmoney=money*78.87f;
       }
     void Y_INR(float money)
       {
         cmoney=money*0.68f;
       }
    
}
