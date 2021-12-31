package hello.proxy.app.v2;

public class OrderRepositoryV2 {

    public void save(String itemId) {
        if ("ex".equals(itemId)) {
            throw new IllegalArgumentException("ex");
        }
        sleep(1000);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
