package com.ds.recursion.maze;

import java.util.ArrayList;
import java.util.List;

public class ReachToDestination {

  public static void main(String[] args) {

    int rows=3;
    int colum=3;//columns

//    int count = countDestination(rows-1,colum-1);// because array index starts at 0
//
//    System.out.println(count);

//    List<String> destinationPaths = destinationPath("",rows-1,colum-1);
//
//    destinationPaths.stream().forEach(System.out::println);


    List<String> destinationPathWithDiagonal = destinationPathWithDiagonal("",rows-1,colum-1);

    destinationPathWithDiagonal.stream().forEach(System.out::println);
  }

  /*
   Question was we are given n*n matrix Ex: 3*3 matrix
   The person stands at (0,0) we need to reach last place (3*3)
   does how many ways we can reach to destination

   source was =(0,0) destination was (3,3)
   how many ways we can reach to (0,0) to (3,3).
   below question was print the path also
   We have only option either we can move down or right
   */


  public static int countDestination(int row,int column)
  {
    if(row == 0 || column ==0)
    {
      return 1;
    }

    int left = countDestination(row-1,column);
    int right = countDestination(row,column-1);

    return left+right;
  }

  public static List<String> destinationPath(String processed, int row, int column) {
    if (row == 0 && column == 0) {
      List<String> result = new ArrayList<>();
      result.add(processed);
      return result;
    }

    List<String> result = new ArrayList<>();
    if(row>0)
    {
      List<String> left = destinationPath(processed + "D", row - 1, column);
       result.addAll(left);
    }

   if(column>0)
   {
     List<String> right = destinationPath(processed + "R", row, column - 1);
     result.addAll(right);
   }

    return result;
  }

  // we can also have option move diagonally
  public static List<String> destinationPathWithDiagonal(String processed, int row, int column) {
    if (row == 0 && column == 0) {
      List<String> result = new ArrayList<>();
      result.add(processed);
      return result;
    }

    List<String> result = new ArrayList<>();
    if(row>0)
    {
      List<String> left = destinationPathWithDiagonal(processed + "V", row - 1, column);
      result.addAll(left);
    }

    if(column>0)
    {
      List<String> right = destinationPathWithDiagonal(processed + "H", row, column - 1);
      result.addAll(right);
    }

    if(row>0 && column>0)
    {
      List<String> diagonal = destinationPathWithDiagonal(processed + "D", row-1, column - 1);
      result.addAll(diagonal);
    }

    return result;
  }

}
