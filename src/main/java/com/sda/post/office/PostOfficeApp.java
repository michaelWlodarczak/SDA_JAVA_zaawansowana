package com.sda.post.office;

import java.time.LocalDate;
import java.time.Month;

public class PostOfficeApp {
    public static void main(String[] args) {
        PackageStatus sent = PackageStatus.SENT;
        System.out.println(sent.name());
        Package paczka = new Package(PackageStatus.COURIER, "zabytki");
        Package myPackage = new Package(PackageStatus.SENT, "toys");
        System.out.println(myPackage);

        PackageStatus[] packageStatuses = PackageStatus.values();
        for (PackageStatus packageStatus : packageStatuses) {
            System.out.println(packageStatuses);
        }
        PackageStatus packageStatus = PackageStatus.valueOf("LOST");
        System.out.println(packageStatus);

        LocalDate date = LocalDate.of(1994, Month.DECEMBER,15);
        Month december = Month.of(12);
        System.out.println(december);

        PackageStatus [] errorStatus = PackageStatus.getErrorStatuses();
        for (PackageStatus obiekt: errorStatus){
            System.out.println(obiekt);
        }

        System.out.println(PackageStatus.LOST.isError());
        System.out.println(PackageStatus.DELIVERED.isError());

    }
}
