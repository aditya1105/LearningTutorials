package com.linkedin.adsharma.reactivextut;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.schedulers.Schedulers;


public class HelloWorld {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>(5);
    new ArrayList<String>(5);
    // Added some more useless comments
    System.out.println(list.toArray());
    /*Flowable.just("Hello world").subscribe(System.out::println);

    // Not running in parallel!!!!
    Flowable.range(1, 10)
        .observeOn(Schedulers.computation())
        .map(v -> v * v)
        .blockingSubscribe(System.out::println);

    // Running in parallel
    Flowable.range(1, 10)
        .flatMap(v ->
            Flowable.just(v)
                .subscribeOn(Schedulers.computation())
                .map(w -> w * w)
        )
        .blockingSubscribe(System.out::println);

    //Running in parallel
    Flowable.range(1, 10)
        .parallel()
        .runOn(Schedulers.computation())
        .map(v -> v * v)
        .sequential()
        .blockingSubscribe(System.out::println);*/
  }
}
