package encapsulation;

public class emp1 {
	int n;
	String name;
	String add;
	String cont;
	String email;
	String proof;
	public int getN() {
		return n;
		
	}
	public int setN(int n) {
		return this.n=n;
		
		
	}
	public String getName() {
		
		return name;
	}
	public boolean setName(String name) {
		 if (name.matches("^[a-zA-z]+$"))
         {
             this.name=name;
             return true;
         }
         else
         {
             System.out.println("Invalid name");
             return false;
         }
     }
		
	public  boolean setAdd(String add) {
		 if (add.matches("^[a-zA-Z0-9-]+$"))
         {
             this.add=add;
             return true;
         }
         else
         {
             System.out.println("Invalid address");
             return false;
         }
	}
	public String getAdd() {
		return add;
	}
	public boolean setCont(String cont  ) {
		 if (cont.matches("^[0-9]*$"))
         {
             this.cont=cont;
             return true;
         }
         else
         {
             System.out.println("Invalid Contact Number");
             return false;
         }
     }
	public String getCont() {
		return cont;
	}
	
	public String getEmail() {
		return email;
	}
	public boolean setEmail(String email) {
		 if (email.contains("@"))
         {
             this.email=email;
             return true;
         }
         else
         {
             System.out.println("Invalid Email");
             return false;
         }
     }
     
		

	
	public String getProof() {
		return proof;
	}
	public boolean setProof(String proof) {
		
		if (proof.matches("^[a-zA-Z]*$"))
        {
            this.proof=proof;
            return true;
        }
        else
        {
            System.out.println("Invalid proof");
            return false;
        }
    }
		
	
	public String getId() {
		return id;
	}
	public boolean setId(String id) {
		if (proof.matches("^[a-zA-Z]*$"))
        {
            this.id=id;
            return true;
        }
        else
        {
            System.out.println("Invalid proof id");
            return false;
        }
    }

	
	String id;

void show() {
	System.out.println("********EMPLOYE DETAILS**********");
	System.out.println(getName());
	System.out.println(getAdd());
	System.out.println(getCont());
	System.out.println(getEmail());
	System.out.println(getProof());
	System.out.println(getId());
	System.out.println("Thank you for registering .Your id is 1...");

}
}