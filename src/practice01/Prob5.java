package practice01;

public class Prob5 {

	public static void main(String[] args) {
		for(int i=1;i<100;i++) {
			int num=i%10;
			
			if(num%3==0&&num!=0) {
				System.out.println(i+" 짝");
			}
		}
	}
}
