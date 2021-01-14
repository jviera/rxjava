package mx.com.vieracode.rxjava.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class MyObserver implements Observer<String> {

	@Override
	public void onSubscribe(Disposable d) {
		System.out.println("No estamos suscribiendo");
	}	

	@Override
	public void onError(Throwable e) {
		System.out.println("Se presento un error");
	}

	@Override
	public void onComplete() {
		System.out.println("Todo termino!");
	}

	@Override
	public void onNext(String element) {
		System.out.println(element);
	}

}
