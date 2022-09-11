class Rectangle{
  int length,breadth;
  Rectangle(int x)
  { 
     length=x;
     breadth=x;
  }
  Rectangle(int a,int b)
  {
     length=a;
     breadth=b;
  }
  void getArea()
  {
     int area = length*breadth;
     System.out.println("Area of rectangle= "+area);
  }
  void getPerimeter()
  {
     int perimeter= 2*(length+breadth);
     System.out.println("Perimeter of rectangle= "+perimeter);
  }
  
  public static void main(String[] args)
  {
      Rectangle r1 = new Rectangle(8);
      Rectangle r2 = new Rectangle(8,12);
      r1.getArea();
      r1.getPerimeter();
      r2.getArea();
      r2.getPerimeter();
  }
}
