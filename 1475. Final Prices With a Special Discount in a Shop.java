class Solution {
    public int[] finalPrices(int[] p) {
        for(int i=0;i<p.length;i++)
        {
            for(int j=i+1;j<p.length;j++)
            {
                if(p[i]>=p[j])
                {
                    int x=p[i]-p[j];
                    p[i]=x;
                    break;
                }
            }
        }return p;
        
    }
}