package com.company;

import java.util.Scanner;

public class Main {


    public static int linearFind(int target, int[] data) {
        int count = 0;

        for (int i = 0; i<data.length; i++){
            if (target == data[i]){
                return i;
            }
        }

        return -1;
    }

    public static int binaryFind(int target, int[] data){
        int mid = 0;
        int start = 0;
        int end = data.length;

        while (start != end || data[mid] == target){
            mid = (start - end)/2;

            if (data[mid]<target2){
                start = mid + 1;
            }
            if (target < data[mid]){
                end = mid -1;
            }

        }
        if (data[mid] == target){
            return mid;
        }

        return -1;
    }




    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int searchType = 0;
        int[] data = {13, 13, 18, 19, 23, 38, 57, 70, 79, 88, 89, 94, 102, 108, 122, 125, 127, 177, 180, 201, 210, 221, 226, 226, 234, 237, 247, 293, 295, 297, 303, 317, 320, 339, 343, 373, 375, 378, 378, 380, 403, 405, 407, 408, 412, 440, 466, 479, 485, 486, 493, 504, 509, 525, 537, 564, 565, 570, 578, 581, 584, 589, 605, 611, 617, 621, 650, 665, 669, 692, 696, 714, 742, 756, 756, 763, 766, 776, 780, 789, 817, 857, 881, 882, 883, 885, 897, 898, 906, 909, 911, 916, 929, 929, 939, 941, 958, 985, 988, 994};

        System.out.println("Linear (1) or Binary (2)");
        searchType = user.nextInt();

        System.out.println("What would you like to find? ");
        int target = user.nextInt();

        if (searchType == 1) {
            int linearPos = linearFind(target, data);
            if (linearPos == -1) {
                System.out.println("Item is not in data list");
            } else {
                System.out.println("Item " + target + " is in the data list at location " + linearPos);
            }
        }else{
            int binaryPos = binaryFind(target, data);
            if (binaryPos == -1) {
                System.out.println("Item is not in data list");
            } else {
                System.out.println("Item " + target + " is in the data list at location " + binaryPos);
            }
        }

    }
}
