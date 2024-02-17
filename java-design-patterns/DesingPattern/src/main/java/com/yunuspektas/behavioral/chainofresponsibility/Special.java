package com.yunuspektas.behavioral.chainofresponsibility;

public class Special extends NextUpload{
    @Override
    public void uploadImage(Upload upload) {
        if (upload.imagetype =="special")
            System.out.println("Özel resim formatı ");
        else
            nextUpload.uploadImage(upload);

    }
}
