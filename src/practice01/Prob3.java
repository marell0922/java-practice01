package practice01;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num=sc.nextInt();
		sc.close();
		
		if(num%2==0) {
			for(int i=0;i<num+1;i++) {
				if(i%2==0)
					sum+=i;
			}
		}else {
			for(int i=0;i<num+1;i++) {
				if(i%2==1)
					sum+=i;
			}
		}
		
		System.out.println("결과 값 : "+sum);
	}
}
