package com.pavan.runners;

import org.springframework.boot.CommandLineRunner;

public class CommandLineRunnerImpl implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineRunnerImpl.run()");
	}

}
