package com.example.qvietd.materialdesignexample.Bai6RecyclerView;

import com.example.qvietd.materialdesignexample.R;

import java.util.ArrayList;

/**
 * Created by qvietd on 01-05-17.
 */

public class Landscape {
    private int imageID;
    private String title;
    private String description;

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static ArrayList<Landscape> getData() {

        ArrayList<Landscape> dataList = new ArrayList<>();

        int[] images = {
                R.drawable.thumb_1_0, R.drawable.thumb_1_1, R.drawable.thumb_1_2, R.drawable.thumb_1_3,
                R.drawable.thumb_1_4, R.drawable.thumb_1_5, R.drawable.thumb_1_6, R.drawable.thumb_1_7,
                R.drawable.thumb_1_8, R.drawable.thumb_1_9,
        };
        for (int i = 0; i < images.length; i++) {
            Landscape landscape = new Landscape();
            landscape.setImageID(images[i]);
            landscape.setTitle("Lanscape: " + i);
            dataList.add(landscape);
        }
        return dataList;
    }
    public static boolean checkPrime(int position) {

        if (position == 0 || position == 1)
            return false;

        for (int i = 2; i <= position / 2; ++i) {
            if (position % i == 0) {
                return false;
            }
        }

        return true;
    }
}
