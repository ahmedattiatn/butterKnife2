package ahmedattia.butterknife2;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    // @InjectView was changed to @Bind in recent version of ButterKnife

    @BindView(R.id.record)
    ImageView record;

    @BindDrawable(R.drawable.profile)  // kif bech tbddel taswira fi imageview bdrawable
    Drawable myDrawable;
    @BindView(R.id.call)  // el imageview li bech tbadal el taswira li feha 
    ImageView call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /// without Butter Knife
     /* record = (ImageView) findViewById(R.id.record);
        call = (ImageView) findViewById(R.id.call);
        star = (ImageView) findViewById(R.id.Star);*/

        //////// with Butter Knife
        ButterKnife.bind(this);
    }

    @OnClick(R.id.record)
    public void makeToast() {
        Toast.makeText(getApplicationContext(), "Hello User", Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.call)
    public void changeIcon() {
        call.setImageDrawable(myDrawable);
    }
}
