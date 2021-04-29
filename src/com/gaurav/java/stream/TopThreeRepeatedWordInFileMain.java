package com.gaurav.java.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopThreeRepeatedWordInFileMain {
	public static void main(String[] args) throws IOException {
		String filePath = "D://gaurav_workspace//core_java//gaurav//gaurav.txt";
		Map<String, Integer> map=	Files.lines(Paths.get(filePath)).collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(map);
	}
}
