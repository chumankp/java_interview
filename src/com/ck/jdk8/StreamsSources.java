package com.ck.jdk8;

import java.util.stream.Stream;

public class StreamsSources {
	
	public static Stream<String> stringNumbersStreams(){
		return Stream.of("one", "two", "three", "four", "five");
	}
	
	public static Stream<Integer> intNumbersStreams(){
		return Stream.iterate(0, i -> i+2).limit(10);
	}
	
	public static Stream<User> userStreams() {
		return Stream.of(new User(1, "chuman", "kumar", "78903556"),
				new User(2, "kalia", "panda", "78903552"),
				new User(3, "srikant", "gouda", "78903553"),
				new User(4, "srikant", "behera", "78903555"),
				new User(5, "santosh", "parida", "78903558"),
				new User(6, "kumar", "parida", "78903551"));
	}

}
