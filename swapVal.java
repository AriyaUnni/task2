import java.util.*;
class swapVal{
int a,b;
swapVal()
{
}
swapVal(int i,int j)
{
 a=i;
 b=j;
}
 
void swap(int a,int b)
{
int t=a;
a=b;
b=t;
     
}

void swapref(swapVal val)
{
System.out.println("Before swapping: a= " +a+ " and b= " +b);
      int t;
      t=val.a;
      val.a=val.b;
      val.b=t;
      System.out.println("After swapping: a= " +a+ " and b= " +b);
    }
}

   public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
    swapVal s1 = new swapVal();
    System.out.println("Before swapping: a= " +x+ " and b= " +y);
    s1.swap(x,y);
    System.out.println("After swapping: a= " +x+ " and b= " +y);
    swapVal s2 = new swapVal(x,y);
    s2.swapref(s2);
 }
}


    