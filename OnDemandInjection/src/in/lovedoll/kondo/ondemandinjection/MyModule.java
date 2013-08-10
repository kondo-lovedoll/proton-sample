package in.lovedoll.kondo.ondemandinjection;

import proton.inject.DefaultModule;

public class MyModule extends DefaultModule {

    @Override
    protected void configure() {
        super.configure();
        bind(Message.class).to(SimpleMessage.class);
    }

}
