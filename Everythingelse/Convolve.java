package Everythingelse;

// Java program to demonstrate read and write of image

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Convolve {
    public static int[][] apply_convolution(int[][] image, double[][] kernel){
        int X_height = image.length, X_width = image[0].length, K_height = kernel.length, K_width = kernel[0].length;
        int H = K_height / 2;
        int W = K_width / 2;
        int[][] new_img = new int[X_height][X_width];
        for(int i=H; i<X_height-H; i++){
            for(int j=W; j<X_width-W; j++){
                double sum = 0;
                for(int k=-H; k<H+1; k++){
                    for(int l=-W; l<W+1; l++){
                        int a = image[i+k][j+l];
                        double w = kernel[H+k][W+l];
                        sum += (a*w);
                    }
                new_img[i][j] = (int)sum;
                }
            }
        }
        return new_img;
    }
    public static void main(String[] args){
        int[][] image = {
                {100, 222, 31, 114, 235},
                {69, 90, 82, 199, 180},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        double[][] kernel = {
                {0.1, 0.1, 0.1},
                {0.1, 0.1, 0.1},
                {0.1, 0.1, 0.1}
        };

        int[][] new_image = apply_convolution(image, kernel);

        for(int i=0; i< new_image.length; i++){
            for(int j=0; j<new_image[0].length; j++){
                System.out.print(new_image[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
