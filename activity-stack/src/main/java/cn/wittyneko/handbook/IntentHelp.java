package cn.wittyneko.handbook;

import android.content.Intent;

/**
 * Created by wittytutu on 17-3-27.
 */
public class IntentHelp {
    // Activity Flag 对AndroidManifest配置 launchModel为singleInstance的Activity无效

    /**
     * 栈顶调用onNewIntent()
     *
     * @param intent
     * @return
     */
    public static Intent singleTop(Intent intent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        return intent;
    }

    /**
     * 栈内调用onNewIntent()
     *
     * @param intent
     * @return
     */
    public static Intent singleTask(Intent intent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        return intent;
    }

    /**
     * 清空栈顶和自身Activity，新建跳转
     *
     * @param intent
     * @return
     */
    public static Intent clearTop(Intent intent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        return intent;
    }

    /**
     * 清空singleInstance模式以外的全部Activity，新建跳转
     *
     * @param intent
     * @return
     */
    public static Intent clearTask(Intent intent) {
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        return intent;
    }
}
