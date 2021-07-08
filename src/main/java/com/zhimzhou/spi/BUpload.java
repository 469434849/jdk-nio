package com.zhimzhou.spi;

public class BUpload implements IUpload {

    @Override
    public void upload(String url) {
        System.out.println("this is BUpload.");
    }
}
