package com.example.agustin.sunshine.presentacionLayer.presenter;

/**
 * Created by agustin on 01/02/16.
 */
public interface PresenterInterface {

    /**
     * Interface representing a Presenter in a model view presenter (MVP) pattern.
     */
        /**
         * Method that control the lifecycle of the view. It should be called in the view's
         * (Activity or Fragment) onResume() method.
         */
        void resume();

        /**
         * Method that control the lifecycle of the view. It should be called in the view's
         * (Activity or Fragment) onPause() method.
         */
        void pause();

        /**
         * Method that control the lifecycle of the view. It should be called in the view's
         * (Activity or Fragment) onDestroy() method.
         */
        void destroy();
    
}
