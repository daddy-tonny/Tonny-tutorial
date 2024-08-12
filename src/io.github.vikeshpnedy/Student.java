

public class Student {
    String name;
    int age;
    String address;

    public Student(String name,int age ,String address){

        this.name=name;
        this.age=age;
        this.address=address;
    }
//ways to insert or modify the altributes of a class 
public void setname(String name){
    this.name=name;

}
public void setage(int age){
    this.age =age;
}
public void setaddress(String address){
this.address = address;
}
public String getname(){
    return name;
}
public int getage(){
    return age;
}
public String getaddress(){
    return address;
}
/*public static toString(){

    //return("Student name is"+ this.getname() + //",age is"+ this.getage() +"and address is //: "+ this.getaddress())
}*/

public static void main(String[] argd){
    Student John =new Student("John",25,"23 East, califonia");
    //System.out.println(John.toString());
    System.out.println(John.getname());
    System.out.println(John.getage());
    System.out.println(John.getaddress());
}
    
}
