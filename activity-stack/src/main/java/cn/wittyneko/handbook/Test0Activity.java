package cn.wittyneko.handbook;

import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

public class Test0Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initView();
    }

    private void init(Bundle savedInstanceState) {
        getWindow();
        getWindowManager();
        getMenuInflater();
        getLayoutInflater();
        getFragmentManager();
        getSupportFragmentManager();

        getAssets();
        getResources();
        getTheme();
        getApplication();
        getApplicationContext();
        getApplicationInfo();

        getClass();
        getClassLoader();
        getLocalClassName();

        getSharedPreferences("name", MODE_PRIVATE);
        getCacheDir();
        getFilesDir();
        getExternalFilesDir(null);
        getExternalFilesDirs(null);
        getExternalCacheDir();
        getExternalCacheDirs();
        getObbDir();
        getObbDirs();

        Context context;

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }
}
