Terjadi perubahan topik menjadi katalog character dari gbf wiki dikarenakan website yang sebelumnya terlalu banyak gambar dan kurang informasi seperti tulisan serta dimasukan pada class HTML yang sama sehingga untuk melakukan web scraping kurang efisien

Description
Web scraping dari gbf wiki digunakan untuk mengetahui semua nama karakter yang dimiliki oleh game grand blue fantasy ini serta memberikan informasi mengenai rarity dari masing masing karakter
Specification
Spesifikasi dari program ini adalah menggunakan library JSoup pada Java untuk melakukan webscraping pada URL <https://gbf.wiki/All_Characters>
How to use
Cara menggunakan web scraping ini adalah memasukan link URL dari website yang ini discrape pada kali ini adalah gbf wiki
Meminta izin terlebih dahulu kepada website
Mencari elemen yang ingin di scrape pada website
Mengambil elemen tersebut menggunakan Jsoup
Parse data menjadi bentuk JSON

Ideas and innovations in utilizing the data
Data yang telah discrape dari website dapat digunakan untuk pembuatan grafik persebaran mengenai jumlah karakter per tipe untuk setiap rarity (N,R,SR dst.) sehingga dapat menjadi masukan kepada developer untuk rencana pengembangan karakter game di kedepannya agar jumlah rarity setiap tipe dapat diatur secara adil
Data yang telah discrape juga dapat digunakan sebagai character tracking dari game grandbluefantasy ini
JSON structure
{ Character { "Nama" : "Rarity"}}

Screenshoot program
Screenshot dari hasil data scraping

Reference
<https://gbf.wiki/All_Characters>
<https://www.youtube.com/watch?v=ZpBWXTa-aIg>
<https://www.youtube.com/watch?v=tI1qGwhn_bs&t=307s>
<https://www.youtube.com/watch?v=lZmuHyiKQdE&list=PL2k4Q1S5CYhHC0PIV5veJKMzLBO8I3ih3>
<https://www.youtube.com/watch?v=ZtXXvtI8jcs&t=258s>
<https://stackoverflow.com/questions/43250113/cant-figure-out-how-to-scrape-specific-text-using-jsoup>
<https://jsoup.org/cookbook/extracting-data/attributes-text-html>

Author
Nadya Anastasia
18217020
