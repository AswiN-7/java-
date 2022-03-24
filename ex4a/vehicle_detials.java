import java.util.*;
interface Vehicle
{
 String getName();
 void setName(String name );
 int getMaxPassengers();
 void setMaxPassengers(int maxpassengers);
 int getMaxSpeed();
 void setMaxSpeed(int maxspeed);
}

interface LandVehicle extends Vehicle
{
 int getNumWheels();
 void setNumWheels(int numwheels);
 void Drive();
}

interface SeaVehicle extends Vehicle
{
 int getDisplacement();
 void setDisplacement(int maxdisplacement);
 void Launch();
}

interface EmergencyVehicle
{
 void soundHorn();
}
class Jeep implements LandVehicle
{
 private String name;
 private int maxpassengers,maxspeed,numwheels;
 public String getName()
 {
  return name;
 }
 public void setName(String name)
 {
 this.name=name;
 }
 public int getMaxPassengers()
 {
  return maxpassengers;
 }
 public void setMaxPassengers(int maxpassengers)
 {
  this.maxpassengers=maxpassengers;
 }
 public int getMaxSpeed()
 {
  return maxspeed;
 }
public  void setMaxSpeed(int maxspeed)
 {
  this.maxspeed=maxspeed;
 }
public  void setNumWheels(int numwheels)
 {
  this.numwheels=numwheels;
 }
public  int getNumWheels()
 {
  return numwheels;
 }
public  void soundHorn()
 {
  System.out.println("sound horn !!!");
 } 
public  void Drive()
 {
  System.out.println("nice ride");
 }
}
class Frigate implements SeaVehicle
{
 private String name="aswin";
 private int maxpassengers,maxspeed,maxdisplacement;
 public  String getName()
 {
  return name;
 }
 public void setName(String name)
 {
 this.name=name;
 }
 public  int getMaxPassengers()
 {
  return maxpassengers;
 }
 public void setMaxPassengers(int maxpassengers)
 {
  this.maxpassengers=maxpassengers;
 }
 public int getDisplacement()
 {
  return maxdisplacement;
 }
 public void setMaxSpeed(int maxspeed)
 {
  this.maxspeed=maxspeed;
 }
 public int getMaxSpeed()
 {
   return maxspeed;
 }
 
 public void setDisplacement(int maxdisplacement)
 {
  this.maxdisplacement=maxdisplacement;
 }
 public void Launch()
 {
  System.out.println("launched !!!");
 } 
 public void fireGun()
 {
  System.out.println("Gun fired ..");
 }
}
class HoverCraft implements LandVehicle,SeaVehicle
{
 private String name;
 private int maxpassengers,maxspeed,maxdisplacement,numwheels;
 public String getName()
 {
  return name;
 }
 public void setName(String name)
 {
 this.name=name;
 }
 public int getMaxPassengers()
 {
  return maxpassengers;
 }
 public void setMaxPassengers(int maxpassengers)
 {
  this.maxpassengers=maxpassengers;
 }
 public  void setNumWheels(int numwheels)
 {
  this.numwheels=numwheels;
 }
 public int getNumWheels()
 {
  return numwheels;
 }
 public  int getDisplacement()
 {
  return maxdisplacement;
 }
 public void setDisplacement(int maxdisplacement)
 {
  this.maxdisplacement=maxdisplacement;
 }
 public void setMaxSpeed(int maxspeed)
 {
  this.maxspeed=maxspeed;
 }
 public int getMaxSpeed()
 {
   return maxspeed;
 }
 public void Launch()
 {
  System.out.println("launched !!!");
 } 
 public void fireGun()
 {
  System.out.println("Gun fired ..");
 }
 public  void soundHorn()
 {
  System.out.println("sound horn !!!");
 } 
 public void Drive()
 {
  System.out.println("nice ride");
 }
 public void enterLand()
 {
  System.out.print("entered land");
 }
 
}
class Ambulance implements LandVehicle,EmergencyVehicle
{
  private String name;
 private int maxpassengers,maxspeed,numwheels;
 public String getName()
 {
  return name;
 }
 public void setName(String name)
 {
 this.name=name;
 }
 public int getMaxPassengers()
 {
  return maxpassengers;
 }
 public void setMaxPassengers(int maxpassengers)
 {
  this.maxpassengers=maxpassengers;
 }
 public int getMaxSpeed()
 {
  return maxspeed;
 }
 public void setMaxSpeed(int maxspeed)
 {
  this.maxspeed=maxspeed;
 }
 public void setNumWheels(int numwheels)
 {
  this.numwheels=numwheels;
 }
 public int getNumWheels()
 {
  return numwheels;
 }
 public void Drive()
 {
  System.out.println("nice ride");
 }
 public void soundHorn()
 {
  System.out.println("sound horn !!!");
 }
 public void soundSeiren()
  {
    System.out.println("seiren sounded");
  }
 public void patientIn()
  {
     System.out.println("patient was in ");
  }
}
class vehicle_detials
{
 static Scanner inp=new Scanner(System.in);
 static int countj,countf,counthc,counta;
 public static void main(String[] args)
 {
   int size,choice,i;
  System.out.print("enter how many vehicle detials you are going to give :");
  size=inp.nextInt();
   Jeep[] j=new Jeep[size];
   Frigate[] f=new Frigate[size];
   HoverCraft[] h=new HoverCraft[size];
   Ambulance[] a=new Ambulance[size];
  for(i=0;i<size;i++)
  {
  System.out.print("jeep--1\nFrigate--2\nHoverCraft--3\nAmbulance--108\nenter your choice : ");
  choice=inp.nextInt();
  if(choice==1)
    input_fun(j);
   else if(choice==2)
    input_fun(f);
   else if(choice==3)
     input_fun(h);
    else if(choice==108)
       input_fun(a);
  }
   output(j,h,f,a);
 }
 static void input_fun(Jeep[] j)
  {
     String name;
     j[0]=new Jeep();
     int maxpassengers,maxspeed,numwheels;
     System.out.print("enter  name :");
      name=inp.next();
     j[countj].setName(name);
    System.out.print("enter  maxpassengers  :");
      maxpassengers=inp.nextInt();
    j[countj].setMaxPassengers(maxpassengers);
    System.out.print("enter  maxspeed  :");
       maxspeed=inp.nextInt();
     j[countj].setMaxSpeed(maxspeed);
    System.out.print("enter  number of wheels  :");
     numwheels=inp.nextInt();
     j[countj].setNumWheels(numwheels);
      countj++;
    
  }
  static void input_fun(Frigate[] f)
  {
     f[countf]=new Frigate();
     String name;
      int maxpassengers,maxspeed,maxdisplacement;
     System.out.print("enter  name :");
      name=inp.next();
     f[countf].setName(name);
    System.out.print("enter  maxpassengers  :");
      maxpassengers=inp.nextInt();
    f[countf].setMaxPassengers(maxpassengers);
    System.out.print("enter  maxspeed  :");
       maxspeed=inp.nextInt();
     f[countf].setMaxSpeed(maxspeed);
    System.out.print("enter  maxdisplacement  :");
     maxdisplacement=inp.nextInt();
     f[countf].setDisplacement(maxdisplacement);
    countf++;
          
    
  }
 
 static void input_fun(HoverCraft[] h)
  {
       h[counthc]=new HoverCraft();
     String name;
      int maxpassengers,maxspeed,maxdisplacement,numwheels;
     System.out.print("enter  name :");
      name=inp.next();
        h[counthc].setName(name);
    System.out.print("enter  maxpassengers  :");
      maxpassengers=inp.nextInt();
         h[counthc].setMaxPassengers(maxpassengers);
    System.out.print("enter  maxspeed  :");
       maxspeed=inp.nextInt();
          h[counthc].setMaxSpeed(maxspeed);
     System.out.print("enter  maxdisplacement  :");
       maxdisplacement=inp.nextInt();
         h[counthc].setDisplacement(maxdisplacement);
     System.out.print("enter  number of wheels  :");
        numwheels=inp.nextInt();
          h[counthc].setNumWheels(numwheels);
    counthc++;
          
    
  }
 static void input_fun(Ambulance[] a)
  {
       a[counta]=new Ambulance();
     String name;
      int maxpassengers,maxspeed,maxdisplacement,numwheels;
     System.out.print("enter  name :");
      name=inp.next();
        a[counta].setName(name);
    System.out.print("enter  maxpassengers  :");
      maxpassengers=inp.nextInt();
        a[counta].setMaxPassengers(maxpassengers);
    System.out.print("enter  maxspeed  :");
       maxspeed=inp.nextInt();
          a[counta].setMaxSpeed(maxspeed);
     System.out.print("enter  number of wheels  :");
        numwheels=inp.nextInt();
          a[counta].setNumWheels(numwheels);
     counta++;
          
    
  }


   
 

 static void output(Jeep[] j,HoverCraft[] h, Frigate[] f, Ambulance[] a)
  {
      for(int i=0;i<countj;i++)
         System.out.print("name : "+j[i].getName()+"maxpassengers : \n"+j[i].getMaxPassengers()+"max speed : \n"+j[i].getMaxSpeed()+"number wheels : \n"+j[i].getNumWheels());
      for(int i=0;i<countf;i++)
           System.out.print("name : "+f[i].getName()+"\nmaxpassengers : "+f[i].getMaxPassengers()+"\nmax speed : "+f[i].getMaxSpeed()+"\nmax displacement : "+f[i].getDisplacement());
      for(int i=0;i<counthc;i++)
           System.out.print("\nname : "+h[i].getName()+"maxpassengers : "+h[i].getMaxPassengers()+"\nmax speed : "+h[i].getMaxSpeed()+"\nmax speed : \n"+h[i].getMaxSpeed()+"\nmax displacement : "+h[i].getDisplacement());
       for(int i=0;i<counta;i++)
            System.out.print("name : "+a[i].getName()+"\nmaxpassengers : "+a[i].getMaxPassengers()+"\nmax speed : "+a[i].getMaxSpeed()+"\nmax speed : "+a[i].getMaxSpeed());
  }
}

/*
 SAMPLE i/o :
 aswin@aswin-pavilion-15:~/Downloads$ javac vehicle_detials.java
aswin@aswin-pavilion-15:~/Downloads$ java vehicle_detials
enter how many vehicle detials you are going to give :3
jeep--1
Frigate--2
HoverCraft--3
Ambulance--108
enter your choice : 1
enter  name :xuv100
enter  maxpassengers  :14
enter  maxspeed  :300
enter  number of wheels  :4
jeep--1
Frigate--2
HoverCraft--3
Ambulance--108
enter your choice : 2
enter  name :sr200
enter  maxpassengers  :20
enter  maxspeed  :100
enter  maxdisplacement  :300
jeep--1
Frigate--2
HoverCraft--3
Ambulance--108
enter your choice : 3
enter  name :mar1122
enter  maxpassengers  :12
enter  maxspeed  :500
enter  maxdisplacement  :300
enter  number of wheels  :4
name : /nxuv100maxpassengers : 
14max speed : 
300number wheels : 
4name : sr200
maxpassengers : 20
max speed : 100
max displacement : 300
name : mar1122maxpassengers : 12
max speed : 500
max speed : 
500
max displace
*/
