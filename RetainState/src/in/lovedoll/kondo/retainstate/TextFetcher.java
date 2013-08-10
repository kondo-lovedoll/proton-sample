package in.lovedoll.kondo.retainstate;

public class TextFetcher {

    private Callback mCallback;

    public void fetch() {
        if (mCallback != null) {
            try {
                Thread.sleep(1000);
                String result = "Data fetched.";
                mCallback.onFetched(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void onCreate(Callback callback) {
        mCallback = callback;
    }

    public void onDestroy() {
        mCallback = null;
    }

    public static interface Callback {
        void onFetched(String result);
    }
}
