class Solution {
    public int[] searchRange(int[] a, int target) {
        
    int r[]=new int[2];
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				map.put(i, a[i]);
			}
		}
        if(map.isEmpty())
        {
            r[0]=-1;
            r[1]=-1;
            return r;
        }
		int b[]=new int[map.size()];
		int k=0;
	Set<Map.Entry<Integer,Integer>> lmap=map.entrySet();
	for(Map.Entry<Integer, Integer> data:lmap)
	{
	
		b[k]=data.getKey();
		k++;
	}
    
	r[0]=b[0];
        r[1]=b[b.length-1];
        return r;
		
	}

}