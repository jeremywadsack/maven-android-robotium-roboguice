package com.example.android.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import com.example.android.MainActivity;
import com.example.android.R;


public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super("com.example.android", MainActivity.class);
    }


    @Override
    public void tearDown() throws Exception {
        getActivity().finish();
        super.tearDown();
    }


    @SmallTest
    public void test_shouldHaveCorrectTitle() {
        String appName = getActivity().getString(R.string.app_name);
        assertEquals(appName, "Example");
    }

    @SmallTest
    public void test_shouldLaunchMainActivity() throws Exception {
        assertTrue(getActivity() instanceof MainActivity);
    }



}
