package mx.com.vieracode.rxjava;

import io.reactivex.Observable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Observable<String> lista = Observable.just("What","are","you","doing","?");
		lista.subscribe(e->System.out.println(e));

	}

}
