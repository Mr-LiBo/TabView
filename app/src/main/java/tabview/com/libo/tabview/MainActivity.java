package tabview.com.libo.tabview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import tabview.com.libo.tabview.adapter.MainViewAdapter;
import tabview.com.libo.tabview.listener.OnTabSelectedListener;
import tabview.com.libo.tabview.widget.Tab;
import tabview.com.libo.tabview.widget.TabContainerView;

public class MainActivity extends AppCompatActivity
{
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_container);
        TabContainerView tabContainerView = (TabContainerView) findViewById(R.id.tab_container);
        MainViewAdapter mainViewAdapter = new MainViewAdapter(getSupportFragmentManager(),
                new Fragment[] { new TabFragment1(), new TabFragment2(), new TabFragment3(), new TabFragment4(), new TabFragment5() });
        mainViewAdapter.setHasMsgIndex(5);
        tabContainerView.setAdapter(mainViewAdapter);
        tabContainerView.setOnTabSelectedListener(new OnTabSelectedListener()
        {
            @Override
            public void onTabSelected(Tab tab)
            {
                
            }
        });
        
    }
}
