package ru.netology.sqr;

public class SQRService {

    public int sqrInRange(int bottomBorder, int topBorder) {

        int sqrAmount = 0;

        for (int i = 10; i < 100; i++) {

            if ((i * i) >= bottomBorder && (i * i) <= topBorder) {
                sqrAmount++;

            }
        }


        return sqrAmount;
    }

}
