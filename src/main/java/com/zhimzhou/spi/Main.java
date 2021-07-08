package com.zhimzhou.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<IUpload> uploads = ServiceLoader.load(IUpload.class);
        Iterator<IUpload> iterator = uploads.iterator();
        while (iterator.hasNext()) {
            IUpload u = iterator.next();
            u.upload("url");
        }
        System.setSecurityManager(new SecurityManager());
    }
}
