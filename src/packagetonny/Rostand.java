package packagetonny;



public class Rostand {
    String name;
    int matericule;
    int age;
    //constructor(default construtor)
    Rostand(){

        this.name="Tonny";
        this.matericule= 5757;
        this.age=2035;
    }

    public Rostand(String name,int matericule ,int age){

        this.name=name;
        this.age=age;
        this.matericule= matericule;
    }
 


    public void setname(String name){
        this.name=name;
    
    }
    public void setage(int age){
        this.age =age;
    }
    public void setmatericule(int matericule){
    this.matericule = matericule;
    }
    
    public int getage(){
        return age;
    }

    public int getmatericule(){
        return matericule;
    }
    public String getname(){
        return name;
    }

   void displayinfo(){

    System.out.println("i am " + this.name + "with matericule" + this.matericule + "and age" + this.age + "years old");
   }


}
  
    
   
   
    


