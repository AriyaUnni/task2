import java.util.*;

class MathFunction{
float z;
void multiply(int x, int y)
{
z=x*y;
System.out.println("z= "+z);
}
void multiply(float x, float y)
{
z=x*y;
System.out.println("z= "+z);
}
void multiply(int x, float y)
{
z=x*y;
System.out.println("z= "+z);
}
}
class MathFunction1{
public static void main(String[] args){
MathFunction f = new MathFunction();
f.multiply(7,8);
f.multiply((float)6.5,(float)7.1);
f.multiply(9,(float)2.5);
}
}
