package com.sandeep.Core;

class Emotion {
	class Happy {
		String adjective;

		public void feeling() {
			System.out.println("I am feeling happy");
		}
	}

	String reality = "very sad";

	public void reality() {
		System.out.println("feeling " + reality);
	}
}

public class InnerClass {
	public static void main(String[] args) {
		{
			System.out.println("Hello, World!");
			Emotion e = new Emotion();
			e.reality();
			Emotion.Happy h = e.new Happy();
			h.feeling();
		}
	}
}