package mypackage.currency;
public class DistanceConverter
{ 
  public float cdistance;
  public DistanceConverter(float distance,int choice)
  {
    if(choice==1)
      meter_KM(distance);
    else if(choice==2)
      miles_KM(distance);
    else if(choice==3)
       KM_meter(distance);
    else
         KM_miles(distance);
   }
 void meter_KM(float distance)
   {
     cdistance=distance*0.001f;
   }
  void miles_KM(float distance)
   {
     cdistance=distance*1.60934f;
   }
  void KM_meter(float distance)
   {
     cdistance=distance*1000;
   }
   void KM_miles(float distance)
   {
     cdistance=distance*0.621371f;
   }
}
