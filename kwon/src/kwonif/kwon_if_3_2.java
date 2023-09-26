package kwonif;

public class kwon_if_3_2 {
	public static void main(String[] args) {
		
		int count=0;
		
		//!연산자 찍먹
		if(count!=0) {
			System.out.println(1);
			count=0;
		}else {
			System.out.println(2);
			count=1;
		}
		
		if(count==0) {
			System.out.println(3);
			count=1;
		}else {
			System.out.println(4);
			count=0;
		}
		
		if(count>0) {
			System.out.println(5);
		}else {
			System.out.println(6);
		}
	}
}