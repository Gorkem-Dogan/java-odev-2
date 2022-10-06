package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün ahva çok güzel";
		mesaj.substring(0, 2);
		String yeniMesaj = mesaj.substring(0, 2);

		System.out.println(topla(727, 245));
		int toplam = topla2(2, 4, 5, 9);
		System.out.println(toplam);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam + sayi;

		}
		return toplam;
	}

}