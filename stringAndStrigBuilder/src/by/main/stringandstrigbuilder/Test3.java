package by.main.stringandstrigbuilder;


//. Проверить, является ли заданное слово палиндромом.


public class Test3 {

	public static void main(String[] args) {
		String str ="топот";
		StringBuilder rev=new StringBuilder(str).reverse();
		String sRev = rev.toString(); 
		if(str.compareTo(sRev)==0) {
			System.out.println("это палиндромом");
		}
		else {
			System.out.println("это не палиндромом");
		}
		
	}

}
