public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   public int [] scores;
   
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int [] s)
   {
      scores = s;
   }
   
   /** returns the average (arithmetic mean) of the values in scores
    *  whose subscripts are between first and last, inclusive
    *  PRECONDITION: 0 <= first <= last < scores.length
    */
   public double average(int first, int last)
   {
      int total = 0;
      for (int i = first; i<=last; i++)
      {
          total+=scores[i];
      }
      return ((total*1.0d)/(last-first+1));
   }
    
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   public boolean hasImproved()
   {
      for (int i = 1; i<scores.length; i++)
      {
          if (scores[i] < scores[i-1]) return false;
      }
      return true;
   }  
   
   /** if the values in scores have imrpoved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {
      if (hasImproved()) return (average(scores.length/2,scores.length-1));
      else return average(0, scores.length-1);
    } 
}