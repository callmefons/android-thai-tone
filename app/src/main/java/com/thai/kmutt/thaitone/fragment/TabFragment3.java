package com.thai.kmutt.thaitone.fragment;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.media.session.MediaControllerCompat;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.thai.kmutt.thaitone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment3 extends Fragment {

    VideoView video_player_view;
    DisplayMetrics dm;
    SurfaceView sur_View;
    MediaController media_Controller;

    public TabFragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_tab_fragment3, container, false);

        video_player_view = (VideoView)rootView.findViewById(R.id.video_player);
        getInit();
        return rootView;
    }

    public void getInit(){
        media_Controller = new MediaController(getActivity());
        dm = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(dm);
        int height = dm.heightPixels;
        int width = dm.widthPixels;
        video_player_view.setMinimumWidth(width);
        video_player_view.setMinimumHeight(height);
        video_player_view.setMediaController(media_Controller);
        String uriPath = "android.resource://com.thai.kmutt.thaitone/"+R.raw.pronuncaiation_video;
        Uri uri = Uri.parse(uriPath);
        video_player_view.setVideoURI(uri);
        video_player_view.seekTo(100);

        //Auto start video
        //video_player_view.start();
    }

}
