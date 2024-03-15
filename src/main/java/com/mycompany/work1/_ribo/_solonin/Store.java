package com.mycompany.work1._ribo._solonin;

public class Store {

    String name;

    public Store (){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the name: ");
        this.name = scanner.nextLine();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        
}
