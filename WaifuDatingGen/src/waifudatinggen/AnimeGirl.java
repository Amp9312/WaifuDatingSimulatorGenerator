/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waifudatinggen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AnimeGirl{
        String animeGenreType;
        String animeSecondaryType;
        String complexionType;
        String eyeColorType;
        String hairColorType;
        String hairStyleType;
        String learnMoreType;
        String loveType;
        String nameType;
        String personalityType;
        
        public void Character(String a, String c, String e, String hs, String s, String m, String l, String n, String p){
            animeGenreType = a;
            complexionType = c;
            eyeColorType = e;
            hairColorType = hs;
            hairStyleType = s;
            learnMoreType = m;
            loveType = l;
            nameType = n;
            personalityType = p;
        }
        
        public void genAnimeCharacter()
        {
            /*
            Genre
            */
            try{
            //creates file datatype using txt file from \lib
                File txt = new File(".\\lib\\animetype.txt");
            //create a scanner item
                Scanner scan = new Scanner(txt);
            //Create ArrayList of Strings
                ArrayList<String> data = new ArrayList<String>();
            //add lines of txt file into ArrayList
                while(scan.hasNextLine())
                {
                    data.add(scan.nextLine());
                }
            //Array of Strings
            String[] simpleArray = data.toArray(new String[]{});
            Random r = new Random();
            int randomNumber=r.nextInt(simpleArray.length);
            animeGenreType = simpleArray[randomNumber];
        }
            catch(FileNotFoundException ex){
                System.out.println("File not found");
                }
           /*
            Subgenre
            */
            try{
            //creates file datatype using txt file from \lib
                File txt = new File(".\\lib\\animetype.txt");
            //create a scanner item
                Scanner scan = new Scanner(txt);
            //Create ArrayList of Strings
                ArrayList<String> data = new ArrayList<String>();
            //add lines of txt file into ArrayList
                while(scan.hasNextLine())
                {
                    data.add(scan.nextLine());
                }
            //Array of Strings
            String[] simpleArray = data.toArray(new String[]{});
            Random r = new Random();
            int randomNumber=r.nextInt(simpleArray.length);
            animeSecondaryType = simpleArray[randomNumber];
        }
            catch(FileNotFoundException ex){
                System.out.println("File not found");
                }
            /*
            Complexion
            */
            try{
            //creates file datatype using txt file from \lib
                File txt = new File(".\\lib\\complexionType.txt");
            //create a scanner item
                Scanner scan = new Scanner(txt);
            //Create ArrayList of Strings
                ArrayList<String> data = new ArrayList<String>();
            //add lines of txt file into ArrayList
                while(scan.hasNextLine())
                {
                    data.add(scan.nextLine());
                }
            //Array of Strings
                String[] simpleArray = data.toArray(new String[]{});
                Random r = new Random();
                int randomNumber=r.nextInt(simpleArray.length);
                complexionType = simpleArray[randomNumber];
        }
            catch(FileNotFoundException ex){
                System.out.println("File not found");
            }
            
            /*
            Eye Color
            */
            try{
            //creates file datatype using txt file from \lib
                File txt = new File(".\\lib\\eyecolortype.txt");
            //create a scanner item
                Scanner scan = new Scanner(txt);
            //Create ArrayList of Strings
                ArrayList<String> data = new ArrayList<String>();
            //add lines of txt file into ArrayList
                while(scan.hasNextLine())
                {
                    data.add(scan.nextLine());
                }
            //Array of Strings
                String[] simpleArray = data.toArray(new String[]{});
                Random r = new Random();
                int randomNumber=r.nextInt(simpleArray.length);
                eyeColorType = simpleArray[randomNumber];
        }
            catch(FileNotFoundException ex){
                System.out.println("File not found");
            }
            
            /*
            Hair Color Type
            */
            try{
            //creates file datatype using txt file from \lib
                File txt = new File(".\\lib\\haircolortype.txt");
            //create a scanner item
                Scanner scan = new Scanner(txt);
            //Create ArrayList of Strings
                ArrayList<String> data = new ArrayList<String>();
            //add lines of txt file into ArrayList
                while(scan.hasNextLine())
                {
                    data.add(scan.nextLine());
                }
            //Array of Strings
                String[] simpleArray = data.toArray(new String[]{});
                Random r = new Random();
                int randomNumber=r.nextInt(simpleArray.length);
                hairColorType = simpleArray[randomNumber];
        }
            catch(FileNotFoundException ex){
                System.out.println("File not found");
            }
            
            /*
            Learn More
            */
            try{
            //creates file datatype using txt file from \lib
                File txt = new File(".\\lib\\learnmoretype.txt");
            //create a scanner item
                Scanner scan = new Scanner(txt);
            //Create ArrayList of Strings
                ArrayList<String> data = new ArrayList<String>();
            //add lines of txt file into ArrayList
                while(scan.hasNextLine())
                {
                    data.add(scan.nextLine());
                }
            //Array of Strings
                String[] simpleArray = data.toArray(new String[]{});
                Random r = new Random();
                int randomNumber=r.nextInt(simpleArray.length);
                learnMoreType = simpleArray[randomNumber];
        }
            catch(FileNotFoundException ex){
                System.out.println("File not found");
            }
            
            /*
            Hair Style
            */
            try{
            //creates file datatype using txt file from \lib
                File txt = new File(".\\lib\\hairmodifiertype.txt");
            //create a scanner item
                Scanner scan = new Scanner(txt);
            //Create ArrayList of Strings
                ArrayList<String> data = new ArrayList<String>();
            //add lines of txt file into ArrayList
                while(scan.hasNextLine())
                {
                    data.add(scan.nextLine());
                }
            //Array of Strings
                String[] simpleArray = data.toArray(new String[]{});
                Random r = new Random();
                int randomNumber=r.nextInt(simpleArray.length);
                hairStyleType = simpleArray[randomNumber];
        }
            catch(FileNotFoundException ex){
                System.out.println("File not found");
            }
            
            /*
            Love Type
            */
            try{
            //creates file datatype using txt file from \lib
                File txt = new File(".\\lib\\lovetype.txt");
            //create a scanner item
                Scanner scan = new Scanner(txt);
            //Create ArrayList of Strings
                ArrayList<String> data = new ArrayList<String>();
            //add lines of txt file into ArrayList
                while(scan.hasNextLine())
                {
                    data.add(scan.nextLine());
                }
            //Array of Strings
                String[] simpleArray = data.toArray(new String[]{});
                Random r = new Random();
                int randomNumber=r.nextInt(simpleArray.length);
                loveType = simpleArray[randomNumber];
        }
            catch(FileNotFoundException ex){
                System.out.println("File not found");
            }
            
            /*
            Name
            */
            try{
            //creates file datatype using txt file from \lib
                File txt = new File(".\\lib\\nametype.txt");
            //create a scanner item
                Scanner scan = new Scanner(txt);
            //Create ArrayList of Strings
                ArrayList<String> data = new ArrayList<String>();
            //add lines of txt file into ArrayList
                while(scan.hasNextLine())
                {
                    data.add(scan.nextLine());
                }
            //Array of Strings
                String[] simpleArray = data.toArray(new String[]{});
                Random r = new Random();
                int randomNumber=r.nextInt(simpleArray.length);
                nameType = simpleArray[randomNumber];
        }
            catch(FileNotFoundException ex){
                System.out.println("File not found");
            }
            /*
            Personality
            */
            try{
            //creates file datatype using txt file from \lib
                File txt = new File(".\\lib\\personalitytype.txt");
            //create a scanner item
                Scanner scan = new Scanner(txt);
            //Create ArrayList of Strings
                ArrayList<String> data = new ArrayList<String>();
            //add lines of txt file into ArrayList
                while(scan.hasNextLine())
                {
                    data.add(scan.nextLine());
                }
            //Array of Strings
                String[] simpleArray = data.toArray(new String[]{});
                Random r = new Random();
                int randomNumber=r.nextInt(simpleArray.length);
                personalityType = simpleArray[randomNumber];
        }
            catch(FileNotFoundException ex){
                System.out.println("File not found");
            }
        }
        
        //debugging tool
    public String getAnimeCharacter()
        {
        return personalityType;
        }
    
    public void generateTest(){
        System.out.println("Welcome. Let's get you a wife.\n"
                + "Anime Genre: " + animeGenreType
                + "\nSecondary Genre: " + animeSecondaryType
                + "\nSkin Complexion: " + complexionType
                + "\nEye Color: " + eyeColorType
                + "\nHair Color: " + hairColorType
                + "\nHair Type: " + hairStyleType
                + "\nType: " + learnMoreType
                + "\nLove Type: " + loveType
                + "\nName: " + nameType
                + "\nAdditional Info: " + personalityType);
    }
    
    }
   
