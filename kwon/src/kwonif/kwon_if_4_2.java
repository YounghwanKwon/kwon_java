package kwonif;

public class kwon_if_4_2 {
	public static void main(String[] args) {
		//하나의 개념 && 여기까지는 다아는곳?
		
		boolean b1 = true;
		
		//1
		if(b1) {
			System.out.println(1);
		}else {
			System.out.println(2);
		}
		
		//2
		if(b1) {
			System.out.println(1);
		}else if(b1){
			System.out.println(2);
		}else {
			System.out.println(3);			
		}
		
		//2-2
		if(!b1) {
			System.out.println(1);
		}else if(b1){
			System.out.println(2);
		}else {
			System.out.println(3);			
		}
		
		System.out.println(4);		
		
//		1
//		10 20 30 40 50 
//		110 120 130 140 150
		
		
		
		b1= false;
		//3
		if(b1) {
			System.out.println(1);
		}else if(b1==true){
			System.out.println(2);
		}else if((!b1)==false){
			System.out.println(3);
		}else if(!b1){
			System.out.println(4);
		}else{
			System.out.println(5);
		}
		
		//4
		if(false) {
			System.out.println(1);
		}else if(true){
			System.out.println(2);
		}		
		if(true){
			System.out.println(3);			
		}
		
		//5
		if(false) {
			System.out.println(1);
		}else if(true){
			System.out.println(4);
		}else if(false){
			System.out.println(5);
		}else if(true){
			System.out.println(6);
		}else {
			System.out.println(7);
		}
		
		//5
		//여기서 틀리면 2번 //2를 확인
		int count =0;
		if(count==0) {
			System.out.println("카운트는 0");
			count++;
		}else if(count==1){
			System.out.println("카운트는 1");
			count++;
		}else {
			System.out.println("카운트는 0도 1도 아님");
		}
	}
}
