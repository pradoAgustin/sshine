package com.example.agustin.sunshine.domainLayer.reactor;

/**
 * Created by agustin on 01/02/16.
 */
public interface DefaultUseCase<T> extends Runnable {

    public void addListener(T listener);

    public void removeListener(T listener);

}
