package com.example.android.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import com.jayway.android.robotium.solo.Solo;
import com.example.android.MainActivity;
import com.example.android.R;


public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityTest() {
        super("com.example.android", MainActivity.class);
    }


    @Override
    public void setUp() {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        try {
            //Robotium will finish all the activities that have been opened
            //noinspection FinalizeCalledExplicitly
            solo.finalize();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        getActivity().finish();
        super.tearDown();
    }


    @SmallTest
    public void test_shouldHaveCorrectTitle() {
        String appName = solo.getString(R.string.app_name);
        assertEquals(appName, "Example");
    }

    @SmallTest
    public void test_shouldLaunchMainActivity() throws Exception {
        solo.assertCurrentActivity("Current activity is not main.", MainActivity.class);
    }



}
