package in.lovedoll.kondo.providerinjection;

import proton.inject.DefaultModule;

public class MyModule extends DefaultModule {

    @Override
    protected void configure() {
        super.configure();
        bind(Message.class).toProvider(MessageProvider.class);
    }

}
