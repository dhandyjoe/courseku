package com.example.course_ku

object DataCourse {

    private val image = intArrayOf(
        R.drawable.html,
        R.drawable.css,
        R.drawable.java,
        R.drawable.javascript,
        R.drawable.git,
        R.drawable.github,
        R.drawable.kotlin,
        R.drawable.mysql,
        R.drawable.php,
        R.drawable.python
    )

    private val name = arrayOf(
        "HTML",
        "CSS",
        "Java",
        "Javascript",
        "Git",
        "Github",
        "Kotlin",
        "MySQL",
        "PHP",
        "Python"
    )

    private val rating = arrayOf(
        "Rating 4.5",
        "Rating 5",
        "Rating 4.5",
        "Rating 4",
        "Rating 4",
        "Rating 3",
        "Rating 5",
        "Rating 3.5",
        "Rating 5",
        "Rating 5"
    )

    private val pengajar = arrayOf(
        "Pengajar : Sidiq Permana",
        "Pengajar : Arik Achmad Efendy",
        "Pengajar : Nur Rohman",
        "Pengajar : Bayu Teguh Pamuji",
        "Pengajar : Ahmad Arif Faizin",
        "Pengajar : Gilang Ramadhan",
        "Pengajar : Angga Pratama",
        "Pengajar : Easbi Ikhsan",
        "Pengajar : Dimas Pratama",
        "Pengajar : Satria Junanda"
    )

    private val modul = arrayOf(
        "30 Modul",
        "40 Modul",
        "35 Modul",
        "38 Modul",
        "24 Modul",
        "50 Modul",
        "29 Modul",
        "24 Modul",
        "48 Modul",
        "43 Modul"
    )

    private val jam = arrayOf(
        "40 Jam",
        "44 Jam",
        "42 Jam",
        "46 Jam",
        "43 Jam",
        "38 Jam",
        "50 Jam",
        "24 Jam",
        "37 Jam",
        "47 Jam"
    )

    private val biaya = arrayOf(
        "GRATIS",
        "GRATIS",
        "BERBAYAR",
        "GRATIS",
        "BERBAYAR",
        "BERBAYAR",
        "GRATIS",
        "GRATIS",
        "BERBAYAR",
        "GRATIS"
    )

    private val deskripsi = arrayOf(
        // HTML
        "\t\t\tKursus ini bertujuan agar peserta mahir dan paham dokumen dan komponen-komponen HTML. Materi kursus ini diberikan dalam bentuk tugas pembuatan dokumen HTML dan bahan untuk belajar HTML.  Berbeda dengan kursus HTML online lainnya, kursus ini lebih menekankan kepada pengerjaan tugas-tugas HTML. Tugas yang sudah dikerjakan akan diperiksa oleh sistem kami secara otomatis dan online. Sistem kami yang akan menentukan apakah peserta sudah mengerjakan tugas dengan benar, baik hasilnya ataupun algoritmanya. Peserta dituntut untuk mengerjakan semua tugas dengan benar sebagai syarat kelulusan.  \n\n" +
        "PERSYARATAN\n" +
                "- Harus mampu menggunakan Komputer atau Laptop dengan baik\n" +
                "- Dapat menggunakan software photoshop dan code editor untuk membuat HTML seperti sublime/notepad++\n\n" +
        "DESKRIPSI" +
        "\n\t\t\tPelajaran ini terdiri dari pengetahuan dasar dalam desain web yang berisi tag HTML, sejarah singkat dan pengenalan HTML (multimedia)Pelajaran ini membuat pelajar memiliki kemampuan untuk secara efektif membuat halaman web berkualitas tinggi dengan menggunakan standar HTML.\n" +
                "\n" +
                "1. Tools Photoshop\n" +
                "2. Retouching, transforming, dan layer style \n" +
                "3. Resizing, layer, selection, adjustment\n" +
                "4. Filtering, Transform, Slicing and Transform to HTML \n" +
                "5. Review dan Latihan\n" +
                "6. Pengenalan dasar web statis dan dinamis\n" +
                "7. Pengenalan dasar HTML (1)\n" +
                "8. Pengenalan dasar HTML (2)\n\n" +

        "SPESIFIKASI MINIMUM\n" +
        "- Resolusi layar 1366 x 768\n"+
        "- Prosesor Intel Celeron\n" +
        "- RAM 2 GB\n" +
        "- OS Windows, MacOS, Linux\n",

        // CSS
        "\t\t\tCSS merupakan bahasa pemrograman yang dipakai untuk mendesain halaman depan atau tampilan website (front end). CSS menangani tampilan dan ‘rasa’ dari halaman website." +
                "Ada banyak hal yang dapat Anda lakukan menggunakan CSS dibandingkan dengan bahasa pemrograman inti seperti HTML dan PHP. Ketika menggunakan CSS, Anda dapat mengatur warna teks, jenis font, baris antar paragraf, ukuran kolom, dan jenis background yang dipakai." +
                "Tidak hanya itu CSS juga bisa untuk mendesain layout, variasi tampilan di berbagai perangkat yang berbeda, dan berbagai efek yang dipakai di dalam website.\n\n" +

                    "PERSYARATAN\n" +
                    "- Harus mampu menggunakan Komputer atau Laptop dengan baik\n" +
                    "- Terdapat code editor seperti Visual Studio Code / Sublime Text, dll\n\n" +

        "DESKRIPSI\n" +
        "1. CSS Float\n" +
        "2. CSS Position\n" +
        "3. CSS Background\n" +
        "4. CSS Text\n" +
        "5. CSS Font\n" +
        "6. CSS Selector\n" +
        "7. CSS Animation\n" +
        "8. Framework Bootstrap\n" +
        "9. Membuat Landing Page dengan Framework Bootstrap\n\n" +

                "SPESIFIKASI MINIMUM\n" +
                "- Resolusi layar 1366 x 768\n"+
                "- Prosesor Intel Celeron\n" +
                "- RAM 2 GB\n" +
                "- OS Windows, MacOS, Linux\n",

        // JAVA
        "\t\t\tMateri pelatihan pada Java akan fokus ke masalah pengantar aplikasi Java, konsep pemrograman berorientasi object (OOP), dan berbagai teknik yang digunakan pada pemrograman bahasa Java. Materi disajikan dengan metode perimbangan teori-praktek, dengan harapan bahwa peserta training tidak hanya memahami paradigma berorientasi object, juga memiliki skill pemrograman Java di level dasar-intermediate.\n\n" +
        "PERSYARATAN\n" +
        "- Mampu mengoperasikan komputer dengan baik\n" +
        "- Kelas didesain untuk pemula\n" +
        "- Tidak ada training khusus yang dipersyaratkan\n\n"+

        "DESKRIPSI\n" +
        "1. Object-Oriented Programming Concepts\n" +
                "\t\t\t\t- Konsep Pemrograman dan Paradigmanya\n" +
                "\t\t\t\t- Teknologi Java dan Perangkat Pemrograman\n" +
                "\t\t\t\t- Konsep Dasar Pemrograman Berorientasi Objek\n" +
                "\t\t\t\t- Karakteristik Pemrograman Berorientasi Objek\n" +
                "\n" +

                "2. Java Basics\n" +
                "\t\t\t\t- Pernyataan dan Ekspresi\n" +
                "\t\t\t\t- Pernyataan Penentu Keputusan\n" +
                "\t\t\t\t- Pernyataan Pengulangan Proses\n" +
                "\t\t\t\t- Pernyataan Pemindah Proses\n" +

        "\nSPESIFIKASI MINIMUM\n" +
        "- Resolusi layar 1366 x 768\n" +
        "- Prosesor Intel Celeron\n" +
        "- RAM 2GB\n" +
        "- OS Windows, MacOS, Linux",

        // JAVASCRIPT
        "\t\t\tKursus ini bertujuan agar peserta mahir dan paham bahasa pemrograman Javascript. Materi kursus ini diberikan dalam bentuk tugas coding dan bahan untuk belajar bahasa pemrograman Javascript.  Berbeda dengan kursus Javascript online lainnya, kursus ini lebih menekankan kepada pengerjaan tugas-tugas coding. Tugas coding yang sudah dikerjakan akan diperiksa oleh sistem kami secara otomatis dan online. Sistem kami yang akan menentukan apakah peserta sudah mengerjakan tugas coding dengan benar, baik hasilnya ataupun algoritmanya. Peserta dituntut untuk mengerjakan semua tugas coding dengan benar sebagai syarat kelulusan.\n\n" +
                "PERSYARATAN\n" +
                "- Mampu mengoperasikan komputer dengan baik\n" +
                "- Kelas didesain untuk pemula\n" +
                "- Tidak ada training khusus yang dipersyaratkan\n\n"+

                "DESKRIPSI\n" +
                "1. Mengenal Javascript\n" +
                "2. Pemilihan Editor yang Tepat\n" +
                "3. Tag, Elemen, dan Atribut\n" +
                "4. Berbagai Cara Penulisan Javascript dan HTML\n" +
                "5. Berbagai Cara Menampilkan Hasil Javascript\n" +
                "6. Pengenalan Variabel dan Tipe Data\n" +
                "7. Struktur If, Switch, dan Perulangan\n" +
                "8. Pembuatan Function pada Javascript\n" +
                "9.Memanfaatkan Anonymous Function\n" +
                "10. Javascript dan Kontrol pada Form\n" +
                "11. Menggunakan Notasi Anak Panah\n\n" +

                "SPESIFIKASI MINIMUM\n" +
                "- Resolusi layar 1366 x 768\n" +
                "- Prosesor Intel Celeron\n" +
                "- RAM 2GB\n" +
                "- OS Windows, MacOS, Linux",

        // GIT
        "\t\t\tSaat ini Git menjadi salah satu tool terpopuler yang digunakan pada pengembangan software open souce maupun closed source." +
                "Google, Microsoft, Facebook dan berbagai perusahaan raksasa lainnya menggunakan Git.\n\n" +

                "PERSYARATAN\n" +
                "- Mampu mengoperasikan komputer dengan baik\n" +
                "- Kelas didesain untuk pemula\n" +
                "- Tidak ada training khusus yang dipersyaratkan\n\n"+

                "DESKRIPSI\n" +
        "1. Instalasi Git dan Persiapan Awal\n"+
                "2. Membuat Repositori Git\n" +
                "3. Membuat Revisi\n" +
                "4. Melihat Catatan Log Revisi Git\n" +
                "5. Melihat Perbandingan Revisi Git\n" +
                "6. Membatalkan Revisi Git\n" +
                "7. Percabangan\n" +
                "8. Perbedaan Git Checkout, Git Reset, dan Git Revert\n" +
                "9. Bekerja dengan Remote Repositori\n" +
                "10. Menggunakan Git Fetch dan Git Pull\n\n" +

        "SPESIFIKASI MINIMUM\n" +
                "- Resolusi layar 1366 x 768\n" +
                "- Prosesor Intel Celeron\n" +
                "- RAM 2GB\n" +
                "- OS Windows, MacOS, Linux",


        // Github
        "\t\t\tGithub adalah sebuah aplikasi berbasis website dengan Version Control System (VCS) yang menyediakan layanan untuk menyimpan repository dengan gratis. Respository merupakan tempat yang dapat Anda gunakan untuk menyimpan berbagai file berupa source code. Aplikasi ini termasuk sangat populer dan banyak digunakan termasuk oleh perusahaan-perusahaan besar skala gunia seperti Facebook, Google, dan Twitter." +
        "\n\nPERSYARATAN\n" +
                "- Mampu mengoperasikan komputer dengan baik\n" +
                "- Kelas didesain untuk pemula\n" +
                "- Tidak ada training khusus yang dipersyaratkan\n\n"+

                "DESKRIPSI\n" +
                "\t\t\tKursus ini dirancang untuk menjadi pendekatan komprehensif untuk Github, yang berarti tidak diperlukan pengetahuan atau pengalaman sebelumnya, tetapi siswa akan muncul di akhir dengan pemahaman yang sangat kuat dan pengalaman langsung dengan Github dan konsep kendali sumber terkait.\n\n" +
                "1. Pembuatan akun Github\n"+
                "2. Membuat Repositori Github\n" +
                "3. Membuat file baru di repo\n" +
                "4. Melakukan commit\n" +
                "5. Branch\n" +
                "6. Fork\n" +
                "7. Merge\n" +
                "8. Pull Request\n\n" +

        "SPESIFIKASI MINIMUM\n" +
                "- Resolusi layar 1366 x 768\n" +
                "- Prosesor Intel Celeron\n" +
                "- RAM 2GB\n" +
                "- OS Windows, MacOS, Linux",


        // KOlin
        "\t\t\tKursus Android Dasar (Kotlin) merupakan salah satu jenis training pemograman berbasis mobile. Pada kursus ini, peserta akan belajar tentang bagaimana belajar pemograman android berbasis kotlin level basic sampai bisa memahami materi lanjutan android kotlin, dengan materi-materi yang selalu update sesuai perkembangan zaman baik dari segi source codenya maupun dari segi tools/librarynya. Kursus ini juga ada layanan konsultasi dengan trainernya, jadi permasalahan yang berhubungan dengan materi training bisa dibahas pada saat training berlangsung." +
                "Selama training, peserta akan mendapat ilmu tentang bagaimana awal membuat aplikasi native baik itu untuk Android, kemudian peserta juga akan mengetahui solusi dari kesulitan saat ketika mengembangkan sebuah aplikasi\n" +

                "\nPERSYARATAN\n" +
                "- Mampu mengoperasikan komputer dengan baik\n" +
                "- Kelas didesain untuk pemula\n" +
                "- Tidak ada training khusus yang dipersyaratkan\n\n"+

        "DESKRIPSI\n" +
        "1. Program Hello World\n" +
        "2. Tipe Data\n" +
        "3. String Template\n" +
        "4. Pengulangan For\n" +
        "5. Pengulangan While Do While\n" +
        "6. If Else\n" +
        "7. Array\n" +
        "8. Collections\n\n" +

                "SPESIFIKASI MINIMUM\n" +
                "- Resolusi layar 1366 x 768\n" +
                "- Prosesor Intel Celeron\n" +
                "- RAM 2GB\n" +
                "- OS Windows, MacOS, Linux",


        //MySQL
        "\t\t\tDatabase Mysql Merupakan database yang cepat dan handal karena sudah DBMS (Database Management System). MySQL merupakan database yang menggunakan bahasa SQL sehingga mudah digunakan oleh penggunanya." +
                "Pengetahuan dasar tentang Struktural Query Language (SQL) sangat diperlukan untuk seseorang yang ingin mendalami skill Mysql Database, terutama untuk seorang Database Administrator Mysql Database. Oracle menyediakan solusi untuk mempelajari dasar-dasar SQL dengan menyediakan training dan sertifikasi MySQL Fundamentals." +

                "\n\nPERSYARATAN\n" +
                "- Mampu mengoperasikan komputer dengan baik\n" +
                "- Kelas didesain untuk pemula\n" +
                "- Tidak ada training khusus yang dipersyaratkan\n\n"+

        "DESKRIPSI\n" +
        "\t1. MySQL Server and Client\n" +
                "\t\t- MySQL Client / Server Model\n" +
                "\t\t- Konektor MySQL\n" +
                "\t\t- Instalasi server MySQL\n" +
                "\t\t- Mengatur Kata Sandi root\n" +
                "\t\t- Memulai dan menghentikan server MySQL\n" +
                "\t\t- Menggunakan client mysql\n" +
                "\t\t- Workbench MySQL\n\n" +

                "\t2. Database Basics\n" +
                "\t\t- Dasar-dasar Database Relasional\n" +
                "\t\t- Spreadsheet Versus Basis Data\n" +
                "\t\t- Entitas dan Relationships\n" +
                "\t\t- Kategori Relationship\n" +
                "\t\t- Bahasa SQL dan MySQL\n" +
                "\t\t- DDL\n" +
                "\t\t- DML\n\n" +

                "\t3.Designing Your Database\n" +
                "\t\t- Pemodelan Database\n" +
                "\t\t- Kunci\n" +
                "\t\t- Normalisasi\n" +
                "\t\t- Perancangan Basis Data\n" +
                "\t\t- Melihat dan Mengevaluasi Database\n" +

                "\nSPESIFIKASI MINIMUM\n" +
                "- Resolusi layar 1366 x 768\n" +
                "- Prosesor Intel Celeron\n" +
                "- RAM 2GB\n" +
                "- OS Windows, MacOS, Linux",



        // PHP
        "\t\t\tBahasa pemrograman PHP membantu Anda untuk mengembangkan aplikasi berbasis web yang cukup kompleks, handal, dan cepat. Tergantung dari spesifikasi bisnis, penggunaan hosting, tingkat pengalaman, kebutuhan aplikasi, dan pengembangan timeframe. Selain itu ada banyak PHP frameworks yang dapat Anda pilih, salah satunya Framework Laravel. Pada kelas ini, anda akan mendapatkan kesempatan untuk belajar framework tersebut.\n\n" +
        "PERSYARATAN\n" +
        "- Memiliki sebuah komputer/laptop\n" +
                "- Memiliki software text editor seperti Visual Studio Code atau textpad atau notepad dan lain lain\n\n" +

        "DESKRIPSI\n" +
        "\t\t\tMateri ini memperkenalkan mengenai PHP dasar untuk pembuatan   sebuah website. Pada Materi ini, mahasiswa akan belajar bagaimana cara   menggunakan syntax – syntax dasar di php seperti seleksi, perulangan dan juga   menangani input user di dalam form seperti untuk login, Registrasi, upload   file, dan sebagainya. Materi ini terdiri dari 10 topik yaitu:\n" +
                "\n" +
                "1. Pengenalan PHP\n" +
                "2. PHP Sintaks\n" +
                "3. Array\n" +
                "4. Control   Structures - Seleksi\n" +
                "5. Control   Structures – Perulangan\n" +
                "6. Form Handling\n" +
                "7. Validasi Form\n" +
                "8. Session dan   Cookies\n" +
                "9. Upload File\n" +
                "10. Framework Laravel dan fundamental\n" +
                "11. Contoh Aplikasi Web menggunakan framework laravel\n" +

                "\nSPESIFIKASI MINIMUM\n" +
                "- Resolusi layar 1366 x 768\n" +
                "- Prosesor Intel Celeron\n" +
                "- RAM 2GB\n" +
                "- OS Windows, MacOS, Linux",


        // Python
        "\t\t\tPython adalah bahasa pemrograman interpretatif yang dapat digunakan di berbagai platform dengan filosofi perancangan yang berfokus pada tingkat keterbacaan kode dan merupakan salah satu bahasa populer yang berkaitan dengan Data Science, Machine Learning, dan Internet of Things (IoT). Keunggulan Python yang bersifat interpretatif juga banyak digunakan untuk prototyping, scripting dalam pengelolaan infrastruktur, hingga pembuatan website berskala besar. Menurut jurnal Developer Economics - State of the Developer Nation, pada akhir 2018 sebesar 69% dari pengembang machine learning dan data scientist menggunakan Python. Selain itu, menurut IEEE Spectrum pada tahun 2019 ini, Python kembali mempertahankan posisinya sebagai bahasa pemrograman paling populer di dunia.\n\n" +
                "PERSYARATAN\n" +
                "- Komputer (Windows, Mac, atau Linux).\n" +
                "- Tidak diperlukan pengetahuan sebelumnya tentang Python.\n" +
                "- Tidak diperlukan pengalaman pemrograman sebelumnya.\n\n" +

                "DESKRIPSI\n" +
                "1. Paradigma berpikir algoritmik seperti programmer.\n" +
                "2. Variables dan Assignments\n" +
                "3. Struktur Kondisional\n" +
                "4. Struktur Data (String, List, Dictionary, Set).\n" +
                "5. Menggunakan dan menulis function.\n" +
                "6.Debugging dalam Python.\n" +
                "7. OOP dalam Python: encapsulation (classes, objects), inheritance, polymorphism.\n" +
                "8. Python standard library.\n" +
                "9. Plotting grafik: Matplotlib.\n" +
                "10. Matriks, vektor, array, komputasi ilmiah: Numpy, SciPy.\n" +
                "11. Testing dalam Python.\n" +
                "12. Penanganan error: exceptions.\n\n" +

                "SPESIFIKASI MINIMUM\n" +
                "- Resolusi layar 1366 x 768\n" +
                "- Prosesor Intel Celeron\n" +
                "- RAM 2GB\n" +
                "- OS Windows, MacOS, Linux",
    )

    val listCourse: ArrayList<Course>
        get() {
            val list = arrayListOf<Course>()
                for(position in image.indices){
                    val course = Course()
                    course.image = image[position]
                    course.name = name[position]
                    course.rating = rating[position]
                    course.pengajar = pengajar[position]
                    course.modul = modul[position]
                    course.jam = jam[position]
                    course.biaya = biaya[position]
                    course.deskripsi = deskripsi[position]
                    list.add(course)
                }
            return list
        }

}