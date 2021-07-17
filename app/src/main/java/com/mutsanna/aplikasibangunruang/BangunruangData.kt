package com.mutsanna.aplikasibangunruang

object BangunruangData {
    private val bangunruangNames = arrayOf(
            "Kubus",
            "Balok",
            "Prisma Segitiga",
            "Prisma Segilima",
            "Tabung",
            "Bola",
            "Limas",
            "Limas Segitiga",
            "Kerucut",
            "Kerucut Terpancung")

    private val bangunruangDetails = arrayOf(
            "Kubus adalah bangun ruang tiga dimensi yang dibatasi oleh enam bidang sisi yang kongruen berbentuk bujur sangkar. Kubus memiliki 6 sisi, 12 rusuk, dan 8 titik sudut.",
            "Balok adalah bangun ruang tiga dimensi yang dibentuk oleh tiga pasang persegi atau persegi panjang, dengan paling tidak satu pasang di antaranya berukuran berbeda. Balok memiliki 6 sisi, 12 rusuk dan 8 titik sudut.",
            "Prisma segitiga adalah salah satu bangun ruang yang dibatasi oleh dua buah segitiga yang sejajar dan kongruen sebagai sisi alas dan sisi atas, serta dibatasi juga dengan tiga buah sisi tegak yang berbentuk persegi panjang.",
            "Prisma segilima adalah bangun ruang yang dibatasi oleh dua buah bidang segilima yang sejajar dan kongruen serta bidang-bidang tegak yang menghubungkan bidang segilima tersebut.",
            "Tabung atau silinder adalah bangun ruang tiga dimensi yang dibentuk oleh dua buah lingkaran identik yang sejajar dan sebuah persegi panjang yang mengelilingi kedua lingkaran tersebut. Tabung memiliki 3 sisi dan 2 rusuk.",
            "bola adalah bangun ruang tiga dimensi yang dibentuk oleh tak hingga lingkaran berjari-jari sama panjang dan berpusat pada satu titik yang sama. Bola hanya memiliki 1 sisi.",
            "limas adalah bangun ruang tiga dimensi yang dibatasi oleh alas berbentuk segi-n dan sisi-sisi tegak berbentuk segitiga. Limas memiliki n + 1 sisi, 2n rusuk dan n + 1 titik sudut. Kerucut dapat disebut sebagai limas dengan alas berbentuk lingkaran. Limas dengan alas berupa persegi disebut juga piramida.",
            "Limas adalah jenis bangun ruang yang mempunyai sisi alas berbentuk segi-n dan mengerucut ke satu titik sehingga terbentuk sisi-sisi tegak berbentuk segitiga. Jumlah unsur-unsur pembentuk limas adalah n + 1 sisi, 2 × n rusuk, dan n + 1 titik sudut; dengan n adalah jumlah sisi bangun datar yang menjadi alas limas.",
            "kerucut adalah sebuah limas istimewa yang beralas lingkaran. Kerucut memiliki 2 sisi, 1 rusuk, dan 1 titik sudut. Sisi tegak kerucut tidak berupa segitiga tapi berupa bidang miring yang disebut selimut kerucut.",
            "kerucut terpancung adalah kerucut yang dipotong oleh sebuah bidang yang sejajar dengan bidang alas, maka bagian kerucut yang terletak antara bidang alas dengan bidang itu beserta interiornya dinamakan dengan kerucut terpancung."
    )

    private val bangunruangImages = intArrayOf(
            R.drawable.kubus,
            R.drawable.balok,
            R.drawable.prismasegitiga,
            R.drawable.prismasegilima,
            R.drawable.tabung,
            R.drawable.bola,
            R.drawable.limas,
            R.drawable.limassegitiga,
            R.drawable.kerucut,
            R.drawable.kerucutterpacung
    )

    private val bangunruangRumus = arrayOf(
        "Luas : \nL = 6 x s² \nVolume : \nV = s x s x s",
        "Luas Permukaan : \nL = 2 × (p.l + p.t +l.t) \nPanjang : \np = V ÷ l ÷ t \nLebar : \nl = V ÷ p ÷ t \nTinggi : \nt = V ÷ p ÷ l",
        "Luas Permukaan : \nL = (2 x luas alas) + (luas seluruh sisi tegak) \nVolume : \nV = luas alas × tinggi",
        "Volume : \nV = 5(1/2 x alas segitiga x tinggi segitiga) x tinggi prisma",
        "Volume tabung : \nluas alas x tinggi \nLuas alas : \nluas lingkaran = π r 2 \nVolume tabung : \n π r 2 t \nKeliling lingkaran alas atau tutup :\n2 π r \nLuas Permukaan Tabung : \n2 (π r 2 )+ 2 π r t = 2 π r ( r + t )",
        "Volume : \nV = 4/3 × π × r³ \nLuas Permukaan : \nL = 4 × π × r²",
        "Volume : \nV = 1/3 x Luas Alas x Tinggi",
        "Luas Alas : \nLa = ½ x alas segitiga x tinggi segitiga",
        "Luas Permukaan : \nL = pi x r x (r + S) \nVolume : \nV = 1/3 x pi x r^2 x t",
        "Luas Permukaan : \nπ r(s + r) \nVolume : \nV = 1/3 π r² t"
    )

    val lisData: ArrayList<Bangunruang>
        get() {
            val list = arrayListOf<Bangunruang>()
            for (position in bangunruangNames.indices){
                val bangunruang = Bangunruang()
                bangunruang.name = bangunruangNames[position]
                bangunruang.detail = bangunruangDetails[position]
                bangunruang.photo = bangunruangImages[position]
                bangunruang.rumus = bangunruangRumus[position]
                list.add(bangunruang)
            }
            return list
        }
}