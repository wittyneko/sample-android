package cn.wittyneko.handbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

/**
 * Created by wittytutu on 17-3-27.
 */

public class BaseActivity extends AppCompatActivity {

    protected void initView(){

        setTitle(getClass().getSimpleName());
        Button button = (Button) findViewById(R.id.button);
        final RadioButton normal = (RadioButton) findViewById(R.id.normal);
        final RadioButton singleTop = (RadioButton) findViewById(R.id.single_top);
        final RadioButton singleTask = (RadioButton) findViewById(R.id.single_task);
        final RadioButton clearTop = (RadioButton) findViewById(R.id.clear_top);
        final RadioButton clearTask = (RadioButton) findViewById(R.id.clear_task);

        final RadioButton normalAct= (RadioButton) findViewById(R.id.normal_act);
        final RadioButton singleTopAct = (RadioButton) findViewById(R.id.single_top_act);
        final RadioButton singleTaskAct = (RadioButton) findViewById(R.id.single_task_act);
        final RadioButton singleInstanceAct = (RadioButton) findViewById(R.id.single_instance_act);

        final CheckBox finishCheck = (CheckBox) findViewById(R.id.finish);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = null;
                if (normalAct.isChecked()){
                    intent = new Intent(getApplication(), Test0Activity.class);
                }
                else if (singleTopAct.isChecked()){
                    intent = new Intent(getApplication(), Test1Activity.class);
                }
                else if (singleTaskAct.isChecked()){
                    intent = new Intent(getApplication(), Test2Activity.class);
                }
                else if (singleInstanceAct.isChecked()){
                    intent = new Intent(getApplication(), Test3Activity.class);
                }

                if (singleTop.isChecked()){
                    IntentHelp.singleTop(intent);
                }
                else if (singleTask.isChecked()){
                    IntentHelp.singleTask(intent);
                }
                else if (clearTop.isChecked()){
                    IntentHelp.clearTop(intent);
                }
                else if (clearTask.isChecked()){
                    IntentHelp.clearTask(intent);
                }

                startActivity(intent);
                if (finishCheck.isChecked()){
                    finish();
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(getClass().getSimpleName(), "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(getClass().getSimpleName(), "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(getClass().getSimpleName(), "onNewInstance");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(getClass().getSimpleName(), "onDestroy");
    }
}
