package com.newgeniuser.photogallery;

import android.support.v4.app.Fragment;
import android.os.Bundle;

public class PhotoGalleryActivity extends SingleFragmentActivity {

/*    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_photo_gallery);
    }*/
    @Override
    public Fragment createFragment(){
        return PhotoGalleryFragment.newInstance();
    }
}
