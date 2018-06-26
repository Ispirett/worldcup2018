package com.ispiretest;
import java.lang.Math;
import java.util.*;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Random;
public class Main {

    private static Object List;



    public static void main(String[] args) {
	// write your code here
    System.out.println("2018 FIFA World Cup squads");
    //System.out.println(args[0]);

    worldCup2018teams.teamsMatches();







    }
    public static class worldCup2018teams {

        public static void teamsMatches () {
            String[] groupA = {"Egypt", "Russia", "Saudi", "Arabia"};
            String[] groupB = {"Iran", "Morocco", "Portugal", "Spain"};
            String[] groupC = {"Australia", "Denmark", "France", "Peru"};
            String[] groupD = {"Argentina", "Croatia", "Iceland", "Nigeria"};
            String[] groupE = {"Brazil", "Costa Rica", "Serbia", "Switzerland"};
            String[] groupF = {"Germany", "Mexico", "South Korea", "Sweden"};
            String[] groupG = {"Belgium", "England", "Panama", "Tunisia"};
            String[] groupH = {"Colombia", "Japan", "Poland", "Senega"};
            //String random = new Random(groupA []) ;

            String randomA = groupA[(int) (Math.random() * groupA.length)];
            String randomAA = groupA[(int) (Math.random() * groupA.length)];
            String randomB = groupB[(int) (Math.random() * groupB.length)];
            String randomBB = groupB[(int) (Math.random() * groupB.length)];
            String randomC = groupC[(int) (Math.random() * groupC.length)];
            String randomCC = groupC[(int) (Math.random() * groupC.length)];
            String randomD = groupD[(int) (Math.random() * groupD.length)];
            String randomDD = groupD[(int) (Math.random() * groupD.length)];


            String randomE = groupE[(int) (Math.random() * groupE.length)];
            String randomEE = groupE[(int) (Math.random() * groupE.length)];
            String randomF = groupF[(int) (Math.random() * groupF.length)];
            String randomFF = groupF[(int) (Math.random() * groupF.length)];
            String randomG = groupG[(int) (Math.random() * groupG.length)];
            String randomGG = groupG[(int) (Math.random() * groupG.length)];
            String randomH = groupH[(int) (Math.random() * groupH.length)];
            String randomHH = groupH[(int) (Math.random() * groupH.length)];

            for (String a : groupA) {
                System.out.println("GROUP A : " + a);
            }
            for (String b : groupB) {
                System.out.println("\rGROUP B : " + b);
            }
            for (String c : groupC) {
                System.out.println("GROUP C : " + c);
            }

            for (String d : groupD) {
                System.out.println("GROUP d : " + d);
            }
            for (String e : groupE) {
                System.out.println("GROUP C : " + e);
            }

            for (String f : groupF) {
                System.out.println("GROUP C : " + f);
            }

            for (String g : groupG) {
                System.out.println("GROUP C : " + g);
            }
            for (String h : groupH) {
                System.out.println("GROUP C : " + h);
            }
           //Quarter-finals
            System.out.println();
            System.out.println("==================================================");
            System.out.println("Quarter-finals");
            System.out.println("==================================================");
            System.out.println();
            winner(randomA,randomAA);
            winner(randomB,randomBB);
            winner(randomC,randomCC);
            winner(randomD,randomDD);
            winner(randomE,randomEE);
            winner(randomF,randomFF);
            winner(randomG,randomGG);
            winner(randomH,randomHH);
          // SEMI-FINALS
           String qFinalA = nextMatch(randomA,randomAA);
           String qFinalB = nextMatch(randomB,randomBB);
           String qFinalC = nextMatch(randomC,randomCC);
           String qFinalD = nextMatch(randomD,randomDD);
           String qFinalE = nextMatch(randomE,randomEE);
           String qFinalF = nextMatch(randomF,randomFF);
           String qFinalG = nextMatch(randomG,randomGG);
           String qFinalH = nextMatch(randomH,randomHH);
           System.out.println();
           System.out.println("==================================================");
           System.out.println("Semi-finals");
           System.out.println("==================================================");
           System.out.println();

           winner(qFinalA,qFinalB);
           winner(qFinalC,qFinalD);
           winner(qFinalE,qFinalF);
           winner(qFinalG,qFinalH);

           // Finals
            String FinalA = nextMatch(qFinalA,qFinalB);
            String FinalB = nextMatch(qFinalC,qFinalD);
            String FinalC = nextMatch(qFinalE,qFinalF);
            String FinalD = nextMatch(qFinalG,qFinalH);

            String finalA = nextMatch(FinalA,FinalB);
            String finalB = nextMatch(FinalC,FinalD);

           // Winner
            winner(finalA,finalB);






            System.out.println();
            System.out.println("==================================================");
            System.out.println("Finals-finals");
            System.out.println("==================================================");
            System.out.println();

            winner(FinalA,FinalB);
            winner(FinalC,FinalD);

            System.out.println();
            System.out.println("==================================================");
            System.out.println("Finals");
            System.out.println("==================================================");
            System.out.println();

            winner(finalA,finalB);
            String winner = nextMatch(finalA,finalB);

            System.out.println();
            System.out.println("==================================================");
            System.out.println("WINNER OF 2018 WORLDCUP");
            System.out.println("==================================================");
            System.out.println();



            System.out.println("CONGRATULATIONS ... "+ winner);



        }


        // deciding winners
        public static void winner (String team, String team2) {
            int win = team.length();
            int win1 = team2.length();

            double winningTeam = win + Math.random() ;
            double winningTeam1 = win1 + Math.random() ;
            if (winningTeam > winningTeam1) {
                System.out.println(team + " " + Math.round(winningTeam  )  + " - " + Math.round(winningTeam1) + " " + team2);
            } else if (winningTeam1 > winningTeam){
                System.out.println(team2 + " " + Math.round(winningTeam1 )  + " - " + Math.round(winningTeam) + " " + team);
            }

            while(winningTeam == winningTeam1){

                if (winningTeam > winningTeam1) {
                    System.out.println(team + " " + Math.round(winningTeam  )  + " - " + Math.round(winningTeam1) + " " + team2);
                } else if (winningTeam1 > winningTeam){
                    System.out.println(team2 + " " + Math.round(winningTeam1 )  + " - " + Math.round(winningTeam) + " " + team);
                }

            }




        }

        // deciding winners
        public static String nextMatch (String team, String team2) {
            int win = team.length();
            int win1 = team2.length();
            String a = "draw";

            double winningTeam = win + Math.random()*71;
            double winningTeam1 = win1 + Math.random()*71;
            if (winningTeam > winningTeam1) {
                return team;
            } else if (winningTeam1 > winningTeam){
                return team2;
            }
             else {
                  return a;
            }

        }



        }

}















