package kwonif;

public class kwon_if_test {
	public static void main(String[] args) {
		
		int a=1;
		int b=10,c;
		
		if(a>0) {
			System.out.println("if a : "+a);
			a= a-2;
		}else if(a<0) {
			System.out.println("else if a : "+a);	
			a=0;
		}else {
			System.out.println("else a : "+a);
			a=-100;
		}
		
		b=a;
		System.out.println("현재 a의 값 : "+a);
		
		if(a>b) {
			c=a;
			System.out.println("a가 b보다 큼");
		}else {
			c=b;
			System.out.println("a가 b보다 크지 않음");
		}
		System.out.println("현재 c의 값 : "+c);
		
		if(a!=b) {
			System.out.println("a와 b는 다른값을 가짐");
		}else if(b!=c){
			System.out.println("b와 c는 다른값을 가짐");
		}else {
			System.out.println("b와 c는 다른값을 가짐");
		}
		
		
		
		
		
		
		//kwon_scanner_5		
	}
}
