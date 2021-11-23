class Solution {
    public int maxProduct(String[] words) {
       int max=0;
		       
		        for(int i=0;i<words.length;i++)
		        { char c1[]=words[i].toCharArray();
		        Set<Character> set=new HashSet<>();
		        for(Character data:c1)
		        {
		        	set.add(data);
		        }
		        char c[]=new char[set.size()];
		        int k1=0;
		        for(Character data1:set)
		        {
		        	c[k1]=data1;
		        	k1++;
		        }
		        
		        
		            for(int j=i+1;j<words.length;j++)
		            {int count=0;
		              int rear=0;
		               
		                for(int k=0;k<c.length;k++)
		                {
		                    
		                    String g=Character.toString(c[k]);
		                    if(words[j].contains(g))
		                    {
		                       rear=15;break;
		                    }
		                    count++;
		                }
		            
		             if(count==c.length&&rear==0)
		             {
		               max=Math.max(max,words[i].length()*words[j].length());
		              
		                 
		             }
		            }
		        }
		       return max;
		        
		    }
		}
