package in.lovedoll.kondo.retainstate;

import proton.inject.Proton;
import android.app.Application;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Proton.initialize(this, new MyModule());
    }

}
