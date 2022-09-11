import java.util.*;
import java.io.*;

class Tile
{
   int edge_length,area;
   Tile(int s)
   {
      this.edge_length = s;
      this.area =  s*s;
   }

int get_area()
 {
  return area;
 }
}


class Floor
{
  int length,width;
  Floor(int length,int width) 
  {
    this.length=length;
    this.width = width;
  }
  void totalTiles(Tile t1) 
  {
    int tile_area=t1.get_area();
    int floor_area=length*width;
    int no_of_tiles=(floor_area/tile_area);
    System.out.println("Number of tiles = "+no_of_tiles);
  }
}


class countTile{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the edge length of tile");
int tile_len=sc.nextInt();
Tile t = new Tile(tile_len );
System.out.println("Enter the length and width of floor");
int floor_length = sc.nextInt();
int floor_width = sc.nextInt();
Floor f = new Floor(floor_length,floor_width);
f.totalTiles(t);
}
}
