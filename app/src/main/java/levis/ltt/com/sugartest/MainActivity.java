package levis.ltt.com.sugartest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import levis.ltt.com.sugartest.table.User;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    TextView tv1;
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "btn1 click");
                User user = new User("奥巴马1","123abc","男aaa");
                //user.save();
                Log.i(TAG, ">>" + user.toString());
            }
        });

        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "btn2 click");

                User user1 = new User("kong","123abc","男111");
                user1.update();

                List<User>  list = User.listAll(User.class);
                for (User user : list) {
                    Log.i(TAG, ">> " + user.toString());
                }
            }
        });
    }
}
