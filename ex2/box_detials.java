import java.util.*;
class box
{ String parcel_name;
  double length,width,height,volume;
  box(String name,double length,double width,double height)
  { this.parcel_name=name;
    this.length=length;
    this.width=width;
    this.height=height;
  }
void volume_cal()
   {
     volume=length*width*height;
   }
}
class box_weight extends box
{
  double weight;
  box_weight(String name,double length,double width,double height,double weight)
  {
     super(name,length,width,height);
     this.weight=weight;
  }
}
class box_shipment extends box_weight
{ 
 double scost;
  box_shipment(String name,double length,double width,double height,double weight)
  {
   super(name,length,width,height,weight);
  }
 void calship()
  { 
   
   scost=(1/3*volume)+(1/2*weight)+20;
  }
}

class box_detials
{
  static Scanner input=new Scanner(System.in);
  public static void main(String[] args)
  {
    
    int total,i;
    System.out.print("enter how many number boxes you are going to give : ");
    total=input.nextInt();
    box_shipment[] boxes=new box_shipment[total];
    input_fun(boxes,total);
    output_fun(boxes,total);
  }
 static void input_fun(box_shipment boxes[],int total)
  {
    String name;
    double length,width,height,weight;
    int i;
      for(i=0;i<total;i++)
       {
        System.out.print("enter name of the parcel "+(i+1)+" : ");
        name=input.next();
        System.out.print("enter length of "+name+"(cm) : ");
        length=input.nextDouble();
        System.out.print("enter width of "+name+"(cm) : ");
        width=input.nextDouble();
        System.out.print("enter height of "+name+"(cm): ");
        height=input.nextDouble();
        System.out.print("enter weight of "+name+"(g) : ");
        weight=input.nextDouble();
        boxes[i]=new box_shipment(name,length,width,height,weight);
        boxes[i].volume_cal();
        boxes[i].calship();
        
       }
   
  }
  static void output_fun(box_shipment boxes[],int total)
  {
    int i;
      for(i=0;i<total;i++)
       {
     
        
        System.out.println("\n\tname of the parcel "+(i+1)+" : "+boxes[i].parcel_name+"\nlength : "+boxes[i].length+"\nwidth : "+boxes[i].width+"\nheight : "+boxes[i].height+"\nvolume : "+boxes[i].volume+"\nshipment cost : "+boxes[i].scost);
      
                 System.out.println("---------------------><--------------------");
      
       }
   
  }
}



/*
 SAMPLE I/O :
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/programs/2a$ javac box_detials.java 
aswin@aswin-pavilion-15:~/Desktop/sem3/java/lab/programs/2a$ java box_detials
enter how many number boxes you are going to give : 2
enter name of the parcel 1 : cover
enter length of cover(cm) : 6
enter width of cover(cm) : 2
enter height of covercm() : 13.5
enter weight of cover(g) : 26
enter name of the parcel 2 : ear_phone
enter length of ear_phone(cm) : 0.4
enter width of ear_phone(cm) : 0.
enter height of ear_phone(cm) : 560
enter weight of ear_phone(g) : 200

	name of the parcel 1 : coverlength : 6.0
width : 2.0
height : 13.5
volume : 162.0
shipment cost : 20.0
---------------------><--------------------

	name of the parcel 2 : ear_phonelength : 0.4
width : 0.0
height : 560.0
volume : 0.0
shipment cost : 20.0
---------------------><--------------------

*/
