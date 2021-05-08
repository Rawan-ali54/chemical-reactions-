/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chemical_reactions;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author user
 */
public class Chemical_reactions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        new start_page().setVisible(true);
        new User_Data().setVisible(false);
        new  instructions_page().setVisible(false);
        new levels().setVisible(false);
        
    }
    
}
class Player
{
    private  static String name;
    private static String password;
    private  static int Score;
    public String level;
    private static String review;
    public Player(String name,String password)
{
    this.name=name;
    this.password=password;
    Score=0;
    level=null;
    review=null;
}
public String choose_level()
{
    Scanner input=new Scanner(System.in);
    String Level;
    System.out.println("Choose One Level");
    System.out.println("[1]Easy");
    System.out.println("[2]intermediate");
    System.out.println("[3]Hard");
    int choise=input.nextInt();
    if(choise==1)
       level="easy";
    else if(choise==2)
        level= "intermediate";
    else if(choise==3)
        level= "hard";
    
    return level;
}
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }
public void add_review()
{
    Scanner input=new Scanner(System.in);

   System.out.println("Enter Your Review Please  ");
  this.review=input.nextLine();

}
public static void display_data()
{
    System.out.println("Name "+ name);
    System.out.println("Password "+password);
    System.out.println("Score "+Score);
    System.out.println("Review\n"+review);
}
public int Score()
{

boolean Right_Answer=true;
if(Right_Answer)
   Score++;
return Score;

}
}

//class Levels
//   {
//       int easy_level_time=40;
//       int medium_level_time=20;
//       int hard_level_time=10;
//       
//   }
//   class easy extends Levels
//   {
//       
//     public int SP=0;
//     Timer game_timer=new Timer();
//     TimerTask task=new TimerTask()
//   {
//      public void run()
//      {
//        SP++;
//          System.out.println(+SP);
//          if(SP>=easy_level_time)
//          {
//            game_timer.cancel();
//            game_timer.purge();
//              System.out.println("GAME OVER!!!");
//          }
//      }
//   };
//   public void start()
//   {
//      game_timer.scheduleAtFixedRate(task,1000,1000); 
//   }
//   
//   }
// class medium extends Levels
//   {
//       
//     public int SP2=0;
//     Timer game_timer2=new Timer();
//     TimerTask task2=new TimerTask()
//   {
//      public void run()
//      {
//        SP2++;
//          System.out.println(+SP2);
//          if(SP2>=medium_level_time)
//          {
//            game_timer2.cancel();
//            game_timer2.purge();
//              System.out.println("GAME OVER!!!");
//          }
//      }
//   };
//   public void start()
//   {
//      game_timer2.scheduleAtFixedRate(task2,1000,1000); 
//   }
//   
//   }
// class hard extends Levels
//   {
//       
//     public int SP3=0;
//     Timer game_timer3=new Timer();
//     TimerTask task3=new TimerTask()
//   {
//      public void run()
//      {
//        SP3++;
//          System.out.println(+SP3);
//          if(SP3>=hard_level_time)
//          {
//            game_timer3.cancel();
//            game_timer3.purge();
//              System.out.println("GAME OVER!!!");
//          }
//      }
//   };
//   public void start()
//   {
//      game_timer3.scheduleAtFixedRate(task3,1000,1000); 
//   }
//   
//   }