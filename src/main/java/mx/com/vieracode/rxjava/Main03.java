package mx.com.vieracode.rxjava;

import io.reactivex.Observable;
import mx.com.vieracode.rxjava.observers.MyObserver;

public class Main03 {

	public static void main(String[] args) {
		Observable<String> list = Observable.just("Do","you","know","what","I","mean","?");
		//Operación de transformación
		list.map(String::toUpperCase).subscribe(new MyObserver());
	}

}
