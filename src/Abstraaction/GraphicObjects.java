package Abstraaction;

public  abstract class GraphicObjects {
    int x , y;
    void moveTo(int newX, int newY){
        System.out.println("move to x:"+x+ "and y:"+y);
    } 
   abstract  void Draw();
   abstract  Void  Resize();

 
}
