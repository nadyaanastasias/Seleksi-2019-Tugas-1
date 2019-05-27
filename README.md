Terjadi perubahan topik menjadi katalog character dari gbf wiki dikarenakan website yang sebelumnya terlalu banyak gambar dan kurang informasi seperti tulisan serta dimasukan pada class HTML yang sama sehingga untuk melakukan web scraping kurang efisien 

Description
Web scraping dari gbf wiki digunakan untuk mengetahui semua nama karakter yang dimiliki oleh game grand blue fantasy ini serta memberikan informasi mengenai rarity dari masing masing karakter
Specification
Spesifikasi dari program ini adalah menggunakan library JSoup pada Java untuk melakukan webscraping pada URL https://gbf.wiki/All_Characters

How to use
1.	Cara menggunakan web scraping ini adalah memasukan link URL dari website yang ini discrape pada kali ini adalah gbf wiki
2.	Meminta izin terlebih dahulu kepada website
3.	Mencari elemen yang ingin di scrape pada website
4.	Mengambil elemen tersebut menggunakan Jsoup
5.	Parse data menjadi bentuk JSON 

Ideas and innovations in utilizing the data
1.	Data yang telah discrape dari website dapat digunakan untuk pembuatan grafik persebaran mengenai jumlah karakter per tipe untuk setiap rarity (N,R,SR dst.) sehingga dapat menjadi masukan kepada developer untuk rencana pengembangan karakter game di kedepannya agar jumlah rarity setiap tipe dapat diatur secara adil 
2.	Data yang telah discrape juga dapat digunakan sebagai character tracking dari game grandbluefantasy ini
JSON structure
{ Character { "Nama" : "Rarity"}}

Screenshoot program
Screenshot dari hasil data scraping
 https://drive.google.com/file/d/1uRDBbCwYtwLCQz0usksXVR4hMp4yG-xj/view?usp=sharing
 

Reference
1.	https://gbf.wiki/All_Characters
2.	https://www.youtube.com/watch?v=ZpBWXTa-aIg
3.	https://www.youtube.com/watch?v=tI1qGwhn_bs&t=307s
4.	https://www.youtube.com/watch?v=lZmuHyiKQdE&list=PL2k4Q1S5CYhHC0PIV5veJKMzLBO8I3ih3
5.	https://www.youtube.com/watch?v=ZtXXvtI8jcs&t=258s
6.	https://stackoverflow.com/questions/43250113/cant-figure-out-how-to-scrape-specific-text-using-jsoup
7.	https://jsoup.org/cookbook/extracting-data/attributes-text-html

Author
Nadya Anastasia
18217020
