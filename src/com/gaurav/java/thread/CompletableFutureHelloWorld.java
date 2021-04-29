package com.gaurav.java.thread;

import static com.learnjava.util.LoggerUtil.log;

import java.util.concurrent.CompletableFuture;

import com.learnjava.service.HelloWorldService;

public class CompletableFutureHelloWorld {

	public static void main(String[] args) {

		HelloWorldService hws = new HelloWorldService();

		CompletableFuture.supplyAsync(() -> hws.helloWorld()).thenAccept((result) -> {
			log("Result is " + result);
		}).join();
		log("Done!");
		// delay(2000);
	}
}
