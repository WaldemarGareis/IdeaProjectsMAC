package Aufgabe13;

import java.awt.FlowLayout;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import GUI.*;

public class TextFrame {
    
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            FrameSwing fenster = FrameSwing.erzeugeFrameSwing();
            
            fenster.setTitle(in.nextLine());
            
            int width = in.nextInt();
            int height = in.nextInt();
            in.close();
            
            System.out.println("Scanner closed.");
            fenster.setSize(width, height);
            
            fenster.setVisible(true);
        } catch(NumberFormatException e) {
            System.out.println("Keine ganzen Zahlen!");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Zu wenig Eingaben!");
        } catch(InputMismatchException e) {
            System.out.println("Worng input!");
        }
        
    }
}
