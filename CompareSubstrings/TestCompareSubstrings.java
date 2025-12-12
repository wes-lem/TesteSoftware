import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.Test;

public class TestCompareSubstrings {
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
   CompareSubstrings compare = new CompareSubstrings();

   public TestCompareSubstrings() {
   }

   @Test
   public void testHello() {
      String s = "Java";
      int k = 2;
      String expected= "Ja\nva";

      assertEquals("Saída deve ser maior e menor: ", expected, CompareSubstrings.getSmallestAndLArgest(s, k));
   }

   @Test
   public void testWelcome() {
      String s = "welcometojava";
      int k = 3;
      String expected= "ava\nwel";

      assertEquals("Saída deve ser maior e menor: ", expected, CompareSubstrings.getSmallestAndLArgest(s, k));
   }

   @Test
   public void testAAAA() {
      String s = "aaaaa";
      int k = 2;
      String expected= "aa\naa";

      assertEquals("Saída deve ser maior e menor: ", expected, CompareSubstrings.getSmallestAndLArgest(s, k));
   }

   @Test
   public void testBanana() {
      String s = "banana";
      int k = 10;
      String expected= "ana\nnan";

      assertEquals("Saída deve ser maior e menor: ", expected, CompareSubstrings.getSmallestAndLArgest(s, k));
   }

   @Test(expected = IllegalArgumentException.class)
    public void testStringMenorQueK() {
        String s = "banana";
        int k = 10;
        CompareSubstrings.getSmallestAndLArgest(s, k);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testKNegativo() {
        CompareSubstrings.getSmallestAndLArgest("Java", -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testStringNula() {
        CompareSubstrings.getSmallestAndLArgest(null, 3);
    }
}
