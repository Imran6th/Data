package DataStructure;

public class IfelseConcept {

	public static void main(String[] args) {
    
		int a = 10;
		int b = 20;
 if (b>a) {
	 
	 System.out.println("b is greater than a");
 } else {
	 System.out.println("a is greater than b");
 } 

 int c=40;
 int d=40;
 int e=50;
 
 if(c==d) {
	 System.out.println("c and d are equal");
 }else {
	 System.out.println("c and d are not equal");
 }
 
 if(c==e) {
	 System.out.println("c and e are equal");
 }else {
	 System.out.println("c and e are not equal");
 }
 //write a logic to find the highest number
 int a1=400;
 int b1=500;
 int c1=300;
 //nested if-else condition
 
 if(a1>b1 & a1>c1) {//true & false =false
	 System.out.println("a1 is the greatest");
 }else if(b1>c1) {
	 System.out.println("b1 is the greatest");
 }else {
	 System.out.println("c1 is the greatest");
 }
	}
}
