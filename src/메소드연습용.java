import java.util.Scanner;

public class 메소드연습용 {
 // 정수입력
	static int inputInt(String 조건) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print(조건+"(을)를 입력하세요:");
			if(scan.hasNextInt())
				return scan.nextInt();
			else
				System.out.println("입력이 잘못되었습니다.");
				scan=new Scanner(System.in);
		}
	}		
	
 // 랜덤정수뽑기
	static int rand() {
		 int rand=(int)(Math.random()*100)+1;
		 return rand;
	}
	
 // 랜덤으로 n개 정수를 뽑아 배열시키기
	static int[] rand(int n) {
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			for(int a=0;a<i;a++) {
				if(arr[a]==arr[i])
					i--;
			}
		}
		return arr;
	}
	
 // 오름차순 정렬
	static int[] asc(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

 // 내림차순 정렬
	static int[] des(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
 // 윤년확인
	static boolean isLeapYear(int year) {
		if(year%4==0 && year%100!=0 || year%400==0)
			return true;
		else
			return false;
	}	
// 이진법 변환(16개)
	static void binary(int a) {
		for(int i=0;i<16;i++) {
			if(a!=0) {
				if(a%2==0)
					System.out.print(0);
				else
					System.out.print(1);
				a/=2;
			}
			else break;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		binary(100);
	}

}
