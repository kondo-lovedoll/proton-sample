package in.lovedoll.kondo.providerinjection;

public class SimpleMessage implements Message {

    private String mMessage;

    public SimpleMessage(String message) {
        mMessage = message;
    }

    @Override
    public String display() {
        return mMessage;
    }

}
