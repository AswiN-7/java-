package shapes.triangle;
public class Triangle
{
 float base,height,llength,rlength;
  public Triangle(float base,float height,float llength,float rlength) 
   {
   this.base=base;
   this.height=height;
   this.llength=llength;
   this.rlength=rlength;
   }
   public float getArea()
   {
     return base*height/2;
   }
   public float getPerimeter()
   {
     return base+llength+rlength;
   }
}

