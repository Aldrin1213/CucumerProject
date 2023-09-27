package org.pageexe;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LoginPageExe.class, Homepage.class })
public class Execution {
	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(LoginPageExe.class, Homepage.class);
		System.out.println(r.getFailureCount());
		System.out.println(r.getIgnoreCount());
		System.out.println(r.getRunCount());
		System.out.println(r.getRunTime());
	}
}
