package view;

import android.app.Application;

import org.xutils.x;

/**
 * Created by admin on 2018/9/12.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initXutils3();
    }

    //初始化Xutils3
    private void initXutils3() {
        x.Ext.setDebug(false);
        x.Ext.init(this);
    }
}
