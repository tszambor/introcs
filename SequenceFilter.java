// Exercise 1.5.5

public class SequenceFilter
{
    public static void main(String[] args)
    {
        int topSeq = 0, topCount = 0;
        int curSeq = 0, curCount = 0;
        
        if (!StdIn.isEmpty())
        {
            curSeq = StdIn.readInt();
            curCount++;
            topSeq = curSeq;
            topCount = curCount;
        }
        
        while(!StdIn.isEmpty())
        {
            int curVal = StdIn.readInt();
            
            if (curVal == curSeq)
                curCount++;
            else
            {
                // check if the finalized sequence is not our winner, and create a new one
                if (curCount > topCount)
                {
                    topSeq = curSeq;
                    topCount = curCount;
                }
                else
                {
                    curSeq = curVal;
                    curCount = 1;
                }
            }
        }
        
        StdOut.println("Longest run: " + topCount + " consecutive " + topSeq + "s.");
    }
}           