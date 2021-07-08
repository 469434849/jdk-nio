package com.zhimzhou.spi;

public class AUpload implements IUpload{

    @Override
    public void upload(String url) {
        System.out.println("this is AUpload.");
    }
}
