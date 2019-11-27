package encapsulation;

public class employe {
	
	String name;
    String address;
    int contact;
    String email;
    String proof;
    String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProof() {
		return proof;
	}
	public void setProof(String proof) {
		this.proof = proof;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	} 
  /*  void show() {
    	System.out.println("********EMPLOYE DETAILS**********");
		System.out.println(getName());
    	System.out.println(getAddress());
    	System.out.println(getContact());
    	System.out.println(getEmail());
    	System.out.println(getProof());
    	System.out.println(getId());
    	System.out.println("Thanku for registering .Your id is 1...");
    }*/

}
