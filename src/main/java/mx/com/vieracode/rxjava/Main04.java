package mx.com.vieracode.rxjava;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

public class Main04 {

	public static void main(String[] args) {
		Observable<Long> list = Observable.interval(1, TimeUnit.SECONDS);
		
		list.subscribe(System.out::println);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
