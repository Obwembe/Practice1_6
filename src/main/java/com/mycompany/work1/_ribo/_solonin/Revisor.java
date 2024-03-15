package com.mycompany.work1._ribo._solonin;

public class Revisor {

   public String rebrand (String name){
        if (java.util.Objects.equals("Vkusno i tochka", name)){
        name = "MacDonalds";
        }
        else{
            name = name.substring(1);
        }
        return name;
   }
   
   public String closeStore (String name){
       if (java.util.Objects.equals("IKEA", name)){
           name = null;
       }
       return name;
   }
          
}
