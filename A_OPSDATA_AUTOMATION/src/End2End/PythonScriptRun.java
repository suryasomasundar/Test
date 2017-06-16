package End2End;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Utils.Constants;

public class PythonScriptRun {
	public static void ExecuteScriptrun_HappyFlow() throws IOException {

		String pythonScriptPath = Constants.HappyPSP;
		String[] cmd = new String[2];
		cmd[0] = "python"; // check version of installed python: python -V
		cmd[1] = pythonScriptPath;

		// create runtime to execute external command
		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec(cmd);
		BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line = "";
		while ((line = bfr.readLine()) != null) {
			// display each output line form python script
			System.out.println(line);
			//System.out.println("");
		}

	}
	
	public static void ExecuteScriptrun_SadFlow() throws IOException {

		String pythonScriptPath = Constants.SadPSP;
		String[] cmd = new String[2];
		cmd[0] = "python"; // check version of installed python: python -V
		cmd[1] = pythonScriptPath;

		// create runtime to execute external command
		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec(cmd);
		BufferedReader bfr = new BufferedReader(new InputStreamReader(pr.getInputStream()));
		String line = "";
		while ((line = bfr.readLine()) != null) {
			// display each output line form python script
			System.out.println(line);
			//System.out.println("");
		}

	}

}
