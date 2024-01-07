# Kütüphane Otomasyonu

<svg xmlns="http://www.w3.org/2000/svg" height="11" width="11" viewBox="0 0 512 512"><path fill="#3fab41" d="M256 512A256 256 0 1 0 256 0a256 256 0 1 0 0 512zM216 336h24V272H216c-13.3 0-24-10.7-24-24s10.7-24 24-24h48c13.3 0 24 10.7 24 24v88h8c13.3 0 24 10.7 24 24s-10.7 24-24 24H216c-13.3 0-24-10.7-24-24s10.7-24 24-24zm40-208a32 32 0 1 1 0 64 32 32 0 1 1 0-64z"/></svg> **Dersin Kodu:** [16303](https://ebp.klu.edu.tr/Ders/dersDetay/YAZ16303/716026/tr)

<svg xmlns="http://www.w3.org/2000/svg" height="16" width="11" viewBox="0 0 512 512"><path fill="#3fab41" d="M256 512A256 256 0 1 0 256 0a256 256 0 1 0 0 512zM216 336h24V272H216c-13.3 0-24-10.7-24-24s10.7-24 24-24h48c13.3 0 24 10.7 24 24v88h8c13.3 0 24 10.7 24 24s-10.7 24-24 24H216c-13.3 0-24-10.7-24-24s10.7-24 24-24zm40-208a32 32 0 1 1 0 64 32 32 0 1 1 0-64z"/></svg> **Dersin Adı:** [YAZILIM MİMARİSİ VE TASARIMI](https://ebp.klu.edu.tr/Ders/dersDetay/YAZ16303/716026/tr)

<svg xmlns="http://www.w3.org/2000/svg" height="16" width="11" viewBox="0 0 512 512"><path fill="#3fab41" d="M256 512A256 256 0 1 0 256 0a256 256 0 1 0 0 512zM216 336h24V272H216c-13.3 0-24-10.7-24-24s10.7-24 24-24h48c13.3 0 24 10.7 24 24v88h8c13.3 0 24 10.7 24 24s-10.7 24-24 24H216c-13.3 0-24-10.7-24-24s10.7-24 24-24zm40-208a32 32 0 1 1 0 64 32 32 0 1 1 0-64z"/></svg> **Dersin Öğretim Elemanı:** Öğr. Gör. Dr. Fatih BAL [Github](https://github.com/balfatih) | [Web Sayfası](https://balfatih.github.io/)

---

## Grup Bilgileri

| Öğrenci No | Adı Soyadı     | Bölüm                | Proje Grup No | Grup Üyelerinin Github Profilleri          |
| ---------- | -------------- | -------------------- | ------------- | ------------------------------------------ |
| 1210505027 | Pelin Üstünel  | Yazılım Mühendisliği | PROJE_10      | [Github](https://github.com/pelinustunel)  |
| 1210505002 | Reyhan Türkkal | Yazılım Mühendisliği | PROJE_10      | [Github](https://github.com/reyhanturkkal) |
| 1210505034 | Hüseyin Aktaş  | Yazılım Mühendisliği | PROJE_10      | [Github](https://github.com/huseynaktas)   |

---

<br>

# Proje Açıklaması

## Amaç

Bu proje, bir kütüphanenin günlük operasyonlarını düzenleyen ve kolaylaştıran bir otomasyon sistemidir. Projenin temel amacı, kitapların yönetimi, ödünç alma/iade işlemleri, kullanıcı kayıtları ve kitap yorum işlemleri etkili bir şekilde gerçekleştirmektir.

## Kapsam

Proje, aşağıdaki temel özelliklere sahiptir:

**Kitap Yönetimi**: Kitapların eklenmesi, silinmesi, güncellenmesi ve listelenmesi gibi işlemleri içerir. Her kitap için başlığı, yazarı, sayfa sayısı, kategorisi gibi bilgiler kaydedilir.

**Ödünç Alma/Iade İşlemleri**: Kullanıcılar kitapları ödünç alabilir ve iade edebilir. Ödünç alınan kitapların alınma ve teslim edilme sürelerin, takip edilir.

**Kullanıcı Yönetimi**: Kullanıcılar sisteme kaydedilir, güncellenir ve silinir.

**Ödünç Takibi**: Kütüphanedeki mevcut kitapların kimler tarafından ödünç alındığı bilgileri tutulur.

**Yorum Yönetimi**: Kullanıcılar istedikleri kitaplara yorum ve puanlama yapabilmektedirler.

**Kullanılan Teknolojiler**:
Veritabanı: MySQL Workbench kullanılarak oluşturulan bir veritabanı, kitap, üye, ödünç alma, yorum bilgilerini depolamaktadır.

**Programlama Dili**: Java kullanılmıştır.

**IDE**: NetBeans IDE'nin GUI tasarım araçları ile birlikte kullanıcı arayüzü geliştirilmiştir.

---

## Proje Dosya Yapısı

Projenizin dosya yapısını açıklayan bir bölüm ekleyebilirsiniz. Örneğin:

- **/src**
  - **/model**
    - `Database.java`
  - **/view**
    - `GeriTeslimEkrani.java`
    - `GirisYapEkrani.java`
    - `KitapEkrani.java`
    - `KitapYorumEkrani.java`
    - `KullaniciEkrani.java`
    - `OduncAlmaEkrani.java`
    - `OduncYorumEkrani.java`
    - `OduncleriGorEkrani.java`
    - `OgrenciGiris.java`
    - `OgretimElemaniGiris.java`
    - `PersonelAraEkrani.java`
    - `PersonelGiris.java`
    - `TemelAnaGiris.java`
    - `UyeOlEkrani.java`
  - **/controller**
    - `ButonKomutlar.java`
    - `EkranIslemStrategy.java`
    - `EkranIslemContext.java`
    - `GeriTeslimIslemleri.java`
    - `GirisEkrani.java`
    - `GirisYapKomut.java`
    - `Kitap.java`
    - `KitapIslemler.java`
    - `KullaniciIslemleri.java`
    - `Odunc.java`
    - `OduncIslemleri.java`
    - `OduncleriGor.java`
    - `OduncleriGorIslemleri.java`
    - `PersonelAraEkranFacade.java`
    - `PersonelEkranOrtakIslemler.java`
    - `SistemeErisimCommand.java`
    - `UyeIslemleri.java`
    - `UyeOlKomutlari.java`
    - `Uyeler.java`
    - `Yorum.java`
    - `YorumIslemleri.java`
- `README.md`
- `LICENSE`

---

## Kurulum

### Depoyu Klonlama:

Projenin GitHub deposunu yerel bilgisayarınıza klonlayın.
bash
Copy code
git clone https://github.com/kullanici_adiniz/proje_adiniz.git
NetBeans IDE'yi Açma:

NetBeans IDE'yi açın ve projeyi NetBeans üzerinden açın.

### Veritabanı Bağlantısı:

MySQL Workbench üzerinde projenin kullanacağı veritabanını içe aktarın.
Neatbeans projesinde database.java içinde gerekli bağlantıları yapın.

NetBeans üzerinden projeyi derleyin ve çalıştırın.
Uygulama başladığında, kullanıcı arayüzüne erişebileceksiniz.

---

## Kullanım

Kütüphane otomasyon sistemine Temel Ana Giriş sayfasını çalıştırarak gerekli çalışmaları ilgili butonlarla yapabilirsiniz.

---

## Katkılar

### Udemy

https://www.udemy.com/course/sifirdan-ileri-seviyeye-komple-java-gelistirici-kursu/?start=990#overview

### Web Sitesi

https://www.javatpoint.com/design-patterns-in-java

https://www.geeksforgeeks.org/java-design-patterns/

https://refactoring.guru/design-patterns/java

https://www.tutorialspoint.com/design_pattern/index.htm

https://java-design-patterns.com/

### Github

https://github.com/balfatih/YAZ16303_Yazilim_Mimarisi_ve_Tasarimi

https://github.com/yusufyilmazfr/tasarim-desenleri-turkce-kaynak

### Medium

https://medium.com/@saygiligozde/design-patterns-in-java-5251032ca244

---

## İletişim

1210505034@ogr.klu.edu.tr <br>
1210505002@ogr.klu.edu.tr <br>
1210505027@ogr.klu.edu.tr
