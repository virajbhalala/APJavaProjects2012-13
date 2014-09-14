import java.util.*;
public class Classroom{
  
ArrayList <Student> dudes; 

//make an instance variable, ArrayList of Students

  //make a new ArrayList that will hold your students
  public Classroom(){
       dudes = new ArrayList <Student>();
    
    
  }
  
  //add the Student to the end of the ArrayList
  public void addStudent(Student temp){
    dudes.add (temp);
    
    
  }
  
  
  //sort the Students by however a student is compared
  //think about making a new ArrayList and walking until
  //you find a student more than YOU, insert there
  //Now make your Roster point to the new ArrayList
  public void sortStudents(){
    int min, temp;
    for(int i = 0;i <dudes.size()-1;i++){
     min= i;
     for(int p = i+1;p<dudes.size(); p++){
      if (dudes.get(p)< dudes.get(i))
        min = p;
     
      temp = dudes.get(min);
      dudes.get(min)=dudes.get(i);
      dudes.get(i) =temp;
     }  
    }
   
    
    
    
  }
  
  //find the class average
  public double getClassAverage(){
    double sum= 0;
    for (int x= 0; x<dudes.size(); x++){
 
      sum = sum + dudes.get(x).getAverage();
    }
    return sum/dudes.size();  
    }
  
  //Give everyone in the class a 100 test grade
  public void giveClassHundred(){
    
    for (int x= 0; x<dudes.size(); x++){
      dudes.get(x).addScore(100);
    }
    
    
  }
  
  
  //return a roster for the class, with the each
  //student's name and each average.  Also, provide
  //the class average
  public String toString(){
    for (int x= 0; x<dudes.size(); x++){
     
    System.out.println ("Name : "+ dudes.get(x).getName());
    System.out.println ("average : "+ dudes.get(x).getAverage());
    System.out.println ("");
  
      
    }
   return "Class Average is : " + getClassAverage();
  }

}