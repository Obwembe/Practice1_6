package com.mycompany.work1._ribo._solonin;

public class Work16_RIBO0322_Solonin {

    public static void main(String[] args) {
       
       System.out.print("SOLONIN EGOR ANDREEVICH RIBO-03-22 VARIANT 5(15) \n");
        
       Store store1 = new Store();
       Store store2 = new Store();
       Store store3 = new Store();
       String name1 = store1.getName();
       String name2 = store2.getName();
       String name3 = store3.getName();
       Revisor revisor = new Revisor();
       
       store1.setName(revisor.rebrand(name1));
       store2.setName(revisor.rebrand(name2));
       store3.setName(revisor.rebrand(name3));
       
       System.out.print("Rebrand \n" + "Store 1:" + store1.getName() + "\n" + "Store 2:" + store2.getName()+ "\n" + "Store 3:" + store3.getName() + "\n");
       
       store1.setName(revisor.closeStore(name1));
       store2.setName(revisor.closeStore(name2));
       store3.setName(revisor.closeStore(name3));
       
       System.out.print("Close \n" + "Store 1:" + store1.getName() + "\n" + "Store 2:" + store2.getName()+ "\n" + "Store 3:" + store3.getName() + "\n");       
    }
}
