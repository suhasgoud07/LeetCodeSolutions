class Solution {
    public int maxProfit(int[] a) {
       int min = a[0];
        int count=0;
        int r=0;
        int ind1=0;
        int ind2=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                
            if(a[i]<a[j])
            {
                count++;
                ind1=i;
            
                for(int k=ind1;k<a.length;k++)
                {
                    for(int l=ind1+1;l<a.length;l++ )
                    {
                        if(a[k]<a[l])
                        {
                            ind2=l;
                        }break;
                        
                    }
                    break;
                    
                }
                int x=0;
                for(int m=ind1;m<=ind2;m++)
                {
                  x=Math.max(x,a[m]);  
                }
                r=r+(x-a[ind1]);
                
            }break; 
            }
        }
        return r;
        }
    }