package com.sda.examples;

public class Example {
    String authorFirstName = "Jan";
    String authorLastName = "Kowalski";

    public Example() {
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }

    @Override
    public String toString() {
        return "Example{" +
                "authorFirstName='" + authorFirstName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                '}';
    }
}
