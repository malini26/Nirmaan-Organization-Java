package day10;

public class Constructorexample {
     int id;
     String name;
     
     Constructorexample(int id , String redcar){
    	 this.id =id;
    	 name = redcar;
     }
     
    	public static void main(String [] args) {
    		Constructorexample Constructorexample1 = new Constructorexample(1230, "BMW");
    		System.out.println( "id : " + Constructorexample1.id +"  " + "name  :" + Constructorexample1.name);
    	}
     }

