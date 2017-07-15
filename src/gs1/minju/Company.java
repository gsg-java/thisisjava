package gs1.minju;
import java.util.Scanner;
public class Company{
	Scanner sc=new Scanner(System.in);
	
	String name;
	String position;	
	int i;	
	Company[]info=new Company[100];
	
	void register(){				
		String Ins1;
		int i=0;

		do{
			info[i]=new Company();
			System.out.print("�̸�: ");
			info[i].name=sc.next();
			System.out.print("����: ");
			info[i].position=sc.next();
			System.out.println(info[i].name+"("+info[i].position+")"+"��/�� ��ϵǾ����ϴ�.");		
			i++;
			System.out.println("�߰�����Ϸ��� Y�� ��������.");
			Ins1 = sc.next();
		}
		while(Ins1.equals("Y")|| Ins1.equals("y"));		
		
		
		
	}
	
	void view(){
		for(int j=0;j<i;j++){
			System.out.println(info[i].name);
			System.out.println(info[i].position);
		}
	}
	
	void search(){
		String input;
		System.out.print("��ȸ�� ���: ");
		input=sc.next();
		for(int j=0;j<i;j++){
			if(input.equals(info[i].name)){
				System.out.println(info[i].name);
				System.out.println(info[i].position);
				break;
			}
		}
	}
	
	void change(){
		System.out.print("���� �� ����: ");
		String new_position=sc.next();
		String temp=null;
		temp=info[i].position;
		info[i].position=new_position;
		new_position=temp;
		System.out.println(info[i].name+"("+info[i].position+")"+"(��)�� ����Ǿ����ϴ�.");
	}
	
	void delete(){
		info[i].name=null;
		info[i].position=null;
	}

	public static void main(String []args){
		Company execute=new Company();
		execute.register();
	}
}