/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package publisher;

/**
 *
 * @author Admin
 */
public class BookDemo {
    public static void main(String[] args) {
        Author tacgia = new Author("Russel", "Winderand");
    
        String tenS = "Developing Java Software";
        Double gia = 79.75;
        Book sach = new Book(tenS,tacgia,gia);
        System.out.println("Book demo: " + sach.toString());
    }
}
