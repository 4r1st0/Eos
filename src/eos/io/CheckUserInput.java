/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eos.io;

/**
 *
 * @author dommer01
 */
public class CheckUserInput {
    private static int errorFlag;
    
    public int checkDataUniformity(int referenceValue, int comparisonValue) {
        if(comparisonValue != referenceValue) {
            errorFlag = 1;
        } else {
            errorFlag = 0;
        }
        return errorFlag;
    }
        
    public int checkHeaderTextfield(String header) {
        if(header.equals("")) {
            errorFlag = 1;            
        } else {
            errorFlag = 0;
        }
        return errorFlag;           
    }    
}
