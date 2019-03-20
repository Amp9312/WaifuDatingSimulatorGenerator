/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waifudatinggen;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class WaifuDatingGen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //attempt to read in data from file
        AnimeGirl Girly = new AnimeGirl();
        Girly.genAnimeCharacter();
        Girly.generateTest();
    }
    
}
