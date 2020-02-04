package praktikum1pbo;
import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum1PBO {
        ArrayList <Prak1PBO> ben = new ArrayList<>();
        Prak1PBO b = new Prak1PBO();
        Prak1PBO bening = new Prak1PBO();
        Scanner ning = new Scanner(System.in);
        String coba;
        int tik;
        
    public static void main(String[] args) {
        Praktikum1PBO tik = new Praktikum1PBO();
        tik.menu();
        
    }
    public void Lanjut(){
        System.out.println("\n\nApakah Akan Lanjut? (ya/tidak)");
        System.out.println("Pilihan Anda : ");
        String number;
        Scanner Lanjut = new Scanner(System.in);
        number = Lanjut.nextLine();
         switch(number){
            case "ya":
                menu();
                break;
            case "tidak":
                System.out.println("===== TERIMAKASIH TELAH BERPARTISIPASI =====");
        }
    }
    public void input(){
        Scanner ning = new Scanner(System.in);
        
        if(ben.isEmpty()==true){
            System.out.println(" Silahkan Isi Identitas Anda ");
        System.out.println("Nama    : ");
        String nama = ning.nextLine();
        bening.setNama(nama);
        
        System.out.println("NIK     : ");
        String nik = ning.nextLine();
        bening.setNIK(nik);
      
        System.out.println("TTL     : ");
        String ttl = ning.nextLine();
        bening.setTTL(ttl);

        System.out.println("Jenis Kelamin   : ");
        String jeniskelamin = ning.nextLine();
        bening.setJenisKelamin(jeniskelamin);
   
        System.out.println("Golongan Darah");
        System.out.println("1. A");
        System.out.println("2. B");
        System.out.println("3. AB");
        System.out.println("4. O");
        System.out.println("Golongan Darah  : ");
        int goldar = ning.nextInt();
        bening.setGoldar(goldar);
        if(goldar==1){
            System.out.println("A");
        } else if(goldar==2){
            System.out.println("B");
        } else if(goldar==3){
            System.out.println("AB");
        } else if(goldar==4){
            System.out.println("O");
        } else{
        System.out.println("Pilihan Anda Salah");
    }
         ben.add(bening);
        Lanjut();
        } else{
            
            System.out.println(" Silahkan Isi Identitas Anda ");
        System.out.println("Nama    : ");
        String nama = ning.nextLine();
        b.setNama(nama);
        
        System.out.println("NIK     : ");
        String nik = ning.nextLine();
        b.setNIK(nik);
      
        System.out.println("TTL     : ");
        String ttl = ning.nextLine();
        b.setTTL(ttl);

        System.out.println("Jenis Kelamin   : ");
        String jeniskelamin = ning.nextLine();
        b.setJenisKelamin(jeniskelamin);
   
        System.out.println("Golongan Darah");
        System.out.println("1. A");
        System.out.println("2. B");
        System.out.println("3. AB");
        System.out.println("4. O");
        System.out.println("Golongan Darah  : ");
        int goldar = ning.nextInt();
        b.setGoldar(goldar);
        if(goldar==1){
            System.out.println("A");
        } else if(goldar==2){
            System.out.println("B");
        } else if(goldar==3){
            System.out.println("AB");
        } else if(goldar==4){
            System.out.println("O");
        } else{
        System.out.println("Pilihan Anda Salah");
    }
         ben.add(b);
        Lanjut();
        }
        
    }
    public void menu(){
        Scanner y = new Scanner(System.in);
        int pilih=0;
        System.out.println("===== MENU UTAMA =====");
        System.out.println("1. Inputan Identitas");
        System.out.println("2. Tampilan Identitas");
        System.out.println("3. Exit");
        System.out.println("\nMasukkan Pilihan Anda :");
        pilih = ning.nextInt();
        
        switch(pilih){
            case 1 : input();
                break;
            case 2 : tampil();
                break;
            case 3 : pilih = 3;
                System.out.println("Terimakasih Telah Mengisi Identitas");
                break;
            default :
                System.out.println("Pilihan Anda Salah");
                break;
        }
        
    }
    public void tampil(){
        System.out.println("===== TAMPILAN IDENTITAS =====");
        for(int a=0; a<ben.size(); a++){
        System.out.println("\n");    
        System.out.println("Nama                    : " + ben.get(a).getNama());
        System.out.println("NIK                     : " + ben.get(a).getNIK());
        System.out.println("Tempat Tanggal Lahir    : " + ben.get(a).getTTL());
        System.out.println("Jenis Kelamin           : " + ben.get(a).getJenisKelamin());
        System.out.println("Golongan Darah          : " + ben.get(a).getGoldar());
        
        }
        
        Lanjut();
    }
    
    }
    

