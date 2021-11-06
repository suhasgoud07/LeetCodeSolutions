class Solution {
    public int[] platesBetweenCandles(String s, int[][] b) {
        
    List<Integer> list=new ArrayList<>();
	
		
		char c[]=s.toCharArray();
	int d[]=new int[b.length*b[0].length];
	int k=0;
	int r[]=new int[b.length];
	int l=0;
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[0].length;j++)
		{
		d[k]=b[i][j];
		k++;
		}
	}
	
	for(int p=0;p<d.length;p=p+2)
	{
		int count=0;
		Map<Integer,Character>map=new LinkedHashMap<>();
		for(int h=d[p];h<=d[p+1];h++)
		{
			if(c[h]=='|')
			{
				map.put(h,c[h]);
			}
			
		}
		int f[]=new int[map.size()];
		int n=0;
		Set<Map.Entry<Integer, Character>> lmap=map.entrySet();
		for(Map.Entry<Integer, Character> data:lmap)
		{
			f[n]=data.getKey();n++;
		}
	
		if(f.length>0)
		{
		for(int y=f[0];y<f[f.length-1];y++)
		{
			if(c[y]=='*') {
				count++;
			          }
			
		}
		}
		r[l]=count;
		l++;
		
		
	
	}
	return r;

}
}
