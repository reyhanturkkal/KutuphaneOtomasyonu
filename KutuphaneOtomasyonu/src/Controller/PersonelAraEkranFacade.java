package Controller;

import View.OduncAlmaEkrani;
import View.KullaniciEkrani;
import View.KitapEkrani;
import View.GeriTeslimEkrani;
import java.awt.Frame;

public class PersonelAraEkranFacade {
    private KitapEkrani kitapEkraniPersonel;
    private KullaniciEkrani kullaniciEkraniPersonel;
    private GeriTeslimEkrani geriTeslimEkraniPersonel;
    private OduncAlmaEkrani oduncEkraniPersonel;
    
    public PersonelAraEkranFacade(){
        // Örnek bir Frame kullanarak KitapEkrani örneği oluşturuluyor
        Frame parentFrame = new Frame(); // Burada uygun bir Frame tanımlayın
        boolean modal = true; // veya false, uygun olanı seçin
        
        kitapEkraniPersonel = new KitapEkrani(parentFrame, modal);
        kullaniciEkraniPersonel = new KullaniciEkrani(parentFrame, modal);
        oduncEkraniPersonel = new OduncAlmaEkrani(parentFrame, modal);
        geriTeslimEkraniPersonel = new GeriTeslimEkrani(parentFrame, modal);
    }
    
    public KitapEkrani getKitapEkran() {
        return kitapEkraniPersonel;
    }
    
    public KullaniciEkrani getKullaniciEkran() {
        return kullaniciEkraniPersonel;
    }
    
    public OduncAlmaEkrani getOduncEkran() {
        return oduncEkraniPersonel;
    }
    
    public GeriTeslimEkrani getTeslimEkran() {
        return geriTeslimEkraniPersonel;
    }
}
