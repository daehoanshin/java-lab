package me.whiteship.effectivejava3rd.item08;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class SampleRunner {

    public static void main(String[] args) throws InterruptedException {
       /* try(var sampleResource = new SampleResource()) {
            sampleResource.hello();
        }*/
        SampleRunner runner = new SampleRunner();
        runner.run();
        Thread.sleep(1000);
        System.gc();
    }

    private void run() {
        FinalizerExample finalizerExample = new FinalizerExample();
        finalizerExample.hello();
    }

}
