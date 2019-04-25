package DataStructure;

public class LoopsConcept {

	public static void main(String[] args) {
		//while loop
		//disadvantage infinite loop if there is no condition
		
		int i=1;//initialization
		while(i<=10) { //conditional
			System.out.println(i);
			i=i+1;//incremental/decremental			
		}
		
		 System.out.println("*****");
		 
		 //j++ means j=j+1
		
		//2.for loop
		for(int j=1;j<=10;j++) {//initialization,conditional,Incremental
			System.out.println(j);
		}
		//print 10 to 1
		for(int k=10;k>=0;k--) {
			System.out.println(k);
		}
	}

}
