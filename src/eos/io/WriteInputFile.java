/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eos.io;

import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;

/**
 *
 * @author  M. Dommert
 * @date    2016-11-29
 * 
 * Utility class to write UMG (.ibu) and WinBUGS (.txt) input files.
 * The WriteInputFile class provides two methods; first the writeUMG method to 
 * create .ibu input files for the UMG unfloding package; and second the
 * writeWinBUGS method to create input files for the WinBUGS package.
 * 
 */
public class WriteInputFile {
    
    // method to create .ibu input files for the UMG unfolding package
    public void writeUMG(java.awt.TextField OutFileName,
                         String header, int NofSpheres, double dataCorrFactor,
                         List<String> sphereNames,
                         List<Double> sphereDiameter,
                         List<Double> sphereCounts,
                         List<Double> sphereAbsUncertainty,
                         List<Double> spherePerUncertainty,
                         List<Double> responsePerUncertainty) throws Exception {
        try(PrintWriter writer = 
                new PrintWriter(OutFileName.getText() + ".ibu", "ASCII")) {
            if(header.length() > 80) {
                writer.println(header.substring(0, 80));
            } else {
                writer.println(header);
            }
            String formatStrHead = "%5s%5s%n";
            writer.write(String.format(formatStrHead, NofSpheres, dataCorrFactor));
                        
            DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
            otherSymbols.setDecimalSeparator('.');
            NumberFormat formatPercent2 = new DecimalFormat("0.00", otherSymbols);
            
            String formatStrData = "%-8s%6s%15s%15s%8s%8s%6s%n";
            for(int i = 0; i < NofSpheres; i ++ ) {    
                writer.write(String.format(formatStrData, sphereNames.get(i), 
                            sphereDiameter.get(i),
                            OutputFormatter.exponentSign(sphereCounts.get(i)),
                            OutputFormatter.exponentSign(sphereAbsUncertainty.get(i)),
                            formatPercent2.format(spherePerUncertainty.get(i)),
                            formatPercent2.format(responsePerUncertainty.get(i)), i+1));
            }
            writer.println("");
            writer.println("Dete      Diam      reading M        abs unc   % unc   % unc");
            writer.println("ctor      eter     count rate           of M    of M    of R  flag");
            writer.println("");
            writer.println("12341234----.-123456789.12345---------.12345-----.12-----.12I23456");
            writer.println("");
            writer.println("Format line 1:");
            writer.println(" 1000  FORMAT(20A4)");
            writer.println("");
            writer.println("Format line 2: NOD, rdummy      NOD = number of detectors");
            writer.println(" 1020  FORMAT( * )");
            writer.println("");
            writer.println("Format line 3 to NOD+2");
            writer.println(" 1030  FORMAT(2A4,F6.1,2E15.5,2F8.2,I6)");
            writer.close();  
            //============END: Write data to file===============================
            }
    }
    
   /* // method to create .txt input files for the WinBUGS package
    public void writeWinBUGS() throws Exception {
        
    }*/

}
