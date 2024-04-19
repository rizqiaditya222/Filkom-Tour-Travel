package model;


public class Mobil{
    private String noPlat;
    private String merkMobil;
    private String warnaMobil;
    private int tahunKeluaran;

public Mobil (){
}

public void setNoPlat (String noPlat){
    this.noPlat = noPlat;
}
public void setMerkMobil (String merkMobil){
    this.merkMobil = merkMobil;
}
public void setWarnaMobil (String warnaMobil){
    this.warnaMobil = warnaMobil;
}
public void setTahunKeluaran (int tahunKeluaran){
    this.tahunKeluaran = tahunKeluaran;
}

public String getNoPlat (){
    return this.noPlat;
}
public String getMerkMobil (){
    return this.merkMobil;
}
public String getWarnaMobil (){
    return this.warnaMobil;
}
public int getTahunKeluaran (){
    return this.tahunKeluaran;
}


public void display(int j){
    
    System.out.println("\nDATA MOBIL "+(j));
    System.out.println("=================================================");
    System.out.println(getNoPlat());
    System.out.println(getMerkMobil());
    System.out.println(getWarnaMobil());
    System.out.println(getTahunKeluaran());
    System.out.println("=================================================");

}

public void display2(){
}

}
