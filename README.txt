KALKULATOR BMI - JAVA + MAVEN + JAVAFX

Persyaratan:
- JDK 21 (disarankan)
- Apache NetBeans dengan dukungan Maven
- Koneksi internet saat Maven pertama kali mengunduh dependensi
- Scene Builder opsional untuk mengubah desain FXML

CARA MEMBUKA DI APACHE NETBEANS:
1. Ekstrak ZIP ini ke sebuah folder.
2. Buka Apache NetBeans.
3. Pilih File > Open Project.
4. Pilih folder KalkulatorBMI hasil ekstrak (folder yang berisi pom.xml).
5. Tunggu Maven mengunduh dependensi.
6. Klik kanan project > Clean and Build.
7. Untuk menjalankan, klik kanan project > Run, atau gunakan target Maven:
   javafx:run

JIKA RUN TIDAK BERHASIL:
- Pastikan JDK 21 dipilih untuk project.
- Pastikan internet tersedia saat dependensi pertama kali diunduh.
- Periksa Output untuk pesan error Maven/JavaFX.

MEMBUKA FXML DI SCENE BUILDER:
- File: src/main/resources/com/mycompany/kalkulatorbmi/bmi-view.fxml
- Klik kanan file dan pilih Open, atau pilih Open in Scene Builder jika opsi itu tersedia.
- Jika Scene Builder belum terhubung: Tools > Options > Java > JavaFX (menu dapat berbeda menurut versi NetBeans), lalu atur lokasi Scene Builder.
- Controller: com.mycompany.kalkulatorbmi.BmiController
- Tombol Hitung BMI memanggil #hitungBMI; tombol Reset memanggil #resetForm.

RUMUS:
BMI = berat badan (kg) / (tinggi badan dalam meter x tinggi badan dalam meter)

Catatan:
Kategori pada aplikasi ini memakai batas umum BMI dewasa. BMI anak dan remaja ditafsirkan berbeda berdasarkan usia dan jenis kelamin; aplikasi ini bukan alat diagnosis medis.
