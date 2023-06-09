// Ques: Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

// To flip an image horizontally means that each row of the image is reversed.

// For example, flipping [1,1,0] horizontally results in [0,1,1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

// For example, inverting [0,1,1] results in [1,0,0].

// Code:

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length ; i++){
            image[i] = reversearr(image[i]);
        }
        return image;
    }
    public int[] reversearr(int[] arr){
        int i=0 ; 
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = (arr[j]);
            arr[j] = (temp);
            i++;
            j--;
        }
        return reverse(arr);
    }
    public int[] reverse(int[] n){
        for(int i=0;i<n.length ; i++){
        if(n[i]==0){
            n[i]= 1;
        }
        else{
            n[i]=0;
        }
        }
        return n;
    }
}
