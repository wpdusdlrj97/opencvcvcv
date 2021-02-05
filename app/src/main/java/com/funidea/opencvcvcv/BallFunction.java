package com.funidea.opencvcvcv;

import android.util.Log;

public class BallFunction {

    private static final String TAG = "메서드";

    public void step1(){

        Log.d(TAG, "저글링 개수 : "+BallInformation.ball_count);
        Log.d(TAG, "저글링 배열 : "+String.valueOf(BallInformation.ball_arraylist));

        if(BallInformation.ball_arraylist.size() > 0 && BallInformation.ball_arraylist.get(0) != "down"){
            //첫번째 배열의 시작이 1사분면이 아닐 경우 -> BallInformation.ball_arraylist 초기화
            Log.d(TAG, "공 배열 : 오류 -> 배열 초기화");
            BallInformation.ball_arraylist.clear();

        }else{
            if((BallInformation.ball_position == 1 || BallInformation.ball_position == 4)&& BallInformation.ball_arraylist.size()==0){
                Log.d(TAG, "step1-0단계");
                Log.d(TAG, "공: 아래, 던지기 전");
                BallInformation.ball_arraylist.add("down");
            }else if((BallInformation.ball_position == 1 || BallInformation.ball_position == 4) && BallInformation.ball_arraylist.size()==1) {
                Log.d(TAG, "step1-1단계");
                Log.d(TAG, "공: 아래, 던지기 전");
            }else if((BallInformation.ball_position == 2 || BallInformation.ball_position == 3) &&  BallInformation.ball_arraylist.size()==1 && BallInformation.ball_arraylist.get(0)=="down"){
                Log.d(TAG, "step1-2단계");
                Log.d(TAG, "공: 위로 던진 후 위치인식 X");
                BallInformation.ball_arraylist.add("up");
            }else if((BallInformation.ball_position == 2 || BallInformation.ball_position == 3) && BallInformation.ball_arraylist.size()==2 && BallInformation.ball_arraylist.get(0)=="down" &&
                    BallInformation.ball_arraylist.get(1)=="up"){
                Log.d(TAG, "step1-3단계");
                Log.d(TAG, "공: 위로 던진 후 위치인식 O");
            }else if((BallInformation.ball_position == 1 || BallInformation.ball_position == 4) && BallInformation.ball_arraylist.size()==2){
                Log.d(TAG, "step1-4단계");
                Log.d(TAG, "공: 아래 되돌아온 후 위치인식 X");
                BallInformation.ball_arraylist.add("down");
            }else if((BallInformation.ball_position == 1 || BallInformation.ball_position == 4) && BallInformation.ball_arraylist.size()==3 && BallInformation.ball_arraylist.get(0)=="down" &&
                    BallInformation.ball_arraylist.get(1)=="up" && BallInformation.ball_arraylist.get(2)=="down"){
                Log.d(TAG, "step1-5단계");
                Log.d(TAG, "공: 아래 되돌아온 후 위치인식 O");
                //개수 올리기
                BallInformation.ball_count = BallInformation.ball_count+1;
                BallInformation.ball_arraylist.clear();
            }else{
                BallInformation.ball_arraylist.clear();
            }


        }

    }


    public void step2(){

        Log.d(TAG, "저글링 개수 : "+BallInformation.ball_count);
        Log.d(TAG, "저글링 배열 : "+String.valueOf(BallInformation.ball_arraylist));

        if(BallInformation.ball_arraylist.size() > 0 && BallInformation.ball_arraylist.get(0) != "right"){
            //첫번째 배열의 시작이 1사분면이 아닐 경우 -> BallInformation.ball_arraylist 초기화
            Log.d(TAG, "공 배열 : 오류 -> 배열 초기화");
            BallInformation.ball_arraylist.clear();

        }else{
            if((BallInformation.ball_position == 1 || BallInformation.ball_position == 2)&& BallInformation.ball_arraylist.size()==0){
                Log.d(TAG, "step1-0단계");
                Log.d(TAG, "공: 우측, 던지기 전");
                BallInformation.ball_arraylist.add("right");
            }else if((BallInformation.ball_position == 1 || BallInformation.ball_position == 2) && BallInformation.ball_arraylist.size()==1) {
                Log.d(TAG, "step1-1단계");
                Log.d(TAG, "공: 우측, 던지기 전");
            }else if((BallInformation.ball_position == 3 || BallInformation.ball_position == 4) &&  BallInformation.ball_arraylist.size()==1 && BallInformation.ball_arraylist.get(0)=="right"){
                Log.d(TAG, "step1-2단계");
                Log.d(TAG, "공: 좌측으로 던진 후 위치인식 X");
                BallInformation.ball_arraylist.add("left");
            }else if((BallInformation.ball_position == 3 || BallInformation.ball_position == 4) && BallInformation.ball_arraylist.size()==2 && BallInformation.ball_arraylist.get(0)=="right" &&
                    BallInformation.ball_arraylist.get(1)=="left"){
                Log.d(TAG, "step1-3단계");
                Log.d(TAG, "공: 좌측으로 던진 후 위치인식 O");
            }else if((BallInformation.ball_position == 1 || BallInformation.ball_position == 2) && BallInformation.ball_arraylist.size()==2){
                Log.d(TAG, "step1-4단계");
                Log.d(TAG, "공: 우측 되돌아온 후 위치인식 X");
                BallInformation.ball_arraylist.add("right");
            }else if((BallInformation.ball_position == 1 || BallInformation.ball_position == 2) && BallInformation.ball_arraylist.size()==3 && BallInformation.ball_arraylist.get(0)=="right" &&
                    BallInformation.ball_arraylist.get(1)=="left" && BallInformation.ball_arraylist.get(2)=="right"){
                Log.d(TAG, "step1-5단계");
                Log.d(TAG, "공: 우측 되돌아온 후 위치인식 O");
                //개수 올리기
                BallInformation.ball_count = BallInformation.ball_count+1;
                BallInformation.ball_arraylist.clear();
            }else{
                BallInformation.ball_arraylist.clear();
            }


        }

    }




    public void step3(){

        Log.d(TAG, "저글링 개수 : "+BallInformation.ball_count);
        Log.d(TAG, "저글링 배열 : "+String.valueOf(BallInformation.ball_arraylist));


        if(BallInformation.ball_arraylist.size() > 0 && BallInformation.ball_arraylist.get(0) != "1"){
            //첫번째 배열의 시작이 1사분면이 아닐 경우 -> BallInformation.ball_arraylist 초기화
            Log.d(TAG, "공 배열 : 오류 -> 배열 초기화");
            BallInformation.ball_arraylist.clear();

        }else{
            Log.d(TAG, "공 배열 : 정상 -> 배열 추가");

            if(BallInformation.ball_position == 1 && BallInformation.ball_arraylist.size()==0){
                Log.d(TAG, "step3-0단계");
                Log.d(TAG, "공: 1사분면, 던지기 전");
                BallInformation.ball_arraylist.add("1");
            }else if(BallInformation.ball_position == 1 && BallInformation.ball_arraylist.size()==1) {
                Log.d(TAG, "step3-1단계");
                Log.d(TAG, "공: 1사분면, 던지기 전");
            }else if(BallInformation.ball_position == 2 && BallInformation.ball_arraylist.size()==1 && BallInformation.ball_arraylist.get(0)=="1"){
                Log.d(TAG, "step3-2단계");
                Log.d(TAG, "공: 2사분면, 던진 후, 2사분면 위치인식 X");
                BallInformation.ball_arraylist.add("2");
            }else if(BallInformation.ball_position == 2 && BallInformation.ball_arraylist.size()==2 && BallInformation.ball_arraylist.get(0)=="1" &&
                    BallInformation.ball_arraylist.get(1)=="2"){
                Log.d(TAG, "step3-3단계");
                Log.d(TAG, "공: 2사분면, 던진 후, 2사분면 위치인식 O");
            }else if(BallInformation.ball_position == 3 && BallInformation.ball_arraylist.size()==2){
                Log.d(TAG, "step3-4단계");
                Log.d(TAG, "공: 3사분면, 던진 후, 3사분면 위치인식 X");
                BallInformation.ball_arraylist.add("3");
            }else if(BallInformation.ball_position == 3 && BallInformation.ball_arraylist.size()==3 && BallInformation.ball_arraylist.get(0)=="1" &&
                    BallInformation.ball_arraylist.get(1)=="2" && BallInformation.ball_arraylist.get(2)=="3"){
                Log.d(TAG, "step3-5단계");
                Log.d(TAG, "공: 3사분면, 던진 후, 3사분면 위치인식 O");
            }else if(BallInformation.ball_position == 4 && BallInformation.ball_arraylist.size()==3){
                Log.d(TAG, "step3-6단계");
                Log.d(TAG, "공: 4사분면, 던진 후, 4사분면 위치인식 X");
                BallInformation.ball_arraylist.add("4");
            }else if(BallInformation.ball_position == 4 && BallInformation.ball_arraylist.size()==4 && BallInformation.ball_arraylist.get(0)=="1" &&
                    BallInformation.ball_arraylist.get(1)=="2" && BallInformation.ball_arraylist.get(2)=="3" && BallInformation.ball_arraylist.get(3)=="4"){
                Log.d(TAG, "step3-7단계");
                Log.d(TAG, "공: 4사분면, 던진 후, 4사분면 위치인식 O");
            }else if(BallInformation.ball_position == 1 && BallInformation.ball_arraylist.size()==4){
                Log.d(TAG, "step3-8단계");
                Log.d(TAG, "공: 1사분면, 공 이동 후, 1사분면 위치인식 X");
                BallInformation.ball_arraylist.add("1");
            }else if(BallInformation.ball_position == 1 && BallInformation.ball_arraylist.size()==5 && BallInformation.ball_arraylist.get(0)=="1" &&
                    BallInformation.ball_arraylist.get(1)=="2" && BallInformation.ball_arraylist.get(2)=="3" && BallInformation.ball_arraylist.get(3)=="4" &&
                    BallInformation.ball_arraylist.get(4)=="1"){
                Log.d(TAG, "step3-9단계");
                Log.d(TAG, "공: 1사분면, 공 이동 후, 1사분면 위치인식 O");
                //개수 올리기
                BallInformation.ball_count = BallInformation.ball_count+1;
                BallInformation.ball_arraylist.clear();
            }else{
                //나머지의 경우 공 배열 초기화
                BallInformation.ball_arraylist.clear();
            }
        }



    }

    public void step4(){

        Log.d(TAG, "저글링 개수 : "+BallInformation.ball_count);
        Log.d(TAG, "저글링 배열 : "+String.valueOf(BallInformation.ball_arraylist));

        if(BallInformation.ball_arraylist.size() > 0 && BallInformation.ball_arraylist.get(0) != "1"){
            //첫번째 배열의 시작이 1사분면이 아닐 경우 -> BallInformation.ball_arraylist 초기화
            Log.d(TAG, "공 배열 : 오류 -> 배열 초기화");
            BallInformation.ball_arraylist.clear();

        }else{
            Log.d(TAG, "공 배열 : 정상 -> 배열 추가");
            if(BallInformation.ball_position == 1 && BallInformation.ball_arraylist.size()==0){
                Log.d(TAG, "step4-0단계");
                Log.d(TAG, "공: 1사분면, 던지기 전");
                BallInformation.ball_arraylist.add("1");
            }else if(BallInformation.ball_position == 1 && BallInformation.ball_arraylist.size()==1) {
                Log.d(TAG, "step4-1단계");
                Log.d(TAG, "공: 1사분면, 던지기 전");
            }else if(BallInformation.ball_position == 2 && BallInformation.ball_arraylist.size()==1  && BallInformation.ball_arraylist.get(0)=="1"){
                Log.d(TAG, "step4-2단계");
                Log.d(TAG, "공: 2사분면, 던진 후, 2사분면 위치인식 X");
                BallInformation.ball_arraylist.add("2");
            }else if(BallInformation.ball_position == 2 && BallInformation.ball_arraylist.size()==2 && BallInformation.ball_arraylist.get(0)=="1" &&
                    BallInformation.ball_arraylist.get(1)=="2"){
                Log.d(TAG, "step4-3단계");
                Log.d(TAG, "공: 2사분면, 던진 후, 2사분면 위치인식 O");
            }else if(BallInformation.ball_position == 3 && BallInformation.ball_arraylist.size()==2 ){
                Log.d(TAG, "step4-4단계");
                Log.d(TAG, "공: 3사분면, 던진 후, 3사분면 위치인식 X");
                BallInformation.ball_arraylist.add("3");
            }else if(BallInformation.ball_position == 3 && BallInformation.ball_arraylist.size()==3 && BallInformation.ball_arraylist.get(0)=="1" &&
                    BallInformation.ball_arraylist.get(1)=="2" && BallInformation.ball_arraylist.get(2)=="3"){
                Log.d(TAG, "step4-5단계");
                Log.d(TAG, "공: 3사분면, 던진 후, 3사분면 위치인식 O");
            }else if(BallInformation.ball_position == 4 && BallInformation.ball_arraylist.size()==3){
                Log.d(TAG, "step4-6단계");
                Log.d(TAG, "공: 4사분면, 던진 후, 4사분면 위치인식 X");
                BallInformation.ball_arraylist.add("4");
            }else if(BallInformation.ball_position == 4 && BallInformation.ball_arraylist.size()==4 && BallInformation.ball_arraylist.get(0)=="1" &&
                    BallInformation.ball_arraylist.get(1)=="2" && BallInformation.ball_arraylist.get(2)=="3" && BallInformation.ball_arraylist.get(3)=="4"){
                Log.d(TAG, "step4-7단계");
                Log.d(TAG, "공: 4사분면, 던진 후, 4사분면 위치인식 O");
            }else if(BallInformation.ball_position == 3 && BallInformation.ball_arraylist.size()==4){
                Log.d(TAG, "step4-8단계");
                Log.d(TAG, "공: 3사분면, 던진 후, 3사분면 위치인식 X");
                BallInformation.ball_arraylist.add("3");
            }else if(BallInformation.ball_position == 3 && BallInformation.ball_arraylist.size()==5 && BallInformation.ball_arraylist.get(0)=="1" &&
                    BallInformation.ball_arraylist.get(1)=="2" && BallInformation.ball_arraylist.get(2)=="3" && BallInformation.ball_arraylist.get(3)=="4" &&
                    BallInformation.ball_arraylist.get(4)=="3"){
                Log.d(TAG, "step4-9단계");
                Log.d(TAG, "공: 3사분면, 던진 후, 3사분면 위치인식 O");
            }else if(BallInformation.ball_position == 2 && BallInformation.ball_arraylist.size()==5){
                Log.d(TAG, "step4-10단계");
                Log.d(TAG, "공: 2사분면, 던진 후, 2사분면 위치인식 X");
                BallInformation.ball_arraylist.add("2");
            }else if(BallInformation.ball_position == 2 && BallInformation.ball_arraylist.size()==6 && BallInformation.ball_arraylist.get(0)=="1" &&
                    BallInformation.ball_arraylist.get(1)=="2" && BallInformation.ball_arraylist.get(2)=="3" && BallInformation.ball_arraylist.get(3)=="4" &&
                    BallInformation.ball_arraylist.get(4)=="3" && BallInformation.ball_arraylist.get(5)=="2" ){
                Log.d(TAG, "step4-11단계");
                Log.d(TAG, "공: 2사분면, 던진 후, 2사분면 위치인식 O");
            }else if(BallInformation.ball_position == 1 && BallInformation.ball_arraylist.size()==6){
                Log.d(TAG, "step4-12단계");
                Log.d(TAG, "공: 1사분면, 던진 후, 1사분면 위치인식 X");
                BallInformation.ball_arraylist.add("1");
            }else if(BallInformation.ball_position == 1 && BallInformation.ball_arraylist.size()==7 && BallInformation.ball_arraylist.get(0)=="1" &&
                    BallInformation.ball_arraylist.get(1)=="2" && BallInformation.ball_arraylist.get(2)=="3" && BallInformation.ball_arraylist.get(3)=="4" &&
                    BallInformation.ball_arraylist.get(4)=="3" && BallInformation.ball_arraylist.get(5)=="2" && BallInformation.ball_arraylist.get(6)=="1"){
                Log.d(TAG, "step4-13단계");
                Log.d(TAG, "공: 1사분면, 던진 후, 1사분면 위치인식 O");
                //개수 올리기
                BallInformation.ball_count = BallInformation.ball_count+1;
                BallInformation.ball_arraylist.clear();
            }else{
                //나머지의 경우 공 배열 초기화
                BallInformation.ball_arraylist.clear();
            }

        }



    }
}
