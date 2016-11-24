/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eos.io;

import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;


/**
 *
 * @author dommer01
 */
public class WriteDefaultSpectrum {
    
    // implementation using 
    public void WriteDefaultSpectrum(javax.swing.JTextField OutFileName,
                                     String header, int NofEBins,
                                     int spectrumForm, int energyScale,
                                     double highEbinEdge,
                                     List<Double> leftEBinEdge,
                                     List<Double> spectrumBin,
                                     List<Double> spectrumBinUnc) 
                                     throws Exception {
        

        try(PrintWriter writer = 
                    new PrintWriter(OutFileName.getText() + ".flu", "UTF-8")) {   
            if(header.length() > 80) {
                writer.println(header.substring(0, 80));
            } else {
                writer.println(header);
            }
        
            DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols();
            otherSymbols.setDecimalSeparator('.');
            otherSymbols.setExponentSeparator("E");                             // define exponent separator
            otherSymbols.setMinusSign('\u2212');                                // define minus (-) sign
            DecimalFormat formatExponential = new DecimalFormat("0.0000E00",
                                                                otherSymbols);
            String formatStrHead1 = "%12s%11s%n";
            writer.write(String.format(formatStrHead1, spectrumForm, energyScale));
            String formatStrHead2 = "%12s%11s%12s%12s%n";
            writer.write(String.format(formatStrHead2, "1", NofEBins, NofEBins, 
                  OutputFormatter.exponentSign(
                                    formatExponential.format(highEbinEdge),
                                    formatExponential.getDecimalFormatSymbols())));
                        
            String formatStrData = "%13s%12s%13s%n";
            for(int i = 0; i < NofEBins; i ++ ) {    
                writer.write(String.format(formatStrData, 
                            OutputFormatter.exponentSign(
                                    formatExponential.format(leftEBinEdge.get(i)),
                                    formatExponential.getDecimalFormatSymbols()),
                            OutputFormatter.exponentSign(
                                    formatExponential.format(spectrumBin.get(i)),
                                    formatExponential.getDecimalFormatSymbols()),
                            OutputFormatter.exponentSign(
                                    formatExponential.format(spectrumBinUnc.get(i)),
                                    formatExponential.getDecimalFormatSymbols())));
            }
        } 
        
    }  
    
}
