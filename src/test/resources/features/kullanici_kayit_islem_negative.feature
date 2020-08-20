@kayitHataMesaji
Feature: Kullanici_Kayit_Hata_Mesaji
Scenario: Geçersiz email ve password hatasını doğrulayın.
Given user web sayfasinda
And user sign in linkine tiklar
And email kutusuna gecersiz email adresi yazar ve enter'a tiklar
Then error mesajinin  Authentication failed.oldugunu dogrulayin