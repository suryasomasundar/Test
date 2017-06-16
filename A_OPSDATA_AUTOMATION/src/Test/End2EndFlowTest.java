package Test;

import java.io.IOException;

import End2End.PythonScriptRun;
import End2End.QueryBean;

public class End2EndFlowTest {
	
	public static void main (String [] args) throws IOException{
		PythonScriptRun.ExecuteScriptrun_HappyFlow();
		//QueryBean.SelectTableDetails();
		PythonScriptRun.ExecuteScriptrun_SadFlow();
	}

}
