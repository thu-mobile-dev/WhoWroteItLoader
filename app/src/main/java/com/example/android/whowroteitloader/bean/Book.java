package com.example.android.whowroteitloader.bean;

import java.util.List;

public class Book {
    public String kind;
    public List<Item> items;

    public class Item {
        public String kind;
        public String id;
        public String etag;
        public String selfLink;
        public VolumeInfo volumeInfo;

        public class VolumeInfo {
            public String title;
            public List<String> authors;
        }
    }
}
