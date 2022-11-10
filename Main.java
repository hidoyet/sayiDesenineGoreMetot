package sayiDesenineGoreMetot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Sayıyı giriniz: ");
		int num=scanner.nextInt();
		System.out.print("Kaçlı desen olacak: ");
		int patNum=scanner.nextInt();
		int temp=num;
		patternMinus(num, patNum,temp);
	}
	static int patternMinus(int num,int patNum,int temp) {
		
		System.out.print(num+" ");
		if(num<=0) {
			return patternPlus(num+patNum, patNum,temp);
		}else
		return patternMinus(num-patNum, patNum, temp);
		
		
	}
	static int patternPlus(int num,int patNum,int temp) {
		System.out.print(num+" ");
		if(num==temp) {
			return 0;
		}else 
		return patternPlus(num+patNum, patNum, temp);
		
		
		
		
		
		
		
	}
		
	

}
