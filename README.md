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

## Projede Kullanılan Tasarım Desenleri

### Singleton (Tekli)

Tek bir nesne oluşturulmasını zorunlu kılar.

**Uygulanan Dosyalar -** Database, KitapIslemleri

Veritabanını tek bir kez nesnesini oluşturuyoruz.

### Factory (Fabrika)

Bir nesne oluşturmak için yalnızca bir arabirim veya soyut sınıf tanımladığını, ancak alt sınıfların hangi sınıfın başlatılacağına karar vermesine izin verir , nesnenin nerede yaratılacağı sorununu çözer.

**Uygulanan Dosyalar -** GirisFactory, GirisEkranı, PersonelGiris, OgrenciGiris, OgretimElemaniGiris, TemelAnaGiris

Personel, öğrenci, öğretim elemanı ve temel giriş olmak üzere dört giriş çeşidinden GirisFactory ile nesnesi oluşturuldu. Hepsinin ortak fonksiyonu olan setVisible GirisEkranında belirtildi.

### Facade (Cephe)

Alt sistemi daha kolay kullanmak için tek ve birleştirici bir arayüz sağlar. Dolayısıyla alt sistemler arasındaki bağımlılıkları da olabildiğince asgari seviyede tutar.Bir sınıfın nesnesini yaratmak için bir arayüz tanımlanır, fakat hangi sınıfın nesnesinin oluşturulacağına alt sınıflar karar verir. PersonelAraEkran kendi altında birçok karmaşık yapıyı barındırdığından kullanımı kolaylaştırmak için bu patern uygun görüldü.

**Uygulanan Dosyalar -** PersonelAraEkran, PersonelAraEkranFacade, KitapEkrani, GeriTeslimEkrani, KullaniciEkrani, OduncAlmaEkrani, PersonelEkranOrtakIslemler

PersonelAraEkran da kitap, geriteslim, kullanıcı ve ödüçalma ekranları ilgili butonlarda facade.get………(ilgili ekran ismi noktalı yere gelecek) metoduyla çağrıldı. PersonelAraEkranFacade dosyasında tüm bu ekranların nesnesi ve bu nesneleri çağıran get metodları oluşturuldu. PersonelEkranOrtakIslemler dosyasında kitap, geriTeslim, kullanici ve ödünç ekranlarında ortak olan geridön setvisible tanımlandı. Ve bu ekranlarda override edilerek içi dolduruldu.

### Strategy (Strateji)

Bir sınıf davranışı veya algoritması çalışma zamanında değiştirilebilir. Her kardeş sınıf ayrı bir algoritmayı
yerine getirir. Hangi sınıfın kullanılacağına ise bir
başka nesne, çoğunlukla bağlam nesnesi karar verir.

**Uygulanan Dosyalar -** EkranIslemContext, EkranIslemStrategy, GeriTeslimEkrani, GeriTeslimIslemleri, KitapEkrani, KitapIslemleri, KullaniciEkrani, KullaniciIslemler, OduncAlmaEkrani, OduncIslemleri, OduncleriGorEkrani, OduncleriGorIslemleri, KitapYorumEkrani, YorumIslemleri, UyeOlEkrani, UyeIslemleri

GeriTeslim, kitap, kitapİşlemleri, kullanıcı, ödünçAlma, ödünçGörme, kitapYorum ve üyeOl ekranlarında ortak bir işlem gerçekleştirilmekte. Veritabanından ilgili bilgiler getirilmektedir. EkranIslemStrategy sayfasında bu bilgileri getiren fonksiyon tanımlandı. İlgili ekranın ilgili işlem dosyasında bu fonksiyonun içi dolduruldu. EkranIslemContext dosyasında bu fonksiyonu execute eden yani çalıştıran bir fonksiyon daha tanımlandı. Bu fonksiyon EkranIslemStrategy sayfasındaki fonksiyon değiştiğinde veya fonksiyon ekleme çıkarma yapıldığında dinamik olarak tek bir yerden buna uyum sağlama kontrol etme özelliği sunar. Bu sayede, farklı stratejileri dinamik olarak değiştirme ve çalışma zamanında uygulamada farklı davranışlar sağlama esnekliği sağlanır.

Son olarak da ilgili ekranda işlem oluşturulur, sonra EkranIslemContext nesnesine parametre olarak gönderilir. Ve ortak bilgi getiren fonksiyona yerleştirilir ve çalıştırma fonksiyonu da oluşturulmuş olur. Ardından da execute edilerek fonksiyon kullanılmış olur.

### Command (Komut)

Strategy, Command’in özel bir hali olarak görülebilir. İsteği yerine getiren metodun nesne olarak modellenmesidir.

**Uygulanan Dosyalar -** ButonKomutlar, TemelAnaGiris, UyeOlKomut, GirisYapKomut, SistemeErisimCommand

Sisteme kullanıcı iki yolla erişebilmekte giriş yaparak ya da üye olarak. Bu işlemleri ilgili butonlara tıklanınca gerçekleşiyor yani iki komut işleniyor. Önce bu komutları fonksiyonlarını ana bir ButonKomutlar dosyasında oluşturuyoruz ve görünürlüklerini belirleyen fonksiyonlarını da. Daha sonra bu komutları çalıştıracak bir execute fonksiyonunu SistemeErisimCommand sınıfında oluşturuyoruz. ButonKomutlar dosyasında oluşturduğumuz komutlar için bir de ilgili sınıflarını oluşturuyoruz, giris ve üye ol.

Sonra da bu sınıflarda ilgili fonksiyonlarını çağıryor ve çalıştırılması için execute içinde yazıyoruz. Son olarak TemelAnaGiris sayfasında önce buton komutlarını ardıncan ilgili komutları oluşturup ilgili buton clicked’inin altında execute ederek çalıştırıp visible ile ilgili ekranı görünür kılıyoruz.

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
