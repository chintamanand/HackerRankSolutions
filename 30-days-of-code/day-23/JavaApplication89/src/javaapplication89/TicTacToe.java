/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication89;

/**
 *
 * @author mahe
 */
public class TicTacToe {
    protected char[] board;
    protected char aimarker;
    protected char usermarker;
    protected char winner;
    protected char currentmarker;
    
    public TicTacToe(char playerToken,char aimarker){
     this.usermarker=playerToken;
     this.aimarker=aimarker;
     this.winner='-';
     this.board=setboard();
    }
    public static char[] setboard(){
     char[] board=new char[9]; //every time it will set the board -->as it static
     for(int i=0;i<board.length;i++){//length of the board can be set by giving the length of array board.
      board[i]='-';
     }
     return board;
    }
    public boolean  playturn(int spot){
     boolean isvaild = withinRange(spot) && !isspottaken(spot);
      if(isvaild){
       board[spot-1]=currentmarker; //so that it will be pointing to user input
       currentmarker=(currentmarker==usermarker)? aimarker :usermarker;
       } 
      return isvaild;
    }
    //user Entered number should be within range of the array and not a vaild number.
    public boolean withinRange(int num){
     return num>0 && num<board.length+1;
    }
    //If the user enterted spot is taken by AI,then it has to be specified
    public boolean isspottaken(int num){
        return board[num-1]!= '-';
     }
    public void printboard(){ 
        //this will give the output as:
        //| - | - | -
        //------------
        //| - | - | -
        //------------
        //| - | - | -
     for(int i=0;i<board.length;i++){
      if(i%3==0 && i!=0){
        System.out.println();
        System.out.println("------------");
        }
        System.out.println(" | "+board[i]);
         }
        System.out.println();
    }
    public void printindexboard(){
        //THis GUI looks for the user
        //| 1 | 2 | 3
        //------------
        //| 4 | 5 | 6
        //------------
        //| 7 | 8 | 9
        for(int i=0;i<board.length;i++){
     if(i%3==0 && i!=0){
        System.out.println();
        System.out.println("------------");
       }
        System.out.println(" | "+i+1);
              }
        System.out.println();
    }
    public boolean iswinner(){
        //here it check the rightdiagonal ,left diagonal,2ndcolumn and middle value in board
        //not equal to  '-',then its boolean value will be true.
    boolean middleanddiagonal = rightdiag()||leftdiag()||middlecol()||middlerow() &&board[4]!='-'; 
    boolean topandfirst= toprow()||firstcol() &&board[0]!='-';
    boolean bottomanddown=bottomrow() ||thirdcol() &&board[3]!='-';
         if(middleanddiagonal)
         {
          this.winner=board[4];
         }
         else if(topandfirst)
         {
           this.winner=board[0];
         }
         else if(bottomanddown)
         {
            this.winner=board[8];
         }
         
         return middleanddiagonal||topandfirst||bottomanddown;
    }
    
    public boolean firstcol(){
     return board[0]==board[3] &&board[3]==board[6];
    }
    public boolean middlecol(){
     return board[1]==board[4] &&board[4]==board[7];
    }
    public boolean thirdcol(){
     return board[2]==board[5] &&board[5]==board[8];
    }
    
    public boolean toprow(){
     return board[0]==board[1] &&board[1]==board[2];
    }
    public boolean middlerow(){
     return board[3]==board[4] &&board[4]==board[5];
    }
    public boolean bottomrow(){
     return board[6]==board[7] &&board[7]==board[8];
    }
    
    public boolean rightdiag(){
     return board[2]==board[4] &&board[4]==board[6];
    }
    public boolean leftdiag(){
     return board[0]==board[4] &&board[4]==board[8];
    }
    public boolean isboardfailed(){
     for(int i=0;i<board.length;i++){
      if(board[i]=='-'){
          return false;
      }
      
     }
     return true;
    }
    
    public String gameover(){
     boolean someone=iswinner();
     if(someone){
         System.out.println("The winner is :"+winner);
     }
     else if(isboardfailed()){
         System.out.println("The game isOver~!!!");
     }  return "notover";
}
    
    
    
}
