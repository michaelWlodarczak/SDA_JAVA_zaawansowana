package com.sda.generic;

public class GenericToolsApp {

    /*  public static void main(String[] args) {
          print("String");
          print(123);
          print(new Object());
      }
      //publ. stat. gen. zwracajaca void metoda o nazwie print
      public static <T> void print(T item){
          System.out.println(item.getClass());
          System.out.println(item.toString());
      } */

    public static <T> void hasDuplicate(T[] arrayT) {
        for (int i = 0; i < arrayT.length; i++) {
            for (int j = i + 1; j < arrayT.length; j++) {
                if (arrayT[i].equals(arrayT[j])) {
                    System.out.println("This method has duplicates: " + arrayT[i]);
                    return;
                }
            }
        }
        System.out.println("No duplicates found");
    }
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 6, 2, 8};
        String[] strings = new String[]{"Michal", "Ania", "Hania", "Wojtek", "Hania"};
        Integer[] integers1 = {1,4,5,8};
        hasDuplicate(integers);
        hasDuplicate(strings);
        hasDuplicate(integers1);
    }
}