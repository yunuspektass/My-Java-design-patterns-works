package com.yunuspektas.behavioral.chainofresponsibility;

public class Upload {
// Chain of responsibility belirli bi işlemi arka arkaya yapmak istediğimiz sınıflar için kullanılır
public String imageName;
public String imagetype;

    public Upload(String imageName, String imagetype) {
        this.imageName = imageName;
        this.imagetype = imagetype;
    }
}
