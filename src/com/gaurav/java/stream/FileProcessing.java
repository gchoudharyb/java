package com.gaurav.java.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileProcessing {
	public static void main(String[] args) throws IOException {
		String path = "D://gaurav_workspace//core_java//gaurav/gaurav.txt";

		List<String> list2 = new ArrayList<>();
		Files.lines(Paths.get(path)).forEach((str) -> {
			String[] local = str.split("([,.\\s]+)");
			Arrays.stream(local).forEach((e) -> list2.add(e));

		});

		Map<String, List<String>> map = list2.stream().collect(Collectors.groupingBy((str) -> str));
		
		List<Map.Entry<String, List<String>>> entries = new ArrayList<>(map.entrySet()); 
		
		entries.sort((l1,l2)->l2.getValue().size()-l1.getValue().size());
		
		Map<String, List<String>> finalMap = new LinkedHashMap<>();
		
		
		entries.forEach((o1)->finalMap.put(o1.getKey(),o1.getValue()));
		
	//	List<String> resultList = Stream.of(finalMap).limit(3).map((f)->f.entrySet().);
		
		// System.out.println(resultMap);

		System.out.println(list2);
		// System.out.println(d);
	}
}
