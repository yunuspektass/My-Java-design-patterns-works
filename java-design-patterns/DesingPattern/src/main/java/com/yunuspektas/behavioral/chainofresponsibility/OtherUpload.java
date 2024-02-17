package com.yunuspektas.behavioral.chainofresponsibility;

public class OtherUpload extends NextUpload{
    @Override
    public void uploadImage(Upload upload) {
        if (upload.imagetype =="other")
            System.out.println("Başka türden resim formatı ");
    }
}
