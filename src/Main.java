public class Main {

    public static void main(String[] args) {
	//case sensitive: BüyükKüçük harf duyarlılığı
        //int: tam sayı türünde demek
        //camel casing: bitişik yazılarda ikinci kelimenin baş harfinin büyük olması ögrenciSayisi gibi
        //reusability : tekrar tekrar kullanılabilirlik
        // String: metinsel tanımlama

int sayi = 10;
String mesaj = "ÖgrenciSayisi : ";

        System.out.println("Öğrenci sayım : 9 ");
        System.out.println("Öğrenci sayım : "+ sayi );

        System.out.println("Öğrenci sayım : 9 ");
        System.out.println(mesaj + sayi);
    }
}
