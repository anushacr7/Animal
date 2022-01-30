package com.company;

public class Rare {
    String Kingdom;
    String Phylum;
    String Class;
    String Order;
    String Infraorder;
    String Family;
    String Genus;
    String Species;
    String weight;
    String size;

     Rare(String Kingdom,String Phylum,String Class, String Order,String Infraorder,String Family,String Genus,
             String Species,String weight,String size)
    {
        this.Kingdom=Kingdom;
        this.Phylum=Phylum;
        this.Class=Class;
        this.Order=Order;
        this.Infraorder=Infraorder;
        this.Family=Family;
        this.Genus=Genus;
        this.Species=Species;
        this.weight=weight;
        this.size=size;
    }

    public static void main(String[] args) {
        Rare vaquita= new Rare("Animalia","Chordata","Mamalia","Artiodactyla", " Cetacea","Phocoenidae"," Phocoena","P.sinus","43kg","144cm");

        System.out.println(vaquita.Kingdom);
        System.out.println(vaquita.Phylum);
        System.out.println(vaquita.Class);
        System.out.println(vaquita.Order);
        System.out.println(vaquita.Infraorder);
        System.out.println(vaquita.Family);
        System.out.println(vaquita.Genus);
        System.out.println(vaquita.Species);
        System.out.println(vaquita.weight);
        System.out.println(vaquita.size);




    }
}
