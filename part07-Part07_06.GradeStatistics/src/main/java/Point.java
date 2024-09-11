/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dominik
 */
import java.util.ArrayList;
public class Point {
    private ArrayList<Integer> points;
    
    public Point(){
        this.points = new ArrayList<>();
    }
    
    public void addNumber(int number){
        if(number!=-1 && number>=0 && number<=100){
            points.add(number);
            
        }
        
    }
    public double average(){
        double sum=0;
        for(int point : this.points){
            sum+=point;
        }
        return sum/(double) this.points.size();
    }
    public String averagePassing(){
        double sum=0;
        double licznik=0;
        for(int point : this.points){
            if(point>=50){
                sum+=point;
                licznik++;
            }
        }
        
        if(sum==0){
            return "-";
        }
        
        return "" + sum/licznik;
    }
    
    public void printDistribution(){
        int[] grades = {0,0,0,0,0,0};
        for(int point : this.points){
            if(point<50){
                grades[0]++;
            }else if(point<60){
                grades[1]++;
            }else if(point<70){
                grades[2]++;
            }else if(point<80){
                grades[3]++;
            }else if(point<90){
                grades[4]++;
            }else if(point>=90){
                grades[5]++;
            }
        }
        for(int i=grades.length-1; i>=0; i--){
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        
    }
    
    public double passPercentage(){
        double passing=0;
        for(int point : points){
            if(point>=50){
                passing++;
            }
        }
        
        return 100*(passing/points.size());
    }
    
    public void printPoint(){
        for(Integer point : this.points){
            System.out.println(point);
        }
    }
    
    
}
