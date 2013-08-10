package in.lovedoll.kondo.retainstate;

import javax.inject.Inject;

import proton.inject.activity.ProtonActivity;
import proton.inject.state.RetainState;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ProtonActivity implements OnClickListener, TextFetcher.Callback {
    private Button mButton;

    @Inject
    private TextFetcher mTextFetcher;
    @RetainState
    private String mCached;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.Button);
        mButton.setOnClickListener(this);
        mTextFetcher.onCreate(this);

        if (mCached != null) {
            Toast.makeText(this, "cache hits!", Toast.LENGTH_SHORT).show();
            TextView textHolder = (TextView) findViewById(R.id.TextHolder);
            textHolder.setText(mCached);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        mTextFetcher.fetch();
    }

    @Override
    public void onFetched(String result) {
        TextView textHolder = (TextView) findViewById(R.id.TextHolder);
        textHolder.setText(result);
        mCached = result;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mButton != null)
            mButton.setOnClickListener(null);
        mTextFetcher.onDestroy();
    }

}
