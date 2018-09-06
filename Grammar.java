import java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * UVA 622 - Grammar Evaluation
 * 
 * @author juancholasso
 *
 */
public class Grammar {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
		int cases = 0;
		cases = sc.nextInt();
		String txt = "";
		for(int x = 0; x <cases; x++){
			txt = sc.next();
			try {
				System.out.println(engine.eval(txt));
			} catch (ScriptException e) {
				System.out.println("ERROR");
			}
		}
	}
}
