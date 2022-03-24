package shapes.circle;
public class Square
{
 float side;
 public Square(float side)
 {
    this.side=side;
 }
 public float getPerimeter()
 {
  return 4*side;
 }
 public float getArea()
 {
  return side*side;
 }
}
