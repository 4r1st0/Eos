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
    
    // implementation using read-out from jTextField to get OutputFileName
    public void WriteDefaultSpectrum(javax.swing.JTextField OutFileName,
                                     String header, int NofEBins,
                                     int spectrumForm, int energyScale,
                                     double highEbinEdge,
                                     List<Double> leftEBinEdge,
                                     List<Double> spectrumBin,
                                     List<Double> spectrumBinUnc) 
                                     throws Exception {
        
        try(PrintWriter writer = 
                    new PrintWriter(OutFileName.getText() + ".flu", "ASCII")) {   
            if(header.length() > 80) {
                writer.println(header.substring(0, 80));
            } else {
                writer.println(header);
            }

            String formatStrHead1 = "%12s%11s%n";
            writer.write(String.format(formatStrHead1, spectrumForm, energyScale));
            String formatStrHead2 = "%12s%11s%12s%12s%n";
            writer.write(String.format(formatStrHead2, "1", NofEBins, NofEBins, 
                  OutputFormatter.exponentSign(highEbinEdge)));
                        
            String formatStrData = "%13s%12s%13s%n";
            for(int i = 0; i < NofEBins; i ++ ) {    
                writer.write(String.format(formatStrData, 
                            OutputFormatter.exponentSign(leftEBinEdge.get(i)),
                            OutputFormatter.exponentSign(spectrumBin.get(i)),
                            OutputFormatter.exponentSign(spectrumBinUnc.get(i))));
            }
        } 
    } 

    // implementation using string to get OutputFileName
    public void WriteDefaultSpectrum(String OutFileName,
                                     String header, int NofEBins,
                                     int spectrumForm, int energyScale,
                                     double highEbinEdge,
                                     List<Double> leftEBinEdge,
                                     List<Double> spectrumBin,
                                     List<Double> spectrumBinUnc) 
                                     throws Exception {
        
        try(PrintWriter writer = 
                    new PrintWriter(OutFileName + ".flu", "ASCII")) {   
            if(header.length() > 80) {
                writer.println(header.substring(0, 80));
            } else {
                writer.println(header);
            }
        
            String formatStrHead1 = "%12s%11s%n";
            writer.write(String.format(formatStrHead1, spectrumForm, energyScale));
            String formatStrHead2 = "%12s%11s%12s%12s%n";
            writer.write(String.format(formatStrHead2, "1", NofEBins, NofEBins, 
                  OutputFormatter.exponentSign(highEbinEdge)));
                        
            String formatStrData = "%13s%12s%13s%n";
            for(int i = 0; i < NofEBins; i ++ ) {    
                writer.write(String.format(formatStrData, 
                            OutputFormatter.exponentSign(leftEBinEdge.get(i)),
                            OutputFormatter.exponentSign(spectrumBin.get(i)),
                            OutputFormatter.exponentSign(spectrumBinUnc.get(i))));
            }
        } 
    }
    
}
