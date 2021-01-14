package mx.com.vieracode.rxjava;

import io.reactivex.Observable;
import mx.com.vieracode.rxjava.observers.MyObserver;

public class Main02 {

	public static void main(String[] args) {
		Observable<String> list = Observable.just("Do","you","know","what","I","mean","?");
		list.subscribe(new MyObserver());
	}

}
