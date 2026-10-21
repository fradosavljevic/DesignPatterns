package Facade;

public class SSD {
    public String read(long lba, int size) {
        System.out.println("SSD: Reading " + size + " sectors from LBA " + lba + "...");
        return "OS_BOOT_DATA";
    }
}
