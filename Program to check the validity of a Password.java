import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
	public static boolean isValid(String str) {
		if(str.length()<8||str.length()>15){
			return false; 
		}
		boolean hasUpper=false;
		boolean hasLower=false;
		boolean hasDIgit=false;
		boolean hasSpecial=false;
		
		boolean hasSpace=false;

		HashSet<Character>specials=new HashSet<>();
		specials.add('~');
		specials.add('`');
		specials.add('@');
		specials.add('#');
		specials.add('$');
		specials.add('%');
		specials.add('^');
		specials.add('&');
		specials.add('*');
		specials.add('(');
		specials.add(')');
		specials.add('_');
		specials.add('-');
		specials.add('+');
		specials.add('=');
		specials.add('"');
		specials.add('?');
		specials.add(';');
		specials.add('/');
		specials.add('{');
		specials.add('}');
		specials.add('|');
		specials.add('<');
		specials.add('>');
		specials.add(':');

		specials.add('\\');

		

		



		for (Character ch : str.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				hasUpper=true;
			}
			else if (Character.isLowerCase(ch)) {
				hasLower=true;
			}
			else if (Character.isDigit(ch)) {
				hasDIgit=true;
			}
			else if (specials.contains(ch)) {
				hasSpecial=true;
			}
			else if(ch==' '){
				hasSpace=true;
			}
		}
if (hasSpace) {
	return false;
}

return hasUpper&&hasLower&&hasSpecial&&hasDIgit;


	}
}

