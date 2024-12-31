package day7;



public class employee {
//	String  name ;
//    int id ;
//    float salary ;
//    long number ;
//    
//    public static void main(String [] args) {
// 	   employee emp1 = new employee ();
// 	   emp1.name = "manisha";
// 	   emp1.id = 121;
// 	   emp1.salary = 30000;
// 	   emp1.number = 8248509837l;
// 	   
// 	    
// 	   employee emp2 = new employee ();
// 	   emp2.name = "dhayal";
// 	   emp2.id = 122;
// 	   emp2.salary = 40000;
// 	   emp2.number = 8248509839l;
// 	  
// 	    
// 	   employee emp3 = new employee ();
// 	   emp3.name = "diya";
// 	   emp3.id = 123;
// 	   emp3.salary = 45000;
// 	   emp3.number = 8298509839l;
// 	   
// 	    
// 	   employee emp4 = new employee ();
// 	   emp4.name = "dolath";
// 	   emp4.id = 123;
// 	   emp4.salary = 50000;
// 	   emp4.number = 8248596839l;
// 	   
// 	    
// 	   employee emp5 = new employee ();
// 	   emp5.name = "achu";
// 	   emp5.id = 125;
// 	   emp5.salary = 55000;
// 	   emp5.number = 8248509856l;
// 	  System.out.println(emp1.name + "\n" + emp1.id + "\n" + emp1.salary + "\n" + emp1.number );
//	    
 	   
	
	int frstnum;
	int secnum;

	void add() {
		System.out.println( "add:"+(frstnum + secnum));
	}
		void sub() {
			System.out.println( "sub:"  + (frstnum - secnum));
		}
			void mul() {
				System.out.println("mul:"  + (frstnum * secnum));
		
	}
			void div() {
				System.out.println("div:"  + (frstnum % secnum));
			}
			public static void main (String [] args ) {
				employee input  =  new employee();
				input.frstnum = 10 ;
				input.secnum = 20 ;
				
				input.add();
				input.sub();
				input.mul();
				input.div();
 
 	    
}
}
