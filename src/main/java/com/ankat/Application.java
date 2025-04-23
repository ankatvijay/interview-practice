package com.ankat;

import java.io.*;

public class Application {

    private final static int FIVE_MINUTE = 300000;;
    private final static java.awt.Dimension dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    private final static int MAX_X = (int) dimension.getWidth();
    private final static int MAX_Y = (int) dimension.getHeight();
    private final static String setOfCharacters = "abcdefghijklmnopqrstuvwxyz@!1234567890~$ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static File file = new File("rough.txt");
    private static FileWriter fileWriter;
    private static BufferedWriter bufferedWriter;
    private static PrintWriter printWriter;

    public static void main(String[] args) {
        try {
            // Mouse Event
            java.awt.Robot robot = new java.awt.Robot();
            java.util.Random random = new java.util.Random();

            // Write in File
            System.out.println("Created New File : " + file.createNewFile());
            while (true) {
                int xAxis = random.nextInt(MAX_X);
                int yAxis = random.nextInt(MAX_Y);
                int randomInt = random.nextInt(setOfCharacters.length());
                char randomChar = setOfCharacters.charAt(randomInt);
                System.out.println("xAxis : " + String.format("%4d", xAxis) + " yAxis : " + String.format("%4d", yAxis) + " Random character from string: " + randomChar);
                fileWriter = new FileWriter(file,true);
                bufferedWriter = new BufferedWriter(fileWriter);
                printWriter = new PrintWriter(bufferedWriter);
                printWriter.print(randomChar);
                robot.mouseMove(xAxis, yAxis);
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();
                Thread.sleep(FIVE_MINUTE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                printWriter = null;
                bufferedWriter = null;
                fileWriter = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
