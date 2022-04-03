
public class bangundatar extends gabungan{

//    persegi
    public int luaspersegi(){
        return getsisi() * getsisi() ;
    }
    public int kelilingpersegi(){
        return 4 * getsisi();
    }
   
//    persegi panjang
    public int luaspersegipanjang(){
        return getpanjang() * getlebar();
    }
     public int kelilingpersegipanjang (){
        return 2 * (getpanjang() + getlebar());
    }
     
//     lingkaran
    public double luaslingkaran(){
        return getjari() * getjari() * 3.14;
    }
    public double kelilinglingkaran(){
        return 2 * 3.14 * getjari();
    }
   
//    segitiga
    public int luassegitiga(){
        return (getalas() * gettinggi()) / 2;
    }
    
    public int kelilingsegitiga(){
        return getsisi() * getsisi() * getsisi();
    }
 
}
