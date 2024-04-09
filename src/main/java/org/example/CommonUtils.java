package org.example;

import java.util.concurrent.TimeUnit;

public class CommonUtils {

    /**
     * This method is used to wait for script for certain time in seconds
     * @param secondsToSleep
     */
    public static void waitTime(int secondsToSleep){
        try {
            TimeUnit.SECONDS.sleep(secondsToSleep);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
    }

}
