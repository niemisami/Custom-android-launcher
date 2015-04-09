package niemisami.customlauncher;

import android.support.v4.app.Fragment;


public class CustomLauncherActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return new CustomLauncherFragment();
    }



}
