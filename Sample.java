package com.example;

public class Sample {

    public static String getColor(int rgb) {
        switch (rgb) {
        case 1:
            return "赤";
        case 2:
            // 本来は「緑」
            return "黒";
        case 3:
            return "青";
        }
        throw new IllegalArgumentException();
    }
}#   J a v a _ 1 6 . k a i h a t s u  
 S a m p l e T e s t . j a v a  
 