/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iht.io;

import java.text.*;

/**
 *
 * @author Martin Dommert, 2016-11-23
 * 
 * The OutputFormatter class provides the exponentSign method. This method is
 * used to extend the DecimalFormat method to provide + and - exponent signs.
 * DecimalFormat method: 0.0000E00      -> 1.2345E01 and 1.2345E-01
 * exponentSign method:  0.0000E(+/-)00 -> 1.2345E+01 and 1.2345E-01
 * 
 * The special format can be used for UMG data input files, which requires equal
 * length of data values.
 */
public class OutputFormatter {
    
    public static String exponentSign(final String s,
                                      final DecimalFormatSymbols symbols) {
    String result;
    final String expo = symbols.getExponentSeparator();
    final char minus = symbols.getMinusSign();
    if (!s.contains(expo + minus)) { // don't blast a negative sign
    result = s.replace(expo, expo + '+');
    } else {result=s;}
    return result;
}
}
