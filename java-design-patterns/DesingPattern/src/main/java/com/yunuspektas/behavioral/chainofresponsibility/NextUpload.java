package com.yunuspektas.behavioral.chainofresponsibility;

abstract public class NextUpload {
    protected NextUpload nextUpload;

    public NextUpload getNextUpload() {
        return nextUpload;
    }

    public void setNextUpload(NextUpload nextUpload) {
        this.nextUpload = nextUpload;
    }

    abstract  public void uploadImage(Upload upload);
}
