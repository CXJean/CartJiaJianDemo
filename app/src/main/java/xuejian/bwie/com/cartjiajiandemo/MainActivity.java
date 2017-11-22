package xuejian.bwie.com.cartjiajiandemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private NumberAddSubView number_add_sub_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number_add_sub_view = (NumberAddSubView) findViewById(R.id.number_add_sub_view);
        number_add_sub_view.setOnButtonClickListener(new NumberAddSubView.OnButtonClickListener() {
            @Override
            public void onButtonSubClick(View v, int value) {
                Toast.makeText(MainActivity.this, "减value=="+value, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onButtonAddClick(View v, int value) {
                Toast.makeText(MainActivity.this, "加value=="+value, Toast.LENGTH_SHORT).show();

            }
        });

    }
}
