package shapes.circle;
public class Circle
{
 float radius;
 public Circle(float radius)
 {
    this.radius=radius;
 }
 public float getPerimeter()
 {
  return 2*3.14f*radius;
 }
 public float getArea()
 {
  return 3.14f*radius*radius;
 }
}
