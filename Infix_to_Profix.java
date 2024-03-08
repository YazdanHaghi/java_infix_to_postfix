
import java.util.Scanner;
import java.util.Stack;

public class proje4 {
	public static void main (String [] arg) {
		//System.out.println("JOMLE INFIX RA VARED KONID");
		Scanner scanner = new Scanner(System.in) ;
		String infix = scanner.nextLine() ;
		System.out.println(change(infix));
	}
	static boolean ch = true ;
	// tabe zir baraye olaviat dadan be amalvand ha 
	static int check (char c) {
		if(c == '+' || c == '-') {
			return 1 ;
		}
		else if(c == '*' || c == '/'){
			return 2 ;
		}
		else {
			return -1 ;
		}
	}
	// baraye peyda kardan noe character	
	static int find (char c) {
			if(Character.isAlphabetic(c)) {
				if(Character.isUpperCase(c)) {
					return 1 ;
				}else				
					return 5 ;
			}
			else if(c == '('){
				return 2 ;
				
			}
			else if (c == ')') {
				return 3 ;
			}
			else if(c == '+' || c == '-' || c == '*' || c == '/' ) {
				return 4 ;
			}
			else {
				return 0 ;
			}
		}
	
	// tabe baraye change kardan infix az vorodi be khoroji
	static String change (String infix) {
		String postfix  = new String ("") ;
		Stack<Character> s = new Stack<>();
		for(int i = 0 ; i < infix.length() ; i++ ) {
			int tmp = find(infix.charAt(i)) ;
			switch (tmp) {
			case 1 :
				//agar character bod mostaghim b postfix enteghal midahim 
				postfix += infix.charAt(i) ;
				break ;
			case 2 :
				//agar parantez baz bod "(" daron stack zakhire mikonim
				s.push(infix.charAt(i)) ;
				break ;
			case 3 :
				// agar stack khali nabod va akharin stack barabar parantez baz nabashad dar postfix akharin stack ra pop mikonim
				while(!s.isEmpty() && s.peek() != '(') 
					postfix += s.pop() ;
					s.pop() ;
					break ;
					// agar operand bashad
			case 4 :
				 while (!s.isEmpty() && check(infix.charAt(i))
                         <= check(s.peek())){
                   
                    postfix += s.pop();
             }
                s.push(infix.charAt(i));
            break ;
			case 5 : 
				ch = false ;
				break ;
			}
			
		}
		while(!s.isEmpty()) {
			 if(s.peek() == '(')
	                return "PARANTEZ BAZ BEDON BASTE SHODAN VOJOD DARAD";
			postfix += s.pop() ;
		}
		if(ch) {
		return postfix ;}
		else {
			return " LETTERS ARE LOWER CASE " ;
		}

		}		
	

}
