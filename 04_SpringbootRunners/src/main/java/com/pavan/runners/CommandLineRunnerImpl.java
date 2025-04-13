package com.pavan.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;

public class CommandLineRunnerImpl implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunnerImpl.run()");
		System.out.println("args[0] :: "+ args[0]);
		System.out.println("Arguments are :: " + Arrays.asList(args));
		System.out.println();
		
	}

}
