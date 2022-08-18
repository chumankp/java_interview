package com.ck.jdk8;

public class Java8Exercise {

	public static void main(String[] args) {

		// print all the element from intStream

		StreamsSources.intNumbersStreams().forEach(number -> System.out.println(number));

		// print numbers from intStreams that are less then 5

		StreamsSources.intNumbersStreams().filter(number -> number < 5).forEach(number -> System.out.println(number));

		// print the 2nd and 3rd number in intnumbers thats greater then 5

		StreamsSources.intNumbersStreams().filter(number -> number > 5).skip(1).limit(2)
				.forEach(number -> System.out.println(number));

		// print the first number in intNumber that's getter then 5.
		// if nothing is found print -1

		Integer value = StreamsSources.intNumbersStreams().filter(number -> number > 5).findFirst().orElse(-1);

		System.out.println("value = " + value);

		// first name of all user from userStream

		StreamsSources.userStreams().map(user -> user.getFristName()).forEach(userName -> System.out.println(userName));

		// First name from user stream that has id as in numberStream

		StreamsSources.userStreams()
				.filter(user -> StreamsSources.intNumbersStreams().anyMatch(i -> i == user.getSlNo()))
				.forEach(System.out::println);

		 StreamsSources.userStreams().map(user -> user.getMobileNumber())
		.mapToInt(Integer::valueOf).filter(num -> num % 2 != 0).forEach(System.out::println);
		
		
		
	}
}
