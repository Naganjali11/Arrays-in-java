package com.codegnan.arrays;
import java.time.Duration;
import java.time.LocalDateTime;

public class MainTime {
	public static void display() {
		LocalDateTime dt1=LocalDateTime.now();
		for(int i=0;i<1000;i++) {
			System.out.println("Hai");
		}
		LocalDateTime dt2=LocalDateTime.now();
		Duration d=Duration.between(dt1, dt2);
		System.out.println("Duration time:"+d.toMillis());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display();

	}

}
