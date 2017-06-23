package org.java.tuto.eclipse;
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
			System.out.print("이름: ");
			info[i].name=sc.next();
			System.out.print("직급: ");
			info[i].position=sc.next();
			System.out.println(info[i].name+"("+info[i].position+")"+"이/가 등록되었습니다.");		
			i++;
			System.out.println("추가등록하려면 Y를 누르세요.");
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
		System.out.print("조회할 사원: ");
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
		System.out.print("변경 후 직급: ");
		String new_position=sc.next();
		String temp=null;
		temp=info[i].position;
		info[i].position=new_position;
		new_position=temp;
		System.out.println(info[i].name+"("+info[i].position+")"+"(으)로 변경되었습니다.");
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