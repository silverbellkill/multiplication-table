package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        for (int i = 1; i <= 9; i++) { //1~9까지 반복 실행
            System.out.println();

            for (int j = 2; j <= 9; j++) { //1~9까지 반복 실행
                System.out.print(j + "*" + i + "=" + i * j + "\t"); //j값을 먼저 출력 하면 구구단 가로 출력이됨

            }


        }
    }
}
