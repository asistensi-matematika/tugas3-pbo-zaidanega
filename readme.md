# TUGAS 3 ASISTENSI PBO - Jumat, 4 Oktober 2019

NAMA: MUHAMMAD ZAIDAN EGARALINSYAH SETIAWAN

NRP: 06111840000066

## Deskripsi Soal
Buat class **LinearEquation** untuk sistem persamaan linear 2x2:
* ax+by=e
* cx+dy=f
* x = (ed-bf)/(ad-bc)
* y = (af-ec)/(ad-bc)

Ketentuan class-nya:
* Menggunakan modifier **private** untuk a, b, c, d, e, f.
* Konstruktor kosong dan konstruktor dengan argumen a, b, c, d, e, f.
* method **setter** dan **getter** untuk a, b, c, d, e, f.
* Sebuah method **cekSolusi** untuk mengecek apakah persamaan yang diinputkan memiliki solusi atau tidak. Tidak memiliki solusi jika ad-bc=0

Buat juga **Diagram UML** dan **main class** untuk mengimplementasikan semua method di class **LinearEquation** yang kalian buat.

## Contoh
Contoh 1:
![](/img/1.png)

Penjelasan:
* a=4,b=-5,c=7,d=7,e=10,f=12
* x=  (10*7-(-5)*12)/(4*7-(-5)*7)=130/63=2,06
* y=  (4*12-10*7)/(4*7-(-5)*7)= -22/63≈-0,35

Contoh 2:
![](/img/2.png)
Penjelasan:
ad-bc=2*3-3*2=0
Karena penyebut nya 0, maka tidak memiliki solusi.

## Soal
Input 	: 12 5 13 0 12 7

Output	: ...


Input 	: -18 9 10,5 11 0 0

Output	: ...


### 1 extra mile
soal opsional, tapi selesaikan semua soal di atas terlebih dahulu

![](/img/3.png)

## Screenshot hasil
SOAL 1

![SOAL1](https://user-images.githubusercontent.com/55585415/66630042-980a3500-ec2d-11e9-9524-d8cd61ba5c16.jpg)

SOAL 2

![SOAL2](https://user-images.githubusercontent.com/55585415/66630043-98a2cb80-ec2d-11e9-8c3d-697df7d98b99.jpg)


## Upload
upload seluruh folder project java-nya ke repository ini
