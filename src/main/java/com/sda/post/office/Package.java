package com.sda.post.office;

import java.util.UUID;

public class Package {
    private PackageStatus status;
    private String content;
    private String id;

    public Package(PackageStatus status, String content) {
        this.status = status;
        this.content = content;
        this.id = UUID.randomUUID().toString();  // UUID randomowe liczby do stringa
    }

    @Override   // Alt + Insert -> toString
    public String toString() {
        return "Package{" +
                "status=" + status +
                ", content='" + content + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    void changeStatus(PackageStatus packageStatus){
        this.status = packageStatus;



}


}