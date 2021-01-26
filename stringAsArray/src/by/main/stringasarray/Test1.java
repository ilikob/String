package by.main.stringasarray;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case


public class Test1 {

	public static void main(String[] args) {
		String str="camelCase";

		System.out.print(camelCaseTosnakeCase(str));
	
		
    }
	

	
	public static String camelCaseTosnakeCase(String str) {
		String result="";
		char symbol;
		
		result = result + Character.toLowerCase(str.charAt(0));
		for(int i=1;i<str.length();i++) {
			 symbol=str.charAt(i);
			if(Character.isUpperCase(str.charAt(i)) ) {
				result+='_';
				result+=Character.toLowerCase(symbol);

				 
			}
			
			else { 
                result+=symbol; 
            } 
		}
		
		return result;
	}

}
