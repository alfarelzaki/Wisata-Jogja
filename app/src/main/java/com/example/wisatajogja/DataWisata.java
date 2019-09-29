package com.example.wisatajogja;

import java.util.ArrayList;

public class DataWisata {
    private static int[] idWisata = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    };

    private static String[] namaWisata = {
            "Malioboro, Wisata Jogja yang Tak Boleh Ketinggalan",
            "Keraton Jogja, Tempat Tahta dan Wujud Nyata Budaya Jawa",
            "Wisata Taman Sari, Mengkhayalkan Para Putri",
            "Senja Cantik Prambanan",
            "Istana Ratu Boko, Reruntuhan Balairung Para Raja",
            "Wisata Alam Kalibiru, Memandang Wisata Jogja yang Bikin Haru",
            "Jogja Bay Waterpark",
            "Wisata Gumuk Pasir",
            "Gua Jomblang",
            "Taman Tebing Breksi",
            "Puncak Kosakora"
    };

    private static String[] detailWisata = {
            "Maliboro merupakan salah satu kawasan yang begitu populer di Jogja. Wisata ini menjadi salah satu ikon Jogja, baik untuk wisatawan lokal ataupun internasional. Jalanan di sekitaran menyuguhkan beragam barang, mulai dari pernak-pernik khas Jogja, aksesoris, baju, bahkan sampai makanan juga ada. Satu hal lagi, di malam hari Teman Traveler bisa menyaksikkan atraksi musik jalanan yang asyik.",
            "Destinasi lain di Jogja yang begitu populer adalah Keraton Jogja yang menyuguhkan beragam saksi bisu kehidupan kerjaan di masa lampau. Bahkan sampai saat ini Keraton Jogja ini jadi tempat tinggal sultan dan juga keluarganya. Karena juga difungsikan sebagai tempat wisata, ada beberapa tempat yang memang terlarang untuk didatangi.",
            "Dahulu lokasi ini merupakan tempat pemandian yang berkaitan erat dengan kerajaan Jogja. Maka dari itulah, saat datang ke sini kamu akan menemui kolam besar dan memiliki air yang cukup jernih. Bangunan-bangunan di sekitar sini juga khas Kerajaan, bisa banget untuk dijadikan tempat hunting foto. Siapkan OOTD-mu ya Teman Traveler.",
            "Jika Magelang memiliki Borobudur yang begitu populer, Jogja mempunyai Candi Prambanan. Candi ini juga terkenal di Indonesia dan sudah ditetapkan sebagai situs bersejarah warisan dunia oleh UNESCO. Wisata Jogja satu ini memang sangat menarik, tak heran banyak wisatawan lokal ataupun asing yang berkunjung saat musim liburan datang.",
            "Jika berkunjung ke Prambanan, destinasi lain yang sangat sayang untuk dilewatkan adalah Istana Ratu Boko. Sebagai informasi, Istana Ratu Boko ini merupakan kerajaan termegah pada zamannya yang dibangun sejak abad ke-8. Lokasinya memang benar-benar menakjubkan. Teman Traveler bahkan bisa menyaksikan kemegahan Candi Prambanan di sini. Satu hal lagi yang sangat sayang untuk dilewatkan, yakni menyaksikkan sunset ataupun juga sunrise yang begitu memikat.",
            "Desa Wisata Kalibiru menyuguhkan panorama alam yang keindahnnya bisa bikin terheran-heran. Banyak hal yang bisa Teman Traveler lakukan, mulai dari bersantai-santai sambil menikmati panorama sekitar, berpose di gardu pandang, dan masih banyak lagi. Bahkan, aktivitas menantang seperti halnya flying fox juga disediakan di sini.",
            "Jika tidak terlalu tertarik dengan wisata alam, Teman Traveler bisa berkunjung ke Jogja Bay yang menyuguhkan beragam permainan. Cocok untuk destinasi wisata kelurga yang merencanakan liburan ke Jogja. Ini merupakan waterpark terbesar di Indonesia yang memiliki luas 7,7 hektar, dengan rincian 5 hektar area utama dan 2,7 hektar area hijau dan lahan parkir.",
            "Tidak kalah eksotis dari Taman Tebing Breksi yakni Gumuk Pasir. Salah satu aktivitas yang sangat asyik untuk dilakukan di sini adalah sandboarding. Hal unik lainnya adalah adanya taman bunga yang bisa digunakan untuk berfoto ria. Karena lokasinya yang begitu eksotis, selain jadi destinasi wisata, tempat ini juga kerap jadi loaksi syuting video klip artis-artis ternama.",
            "Gua Jomblang adalah wisata Jogja yang cukup unik. Disebut juga Gua Vertikal karena untuk masuk ke sini, pengunjung harus menggunakan peralatan khusus. Gua Jomblang terbentuk karena proses geologi. Di mana, tanah yang berada di lokasi ambles disertai dengan tumbuhan yang ada di atasnya pada ribuan tahun yang lalu. Dengan kata lain, proses tersebut membentuk sumur berukuran raksasa dan sangat dalam.",
            "Ingin cari lokasi yang beda dari yang lainnya saat berwisata di Jogja? Taman Tebing Breksi ini bisa jadi pilihan yang tepat. Taman ini menyuguhkan panorama bebatuan breksi yang sengaja dipahat menjadi ukiran yang cantik. Jika dilihat sekilas, memang wisata Jogja ini menyerupai Brown Canyon di Semarang.",
            "Puncak Kasakora merupakan salah satu lokasi yang banyak difavoritkan wisatawan. Pasalnya, wisata di Jogja satu ini memiliki panorama yang indah di sekitaran pantai. Perpaduan antara pemandangan perbukitan, laut, ditambah dengan sunrise memang bikin orang terkagum-kagum. Jangan lupa mampir ke Puncak Kosakora jika jelajah Gunungkidul saat di Jogja."
    };

    private static int[] fotoWisata = {
            R.drawable.malioboro,
            R.drawable.keraton,
            R.drawable.taman_sari,
            R.drawable.prambanan,
            R.drawable.istana_ratu_boko,
            R.drawable.kali_biru,
            R.drawable.jogja_bay,
            R.drawable.gumuk_pasir,
            R.drawable.gua_jomblang,
            R.drawable.taman_tebing,
            R.drawable.kosa_kora
    };

    private static String[] lokasiWisata = {
            "Malioboro",
            "Jl. Rotowijayan Blok No. 1, Panembahan, Kraton, Jogjakarta",
            "Kampung Taman Sari No. 310, Taman, Patehan, Kraton, Jogja",
            "Bokoharjo, Prambanan, Sleman, Jogja",
            "Jl. Raya Piyungan - Prambanan No.KM.2, Gatak, Bokoharjo, Prambanan, Sleman, Jogja",
            "Jl. Waduk Sermo, Desa Hargowilis, Kecamatan Kokap, Kabupaten Kulonprogo",
            "Jl. Utara Stadion, Maguwoharjo, Depok, Sleman",
            "Jl. Pantai Parangkusumo, Parangtritis, Kecamatan Kretek, Bantul.",
            "Desa Pacarejo, Kecamatan Semanu, Kabupaten Gunung Kidul.",
            "Pedukuhan Nglengkong, Groyokan Sambirejo, Prambanan.",
            "Banjarejo, Tanjungsari, Ngetisrejo, Tanjungsari, Gunungkidul."
    };

    static ArrayList<Wisata> getListData() {
        ArrayList<Wisata> list = new ArrayList<>();
        for (int i = 0; i < namaWisata.length; i++) {
            Wisata wisata = new Wisata();
            wisata.setId(idWisata[i]);
            wisata.setNama(namaWisata[i]);
            wisata.setLokasi(lokasiWisata[i]);
            wisata.setDetail(detailWisata[i]);
            wisata.setFoto(fotoWisata[i]);
            list.add(wisata);
        }
        return list;
    }
}
