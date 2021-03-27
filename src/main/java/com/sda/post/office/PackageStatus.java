package com.sda.post.office;

public enum PackageStatus {
    SENT("Wysłana"),
    TRAVELING("Podrozuje"),
    COURIER("W doreczeniu"),
    DELIVERED("Dostarczono"),
    LOST("Zagubiona"),
    RETURNED("Zwrocona");

    private String description;

    PackageStatus(String desc) {
        this.description = desc;
    }

    @Override
    public String toString() {
        return "PackageStatus{" +
                "description='" + description + '\'' +
                '}';
    }

    public static PackageStatus[] getErrorStatuses() {
        return new PackageStatus[]{LOST, RETURNED};
    }

    public boolean isError() {
        if (this == LOST || this == RETURNED) {
            return true;
        } else {
            return false;
        }
    }
}


