package Rostonny;

public class Customer {
    int id;
    String name;
    String gender;

 public Customer( int id, String  name,String gender){
this.id=id;
this. name=name;
this.gender =gender;

 }




    public void setid(int id){
        this.id=id;
    
    }
    public void setname(String name){
        this.name =name;
    }
    public void setgender(String gender){
    this.gender = gender;
    }
    
    public int getid(){
        return id;
    }

    public String getgender(){
        return gender;
    }
    public String getname(){
        return name;
    }
}
