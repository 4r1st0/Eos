/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eos.io;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dommer01
 */
public class WriteUMGInputFile {
/*    public WriteUMGInputFile(String header, int numberOfSpheres,
        double dataCorrectionFactor, List<String> sphereNames,
        List<Double> sphereDiameter, List<Double> sphereCounts,
        List<Double> sphereAbsUncertainty, List<Double> spherePerUncertainty,
        List<Double> responsePerUncertainty) {
        try{
        PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
        writer.println(header);
        String formatStrHead = "%6s %4s %n";
        writer.write(String.format(formatStrHead, numberOfSpheres, dataCorrectionFactor));
        for(int i = 0; i < numberOfSpheres; i ++ ) {
        String formatStrData = "%-8s %5s  %13s %14s %7s %7s %5s %n";
        writer.write(String.format(formatStrData, sphereNames.get(i), sphereDiameter.get(i),
                sphereCounts.get(i), sphereAbsUncertainty.get(i), spherePerUncertainty.get(i),
                responsePerUncertainty.get(i), i+1));
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
    }*/
}
