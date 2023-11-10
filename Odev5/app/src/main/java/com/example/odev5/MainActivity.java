package com.example.odev5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.odev5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonTopla.setOnClickListener(v -> {
            String sayi1 = binding.editTextSayi1.getText().toString();
            String sayi2 = binding.editTextSayi2.getText().toString();
            int sayi1int = Integer.parseInt(sayi1);
            int sayi2int = Integer.parseInt(sayi2);
            int sonuc = sayi1int+sayi2int;
            String sonucc = String.valueOf(sonuc);

            binding.textViewSonuc.setText(sonucc);

        });
        binding.buttonSifirla.setOnClickListener(v -> {
            String mesaj1 = "1.Sayıyı giriniz.";
            String mesaj2 = "2.Sayıyı giriniz.";
            String mesaj3 = "Sonuç";
            binding.editTextSayi1.setHint(mesaj1);
            binding.editTextSayi2.setHint(mesaj2);
            binding.editTextSayi1.setText("");
            binding.editTextSayi2.setText("");
            binding.textViewSonuc.setText(mesaj3);
        });
    }
}