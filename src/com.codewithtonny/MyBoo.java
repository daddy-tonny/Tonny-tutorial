public class MyBoo {

    public static void main(String[] args){
       /*  boolean hasHighIcome =false;
        boolean hasGoodCredit =true;
        boolean hasCriminalRecord = false;
         boolean isEligible = (hasHighIcome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println();
    */

//TALKING ABOUT IF STATEMENTS

/*int temp =32;
if (temp>30){
    System.out.println("It is a hot day");
    System.out.println("Drink water");
}
else if( temp>20 )
    System.out.println("It is aa nice day");

else
    System.out.println("Cold day");

*/
//A COOL TECHNIC FOR SIMPLIFYING IF STATEMENTS

//int  income = 120_000;
//boolean hasHighIncome=(income>100_000);

            //tenary operator in java

int income =120_000;
String class Name =income>100_000?"First":"Economy";

//SWITCH STATEMENTS IN JAVA
String role = "Admin";
if (role=="Admin")
System.out.println("you are an admin");
else if (role=="modereator")
System.out.println("you are a moderator");
else 
System.out.println("you are  a guest");
//using the switch statement to do the abv

switch (role) {
    case "admin":
    System.out.println("you are an admin");
        
        break;
        case "moderator":
        System.out.println("you are a moderator");

    default:
    System.out.println("you are  a guest");
        
}

}



}