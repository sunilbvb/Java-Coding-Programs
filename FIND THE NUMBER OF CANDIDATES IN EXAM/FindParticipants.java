/*Find number of candidates in the exam							  

 Given the last rank 'L' and number of candidates at the last rank.
 'T',The task is to find the total number of candidates in the exam
*/
class FindParticipants
{
	public static void main(String args[])
	{
		int rank=10;
		int students=2;
		int res=findParticipants(rank,students);
		System.out.println(res);
	}
		static int findParticipants(int rank,int students)
		{
			return rank+students-1;
		}
}