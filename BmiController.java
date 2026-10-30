package com.mycompany.kalkulatorbmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Locale;

public class BmiController {

    @FXML
    private TextField beratField;

    @FXML
    private TextField tinggiField;

    @FXML
    private Label hasilLabel;

    @FXML
    private Label kategoriLabel;

    @FXML
    private Label pesanLabel;

    @FXML
    private void hitungBMI() {
        pesanLabel.setText("");

        try {
            double berat = Double.parseDouble(
                    beratField.getText().trim().replace(',', '.')
            );
            double tinggiCm = Double.parseDouble(
                    tinggiField.getText().trim().replace(',', '.')
            );

            if (berat <= 0 || tinggiCm <= 0) {
                tampilkanPesan("Berat dan tinggi harus lebih dari 0.");
                return;
            }

            if (berat > 500 || tinggiCm > 300) {
                tampilkanPesan("Periksa kembali angka berat dan tinggi.");
                return;
            }

            double tinggiMeter = tinggiCm / 100.0;
            double bmi = berat / (tinggiMeter * tinggiMeter);

            hasilLabel.setText(String.format(Locale.US, "%.2f", bmi));

            // Batas umum BMI dewasa, bukan interpretasi untuk anak/remaja.
            if (bmi < 18.5) {
                kategoriLabel.setText("Di bawah rentang BMI dewasa");
            } else if (bmi < 25.0) {
                kategoriLabel.setText("Rentang BMI dewasa normal");
            } else if (bmi < 30.0) {
                kategoriLabel.setText("Di atas rentang BMI dewasa");
            } else {
                kategoriLabel.setText("BMI 30 atau lebih");
            }

        } catch (NumberFormatException e) {
            tampilkanPesan("Isi berat dan tinggi dengan angka yang valid.");
        }
    }

    @FXML
    private void resetForm() {
        beratField.clear();
        tinggiField.clear();
        hasilLabel.setText("--");
        kategoriLabel.setText("Hasil akan muncul di sini");
        pesanLabel.setText("");
    }

    private void tampilkanPesan(String pesan) {
        hasilLabel.setText("--");
        kategoriLabel.setText("Periksa kembali input kamu");
        pesanLabel.setText(pesan);
    }
}
