// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayList;
import java.util.Iterator;

public class mainbook {
   public mainbook() {
   }

   public static void main(String[] var0) {
      ArrayList var1 = new ArrayList();
      book var2 = new book("Icon", 499.0, "ABCD1001", "Fiction", "Author A");
      book var3 = new book("Outlive", 370.0, "ABDK223", "Non-fiction", "Peter Attia");
      book var4 = new book(var3);
      var4.title = "Harry Potter";
      var4.author = "JK Rowling";
      var4.genre = "Fiction";
      book var5 = new book("Outlive", 370.0, "ABDK223", "Non-fiction", "Peter Attia");
      book var6 = new book("My Experiments with Truth", 549.0, "ABCD3101", "Fiction", "Mahatma Gandhi");
      book var7 = new book("Mein Kampf", 999.0, "NA67ZI", "Auto-biography", "Adolf Hitler");
      var1.add(var2);
      var1.add(var3);
      var1.add(var4);
      var1.add(var5);
      var1.add(var6);
      var1.add(var7);
      System.out.println("---- Fiction Books ----");
      int var8 = 0;
      Iterator var9 = var1.iterator();

      while(var9.hasNext()) {
         book var10 = (book)var9.next();
         if ("Fiction".equalsIgnoreCase(var10.genre)) {
            System.out.println("------------------");
            System.out.println("Title: " + var10.title);
            System.out.println("Price: " + var10.price);
            System.out.println("Author: " + var10.author);
            System.out.println("ISBN: " + var10.ISBN);
            System.out.println("Genre: " + var10.genre);
            System.out.println("------------------");
            ++var8;
         }
      }

      System.out.println("Total Fiction books: " + var8);
      double var16 = 0.0;

      book var12;
      for(Iterator var11 = var1.iterator(); var11.hasNext(); var16 += var12.price) {
         var12 = (book)var11.next();
      }

      double var17 = var16 / (double)var1.size();
      System.out.println("Average price of all books: " + var17);
      System.out.println("\n---- Non-fiction Books ----");
      int var13 = 0;
      Iterator var14 = var1.iterator();

      while(var14.hasNext()) {
         book var15 = (book)var14.next();
         if ("Non-fiction".equalsIgnoreCase(var15.genre)) {
            System.out.println("------------------");
            System.out.println("Title: " + var15.title);
            System.out.println("Price: " + var15.price);
            System.out.println("Author: " + var15.author);
            System.out.println("ISBN: " + var15.ISBN);
            System.out.println("Genre: " + var15.genre);
            System.out.println("------------------");
            ++var13;
         }
      }

      System.out.println("Total Non-fiction books: " + var13);
   }
}
