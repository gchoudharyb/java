package com.gaurav.oops;

import java.util.Comparator;

public interface DefaultSignatureInterfaceTest {
	abstract void getMessage();

	private String TEST = "test";
	
	private void getMessage1();
}
interface extendTest extends Comparable<String> , Comparator<String>
{
	
}