package JavaRegex;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class CHC{
	public static  String ChuanhoaChuoi(String s) {
		s = s.trim();
		s = s.replaceAll("\\s+", " ");
		s = s.replaceAll("\\s+([.,])\\s+", "$1 ");
		String regex = "\\b(\\w+)\\b(\\s+\\1\\b)+";
		Pattern p =  Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(s);
		while(m.find()) {
			s = m.replaceAll("$1");
		}
		return s;
	}
}
public class MainCHChuoi {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		CHC a = new CHC();
		System.out.println(a.ChuanhoaChuoi(s));
	}

	
}
