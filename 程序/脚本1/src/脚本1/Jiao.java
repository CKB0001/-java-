package ½Å±¾1;
import javax.script.*;

public class Jiao {

	public static void main(String[] args) throws ScriptException  {
		ScriptEngineManager manger=new ScriptEngineManager();
		ScriptEngine engine=manger.getEngineByName("JavaScript");
		engine.eval("print('Hello world\n')");
		

	}

}
