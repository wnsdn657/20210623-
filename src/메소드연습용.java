import java.util.Scanner;

public class �޼ҵ忬���� {
 // �����Է�
	static int inputInt(String ����) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print(����+"(��)�� �Է��ϼ���:");
			if(scan.hasNextInt())
				return scan.nextInt();
			else
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
				scan=new Scanner(System.in);
		}
	}		
	
 // ���������̱�
	static int rand() {
		 int rand=(int)(Math.random()*100)+1;
		 return rand;
	}
	
 // �������� n�� ������ �̾� �迭��Ű��
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
	
 // �������� ����
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

 // �������� ����
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
	
 // ����Ȯ��
	static boolean isLeapYear(int year) {
		if(year%4==0 && year%100!=0 || year%400==0)
			return true;
		else
			return false;
	}	
// ������ ��ȯ(16��)
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
