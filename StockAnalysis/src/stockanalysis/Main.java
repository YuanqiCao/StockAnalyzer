/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockanalysis;



import java.util.Arrays;

public class Main extends NewJFrame{
    
    static int userRisk = 0;

            public static void main(String[] args){
                
            }
            
	// write your code here
    }




/*
                double max = 0;
                int[] topFive = new int[5];
                Company[] companies = new Company[10];
                Company[] companiesCopy = companies;

                companies[0] = new Company("Alphabet", 373.19,0,10.51,13.16,2.46);
                companies[1] = new Company("Tesla",145.02,0,-50.12,-19.89,254.64);
                companies[2] = new Company("CitiGroup",145.02,0,1,4,0);
                companies[3] = new Company("Goldman Sachs",145.02,0,1,4,5);
                companies[4] = new Company("Apple",145.02,0,1,4,5);
                companies[5] = new Company("Amazon",145.02,0,1,4,5) ;
                companies[6] = new Company("Coca Cola",7.17,3.41,10.61,7.18,232.22);
                companies[7] = new Company("NVIDIA",115.06,0.6,58.25,36.21,22.75);
                companies[8] = new Company("Exxon Mobil",17.14,4.08,11.21,7.95,21.3);
                companies[9] = new Company("Nike",33.55,1,17.4,5.31,38.83);
                
                
                

                for(int f = 0; f < 5; f++){ //this for loop finds the top five companies based on their net score.
                    int index = 0;

                    for(int i = 0; i < 10; i++){

                        if(companies[i].net() > max){
                                max = companies[i].net();
                                topFive[f]  = i;
                                index = i;


                        }
                    }

                    companies[index].profitMargin = Integer.MIN_VALUE;
                    }
               // for(int f=0; f<10 ; f++) {
                 //   System.out.println(topTen[f]);
               // }
                Company[] companiesFive = new Company[5];
                for (int i = 0; i < 5; i++){

                }
                for (int i = 0; i < 5; i++){
                    companiesFive[i] = Arrays.copyOfRange(companiesCopy, );
                }
                for (int i = 0; i < 5; i++) {
                    switch (topFive[i]){
                        case 0:
                            companiesFive[i] = companiesCopy[0];
                            break;
                        case 1:
                            companiesFive[i] = companiesCopy[1];
                            break;
                        case 2:
                            companiesFive[i] = companiesCopy[2];
                            break;
                        case 3:
                            companiesFive[i] = companiesCopy[3];
                            break;
                        case 4:
                            companiesFive[i] = companiesCopy[4];
                            break;
                        case 5:
                            companiesFive[i] = companiesCopy[5];
                            break;
                        case 6:
                            companiesFive[i] = companiesCopy[6];
                            break;
                        case 7:
                            companiesFive[i] = companiesCopy[7];
                            break;
                        case 8:
                            companiesFive[i] = companiesCopy[8];
                            break;
                        case 9:
                            companiesFive[i] = companiesCopy[9];
                            break;

                    }
                }

                class Rankings {
                    public void RankRange() {
                        int min = 999999999;
                        for(int f = 0; f < 5; f++){ //this for loop finds the top five companies based on their net score.
                            int index = 0;

                            for(int i = 0; i < 5; i++){

                                if(companiesFive[i].range < min){
                                    max = companiesFive[i].range;
                                    topFive[4-f] = i;
                                    index = i;


                                }

                            }

                            companiesFive[index].range = Integer.MAX_VALUE;
                        }
                        topFive
                    }
                }

                public void RankOneRangeOneNet() {

                }
                public void RankOneNetOneSD() {

                }
                public void RankNet() {
                    for(int f = 0; f < 10; f++){ //this for loop finds the top ten companies based on their net score.
                        int index = 0;
                        

                        for(int i = 0; i < 3411; i++){

                            if(companies[i].net() > max){
                                topTen[f]  = i;
                                index = i;


                            }
                        }
                        companies[index].profitMargin = Integer.MIN_VALUE;
                    }

                }


                if (userRisk > 8) {
                    RankSD();
                } else if (userRisk > 6 && userRisk <= 8){
                    RankOneSDOneNet();
                } else if (userRisk >= 4 && userRisk <= 6) {
                    RankOneNetOneSD();
                } else {
                    RankNet();
                }
*/