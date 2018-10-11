/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

/**
 *
 * @author nicolasreyalonso
 */
public class Kata3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Histogram<String> histogram = new Histogram();
        for (int i = 0; i < 15; i++) {
            histogram.increment("Gmail.com"); 
        }
        for (int i = 0; i < 7; i++) {
            histogram.increment("Ulpgc.es"); 
        }
            histogram.increment("Hotmail.com"); 
        

        HistogramDisplay histo = new HistogramDisplay(histogram);
        histo.execute();
    }
    
}
