public class Algebra extends Course
	{
	
		public Algebra(String name, String grade) 
			{
				super(name, grade);
			}
		
		public String getName() 
        		{
        	        	return name;
        		}
		
		public void setName(String name) 
			{
        	        	this.name = name;
			}
		
		public String getGrade() 
        	    	{
        	        	return grade;
        	    	}
		
		public void setGrade(String grade) 
        	    	{
		    		this.grade = grade;
        	    	}

	
	}
