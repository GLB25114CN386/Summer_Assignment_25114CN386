package Day26;
import java.util.*;
public class Q104 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Quiz Application");
            System.out.println("Rules:");
            System.out.println("1.For every correct answer 1 point is added to your score");
            System.out.println("2.For every incorrect answer 1 point is deducted from your score");
            System.out.println("Final Score will be displayed at the end of quiz");
            System.out.println("Press Y to begin the Quiz");
            char c=sc.next().charAt(0);
            if(c=='Y'||c=='y')
            {
            String ques[]={"Q1.What is the capital of India?","Q2.Which language is primarily used for Android app development?","Q3.Which planet is known as the Red Planet?","Q4.Who is known as the Father of Computers?","Q5.What is the national animal of India?","Q6.Which data type is used to store decimal values in Java?","Q7.How many continents are there on Earth?","Q8.Which keyword is used to create an object in Java?","Q9.What is the largest ocean on Earth?","Q10.Which company developed Java?"};
            String options[][] = {
            {"Mumbai", "Delhi", "Kolkata", "Chennai"},
            {"Java", "HTML", "CSS", "SQL"},
            {"Venus", "Mars", "Jupiter", "Saturn"},
            {"Alan Turing", "Charles Babbage", "Bill Gates", "Steve Jobs"},
            {"Lion", "Tiger", "Elephant", "Peacock"},
            {"int", "char", "double", "boolean"},
            {"5", "6", "7", "8"},
            {"class", "new", "static", "this"},
            {"Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"},
            {"Microsoft", "Apple", "Sun Microsystems", "Google"}
            };
            int answers[] = {2,1,2,2,2,3,3,2,4,3};
            int score=0;
            for(int i=0;i<10;i++)
            {
                System.out.println(ques[i]);
                for(int j=0;j<options[i].length;j++)
                {
                System.out.println((j + 1) + ". " + options[i][j]);
                }
                System.out.print("Enter your answer: ");
                int ans=sc.nextInt();
                    if(answers[i]==ans)
                    {
                        System.out.println("Correct");
                        score++;
                    }
                    else
                    {
                        System.out.println("Incorrect");
                        score--;
                    }
            }
                System.out.println("Final Score = "+score);
            }
                else
                    System.out.println("Invalid Input");
        }
    }
