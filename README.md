n (int) → bilangan yang ingin dihitung faktorialnya.
hasil (long) → menampung hasil perkalian bertahap. Digunakan long karena hasil faktorial cepat besar.
Untuk i dari 1 sampai n: hasil = hasil * i.
Setelah loop selesai, return hasil.
hitungFaktorial(5) → 1×2×3×4×5 = 120
hitungFaktorial(0) → biasanya dianggap 1 (konvensi faktorial).
