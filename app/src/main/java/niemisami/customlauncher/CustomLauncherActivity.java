package niemisami.customlauncher;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class CustomLauncherActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return new CustomLauncherFragment();
    }



}
